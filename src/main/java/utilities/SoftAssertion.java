package utilities;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;
import org.testng.collections.Maps;
import utilities.reports.ExtentTestManager;

import java.util.HashMap;
import java.util.Map;

public class SoftAssertion extends SoftAssert{
	
	  // LinkedHashMap to preserve the order
	  private final Map<AssertionError, IAssert<?>> mErrors = Maps.newLinkedHashMap();
	  private static final String DEFAULT_SOFT_ASSERT_MESSAGE = "";

	  ExtentTest extentTest = ExtentTestManager.getTest();

	  private void printExpectedAndActual(IAssert<?> a){
		  Map<String, String> values = new HashMap<>();
		  
		  values.put("Expected", a.getExpected().toString());
		  values.put("Actual", a.getActual().toString());

		  printValues(values);
	  }
	  
	  String message;
	  
	  private void printValues(Map<String, String> values){
		  for(Map.Entry<String, String> entryMap : values.entrySet()){
			  
			  String value = entryMap.getValue();
			  
			  if(value != null && !value.equals("true") && !value.equals("false")){
				  
				  message = String.format("%s : %s", entryMap.getKey(), entryMap.getValue());

				  LogUtility.logError(message);
			  }
		  }
	  }

	  @Override
	  protected void doAssert(IAssert<?> a) {

		  String verificationStatement = "Verify " + a.getMessage();

		  LogUtility.logInfo(verificationStatement);

		  onBeforeAssert(a);
		  
		  try {
			  a.doAssert();
			  onAssertSuccess(a);
		      
			  LogUtility.logInfo("Result: Passed");
			  extentTest.log(Status.PASS, String.format("Test Step: %s <br/> Expected result: %s", verificationStatement, a.getMessage()));

		  } catch (AssertionError ex) {
			  onAssertFailure(a, ex);
			  LogUtility.logError(ExceptionUtils.getStackTrace(ex));
			  LogUtility.logError("Result: Failed");
			  printExpectedAndActual(a);

			  mErrors.put(ex, a);
	    
		  } finally {
			  onAfterAssert(a);
		  }
	  }

	  @Override
	  public void assertAll() {
		  assertAll(null);
	  }

	  @Override
	  public void assertAll(String message) {
		  if (!mErrors.isEmpty()) {
			  StringBuilder sb = new StringBuilder(null == message ? DEFAULT_SOFT_ASSERT_MESSAGE : message);
			  boolean first = true;
			  
			  for (AssertionError error : mErrors.keySet()) {
				  if (first) {
					  first = false;
					  } else {
						  	sb.append(",");
						  }
				  sb.append("\n\t");
				  sb.append(getErrorDetails(error));
			  }throw new AssertionError(sb.toString());
		  }
	  }
}