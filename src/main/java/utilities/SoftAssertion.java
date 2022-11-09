package utilities;

import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;
import org.testng.collections.Maps;

public class SoftAssertion extends SoftAssert{
	
	  // LinkedHashMap to preserve the order
	  private final Map<AssertionError, IAssert<?>> m_errors = Maps.newLinkedHashMap();
	  private static final String DEFAULT_SOFT_ASSERT_MESSAGE = "Meh";

	  @Override
	  protected void doAssert(IAssert<?> a) {
		  System.out.println("Verify: " + a.getMessage());
		  
	    onBeforeAssert(a);
	    try {
	      a.doAssert();
	      onAssertSuccess(a);
	      System.out.println("Result: Passed");
	      System.out.println("=========================================");
	    } catch (AssertionError ex) {
	      onAssertFailure(a, ex);
	      System.out.println(ExceptionUtils.getStackTrace(ex));
	      System.out.println("Result: Failed");
	      System.out.println("=========================================");
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
