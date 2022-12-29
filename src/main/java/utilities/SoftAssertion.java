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

	  private Map<String, String> getExpectedAndActualValuesMap(IAssert<?> a){
		  Map<String, String> values = new HashMap<>();

		  values.put("Expected", a.getExpected().toString());
		  values.put("Actual", a.getActual().toString());

		  return values;
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

	  private void printValues(IAssert<?> a, Status status, String statement){

		  String expectedValue = a.getExpected().toString();
		  String actualValue = a.getActual().toString();

		  if(expectedValue !=null && !expectedValue.equals("true") && !expectedValue.equals("false")
		  && actualValue != null && !actualValue.equals("true") && !actualValue.equals("false")){

			  extentTest.log(status, String.format("%s <br/>" +
					  "Expected : %s <br/> Actual : %s", statement, expectedValue, actualValue));
		  }else{

			  extentTest.log(status, statement);
		  }
	  }

	  @Override
	  protected void doAssert(IAssert<?> a) {

		  String verificationStatement = "Verify " + a.getMessage();

		  LogUtility.logInfo(verificationStatement);

		  onBeforeAssert(a);

		  String statement = String.format("Test Step: Verify %s <br/> Expected result: %s", a.getMessage(), a.getMessage());

		  try {
			  a.doAssert();
			  onAssertSuccess(a);
		      
			  LogUtility.logInfo("Result: Passed");
			  printValues(a, Status.PASS, statement);

		  } catch (AssertionError ex) {
			  onAssertFailure(a, ex);
			  LogUtility.logError(ExceptionUtils.getStackTrace(ex));
			  LogUtility.logError("Result: Failed");
			  printValues(getExpectedAndActualValuesMap(a));
			  printValues(a, Status.FAIL, statement);

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