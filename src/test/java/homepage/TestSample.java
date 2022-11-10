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
	
		setSoftAssertion(Listener.getAssertion());
		
		verifyElementIsDisplayed(homePage.getMainContent(), "Main content is displayed");
		
		verifyTextIsTheSame(homePage.getHeaderTextInMainContent(), "Learn to Code", "Header is displayed");
	
		verifyTextIsTheSame(homePage.getSubheaderTextInMainContent(), "With the world's largest web developer site.", "Subheader is displayed");
	
		verifyElementIsDisplayed(homePage.getSearchbarField(), "Search field is displayed");
	
		verifyTextIsTheSame(homePage.getSearchbarfieldPlaceholder(), "Search our tutorials, e.g. HTML", "Search field placeholder is displayed");
	
		verifyElementIsDisplayed(homePage.getSearchbarButton(), "Search field button is displayed");
		
		verifyElementIsDisplayed(homePage.getWhereToBeginLink(), "\"Not Sure Where To Begin?\" link is displayed");
		
		assertAll();
	}
	
	@Test(testName = "Verify Home Page sections", priority = 3)
	private void sampleTestMethod(){

		setSoftAssertion(Listener.getAssertion());
		
		control = new Control(Listener.getDriver());
		
		control.scrollToElement(homePage.getFooter());

		verifyElementIsDisplayed(homePage.getFooter(), "Footer is displayed");
		
		control.scrollToElement(homePage.getHeader());
		
		assertAll();
		
	}

}

