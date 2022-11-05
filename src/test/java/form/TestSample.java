package form;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.Listener;

public class TestSample {

	@Test
	private void sampleTestMethod(){
		
		HomePage homePage = new HomePage(Listener.getDriver());
		
		Assert.assertTrue(homePage.getHomeLogo().isDisplayed());
		
	}
	
}
