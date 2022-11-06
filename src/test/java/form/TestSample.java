package form;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import utilities.Listener;

public class TestSample {

	@Test(testName = "Sample test name")
	private void sampleTestMethod(){
		
		HomePage homePage = new HomePage(Listener.getDriver());
		
		SoftAssert assert1 = new SoftAssert();
		
		assert1.assertTrue(exceptionHandler(homePage.getHomeLogo()));
		
		System.out.println("Passed 1");
		
		assert1.assertTrue(exceptionHandler(homePage.getHomeLogo2()));
		
		System.out.println("Failed 2");
		
		assert1.assertTrue(exceptionHandler(homePage.getHomeLogo()));
		
		System.out.println("Passed 3");
		
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

