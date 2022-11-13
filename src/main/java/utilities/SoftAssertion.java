package utilities;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;
import org.testng.collections.Maps;

public class SoftAssertion extends SoftAssert{
	
	  // LinkedHashMap to preserve the order
	  private final Map<AssertionError, IAssert<?>> m_errors = Maps.newLinkedHashMap();
	  private static final String DEFAULT_SOFT_ASSERT_MESSAGE = "Meh";

	  private void printExpectedAndActual(IAssert<?> a){
	
		  Map<String, String> values = new HashMap<String, String>();
		  
		  values.put("Expected", a.getExpected().toString());
		  values.put("Actual", a.getActual().toString());
		  
		  printValues(values);
		  
	  }
	  
	  private void printValues(Map<String, String> values){
		  
		  for(Map.Entry<String, String> entryMap : values.entrySet()){
			  
			  String value = entryMap.getValue();
			  
			  if(value != null && !value.equals("true") && !value.equals("false")){
				  
				  System.out.println(String.format("%s : %s", entryMap.getKey(), entryMap.getValue()));
			  
			  }

		  }
		  
	  }

	  @Override
	  protected void doAssert(IAssert<?> a) {
		  System.out.println("Verify: " + a.getMessage());
		  
	    onBeforeAssert(a);
	    try {
		      a.doAssert();
		      onAssertSuccess(a);
		      System.out.println("Result: Passed\n");
		      System.out.println("===========================================================================================");
		     
	      
	    } catch (AssertionError ex) {
	      
		    	onAssertFailure(a, ex);
			    System.out.println(ExceptionUtils.getStackTrace(ex));
			    System.out.println("Result: Failedn\n");
			    printExpectedAndActual(a);
			    System.out.println("===========================================================================================");
			    m_errors.put(ex, a);
	    
	    } finally {
	      onAfterAssert(a);
	    }
	  }

	  public void assertAll() {
	    assertAll(null);
	  }

	  public void assertAll(String message) {
	    if (!m_errors.isEmpty()) {
	      StringBuilder sb = new StringBuilder(null == message ? DEFAULT_SOFT_ASSERT_MESSAGE : message);
	      boolean first = true;
	      for (AssertionError error : m_errors.keySet()) {
	        if (first) {
	          first = false;
	        } else {
	          sb.append(",");
	        }
	        sb.append("\n\t");
	        sb.append(getErrorDetails(error));
	      }
	      throw new AssertionError(sb.toString());
	    }
	  }

}
