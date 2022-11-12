package homepage;

import org.testng.annotations.Test;

import pages.HomePage;
import tests.BaseTest;
import utilities.Control;
import utilities.Listener;

public class TestSample extends BaseTest{

	HomePage homePage;

	Control control;
	
	@Test(testName = "Verify Main page contents", priority = 2)
	private void testMainPageContents(){

		homePage = new HomePage(Listener.getDriver());
		
		setSoftAssertion(Listener.getAssertion());
		
		verifyElementIsDisplayed(homePage.getMainContent());
		
		verifyTextIsTheSame(homePage.getHeaderTextInMainContent(), "Learn to Code", "Header");
	
		verifyTextIsTheSame(homePage.getSubheaderTextInMainContent(), "With the world's largest web developer site.", "Subheader");
	
		verifyElementIsDisplayed(homePage.getSearchbarField());
	
		verifyTextIsTheSame(homePage.getSearchbarfieldPlaceholder(), "Search our tutorials, e.g. HTML", "Search field placeholder");
	
		verifyElementIsDisplayed(homePage.getSearchbarButton());

		verifyElementIsDisplayed(homePage.getWhereToBeginLink());
		
		assertAll();
	}
	
	@Test(testName = "Verify Home Page sections", priority = 3)
	private void sampleTestMethod(){

		setSoftAssertion(Listener.getAssertion());
		
		control = new Control(Listener.getDriver());
		
		control.scrollToElement(homePage.getFooter());

		verifyElementIsDisplayed(homePage.getFooter());
		
		control.scrollToElement(homePage.getHeader());
		
		assertAll();
		
	}

}

