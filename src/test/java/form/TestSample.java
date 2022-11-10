package form;

import org.testng.annotations.Test;

import pages.HomePage;
import tests.BaseTest;
import utilities.Control;
import utilities.Listener;

public class TestSample extends BaseTest{

	HomePage homePage;

	Control control;

	@Test(testName = "Verify Home page header elements", priority =  1)
	private void testHomePageHeaderElements(){

		homePage = new HomePage(Listener.getDriver());

		setSoftAssertion(Listener.getAssertion());

		verifyElementIsDisplayed(homePage.getHeader(), "Header is displayed");
		
		verifyElementIsDisplayed(homePage.getHomeLogo(), "Home logo is displayed");

		verifyButtonIsDisplayed(homePage.getTutorialsButton(), "Tutorials");
	
		verifyButtonIsDisplayed(homePage.getTutorialsCaretDownButton(), "Tutorials caret");

		verifyButtonIsDisplayed(homePage.getReferencesButton(), "References");

		verifyButtonIsDisplayed(homePage.getReferencesCaretDownButton(), "References caret");
	
		verifyButtonIsDisplayed(homePage.getExcercisesButton(), "Exercises");
		
		verifyButtonIsDisplayed(homePage.getExcercisesDownButton(), "Excercises caret");
		
		verifyButtonIsDisplayed(homePage.getVideosButton(), "Videos");
		
		verifyButtonIsDisplayed(homePage.getThemeToggle(), "Theme toggle");
		
		verifyButtonIsDisplayed(homePage.getTranslateButton(), "Language translate");
		
		verifyButtonIsDisplayed(homePage.getSearchButton(), "Search");

		verifyButtonIsDisplayed(homePage.getUpgradeButton(), "Upgrade");

		verifyButtonIsDisplayed(homePage.getCertifiedButton(), "Certified");
		
		verifyButtonIsDisplayed(homePage.getFreeWebsiteButton(), "Free website");
		
		verifyButtonIsDisplayed(homePage.getLoginButton(), "Login");
		
		assertAll();
		
	}
	
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
	
	@Test(testName = "Verify Home Page elements", priority = 3)
	private void sampleTestMethod(){

		setSoftAssertion(Listener.getAssertion());
		
		control = new Control(Listener.getDriver());
		
		control.scrollToElement(homePage.getFooter());

		verifyElementIsDisplayed(homePage.getFooter(), "Footer is displayed");
		
		control.scrollToElement(homePage.getHeader());
		
		assertAll();
		
	}

}

