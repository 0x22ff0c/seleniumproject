package form;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.Listener;
import utilities.SoftAssertion;

public class TestSample {

	@Test(testName = "Sample test name")
	private void sampleTestMethod(){
		
		HomePage homePage = new HomePage(Listener.getDriver());

		SoftAssertion assert1 = Listener.getAssertion();
		
		assert1.assertTrue(exceptionHandler(homePage.getHomeLogo()), "Home logo is displayed");

		assert1.assertTrue(exceptionHandler(homePage.getHomeLogo2()), "Home logo is displayed");

		assert1.assertTrue(exceptionHandler(homePage.getHomeLogo()), "Home logo is displayed");

		assert1.assertAll();
		
	}

	private boolean exceptionHandler(WebElement element){
		
		boolean defaultValue = false;
		
		if(element == null){
			
			System.out.println("Unable to locate element therefore element is not displayed.");
			
		}else {
			defaultValue = element.isDisplayed();
		}
		
		return defaultValue;
		
	}

}

