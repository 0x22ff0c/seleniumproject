package form;

import org.testng.annotations.Test;

import pages.HomePage;
import tests.BaseTest;
import utilities.Control;
import utilities.Listener;
import utilities.SoftAssertion;

public class TestSample extends BaseTest{

	@Test(testName = "Verify Home Page elements")
	private void sampleTestMethod(){
		
		HomePage homePage = new HomePage(Listener.getDriver());

		SoftAssertion assert1 = Listener.getAssertion();
		
		assert1.assertTrue(exceptionHandler(homePage.getHeader()), "Header is displayed");

		assert1.assertTrue(exceptionHandler(homePage.getHomeLogo()), "Home logo is displayed");
		
		assert1.assertTrue(exceptionHandler(homePage.getMainContent()), "Main content is displayed");
		
		Control control = new Control(Listener.getDriver());
		
		control.scrollToElement(homePage.getFooter());

		assert1.assertTrue(exceptionHandler(homePage.getFooter()), "Footer is displayed");
		
		control.scrollToElement(homePage.getHeader());
		
		assert1.assertAll();
		
	}

}

