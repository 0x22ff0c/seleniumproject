package form;

import org.testng.annotations.Test;

import pages.HomePage;
import tests.BaseTest;
import utilities.Control;
import utilities.Listener;
import utilities.SoftAssertion;

public class TestSample extends BaseTest{

	HomePage homePage;
	
	SoftAssertion assert1;

	@Test(testName = "Verify Home Page elements")
	private void sampleTestMethod(){
		
		homePage = new HomePage(Listener.getDriver());
		
		assert1 =  Listener.getAssertion();
		
		assert1.assertTrue(exceptionHandler(homePage.getHeader()), "Header is displayed");

		assert1.assertTrue(exceptionHandler(homePage.getHomeLogo()), "Home logo is displayed");
		
		assert1.assertTrue(exceptionHandler(homePage.getMainContent()), "Main content is displayed");
		
		Control control = new Control(Listener.getDriver());
		
		control.scrollToElement(homePage.getFooter());

		assert1.assertTrue(exceptionHandler(homePage.getFooter()), "Footer is displayed");
		
		control.scrollToElement(homePage.getHeader());
		
		assert1.assertAll();
		
	}
	
	@Test(testName = "Verify Home Page header contents")
	private void testHeaderContents(){
		
		//Testing of Main content
		assert1.assertEquals(homePage.getHeaderTextInMainContent(), "Learn to Code", "Header is displayed");
		
		assert1.assertEquals(homePage.getSubheaderTextInMainContent(), "With the world's largest web developer site.", "Subheaer is displayed");
		
		assert1.assertTrue(exceptionHandler(homePage.getSearchbarField()), "Search field is displayed");
		
		assert1.assertEquals(homePage.getSearchbarfieldPlaceholder(), "Search our tutorials, e.g. HTML", "Search field placeholder is displayed");
		
		assert1.assertTrue(exceptionHandler(homePage.getSearchbarButton()), "Search field button is displayed");
		
		assert1.assertTrue(exceptionHandler(homePage.getWhereToBeginLink()), "\"Not Sure Where To Begin?\" link is displayed");
		
		assert1.assertAll();
	}

}

