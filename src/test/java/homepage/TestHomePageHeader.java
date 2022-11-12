package homepage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.HomePageHeader;
import tests.BaseTest;
import utilities.Control;
import utilities.Listener;

public class TestHomePageHeader {

	HomePageHeader homePage;

	Control control;
	
	BaseTest baseTest;

	@BeforeClass
	private void setup(){

		baseTest = new BaseTest();
		
		homePage = new HomePageHeader(Listener.getDriver(), baseTest);
		
	}
	
	/**
	 * Verifies the elements in the header.
	 * 
	 * <ul>
	 * 	<li>Header container</li>
	 * 	<li>Home logo</li>
	 * 	<li>Tutorials button</li>
	 * 	<li>Tutorials caret button</li>
	 * 	<li>References button</li>
	 * 	<li>References caret button</li>
	 * 	<li>Exercises button</li>
	 * 	<li>Exercises caret button</li>
	 * 	<li>Videos button</li>
	 * 	<li>Theme toggle button</li>
	 * 	<li>Translate button</li>
	 * 	<li>Search button</li>
	 * 	<li>Upgrade button</li>
	 * 	<li>Certified button</li>
	 * 	<li>Free website button</li>
	 * 	<li>Login button</li>
	 * </ul>
	 */
	@Test(testName = "Verify Home page header elements", priority =  1)
	private void testHomePageHeaderElements(){

		baseTest.setSoftAssertion(Listener.getAssertion());
		
		baseTest.verifyElementIsDisplayed(homePage.getHeader());

		baseTest.verifyElementIsDisplayed(homePage.getHomeLogo());

		baseTest.verifyElementIsDisplayed(homePage.getTutorialsButton());

		baseTest.verifyElementIsDisplayed(homePage.getTutorialsCaretDownButton());
	
		baseTest.verifyElementIsDisplayed(homePage.getReferencesButton());

		baseTest.verifyElementIsDisplayed(homePage.getReferencesCaretDownButton());

		baseTest.verifyElementIsDisplayed(homePage.getExercisesButton());

		baseTest.verifyElementIsDisplayed(homePage.getExercisesDownButton());
	
		baseTest.verifyElementIsDisplayed(homePage.getVideosButton());

		baseTest.verifyElementIsDisplayed(homePage.getThemeToggle());
	
		baseTest.verifyElementIsDisplayed(homePage.getTranslateButton());
	
		baseTest.verifyElementIsDisplayed(homePage.getSearchButton());
	
		baseTest.verifyElementIsDisplayed(homePage.getUpgradeButton());
		
		baseTest.verifyElementIsDisplayed(homePage.getCertifiedButton());
		
		baseTest.verifyElementIsDisplayed(homePage.getFreeWebsiteButton());
		
		baseTest.verifyElementIsDisplayed(homePage.getLoginButton());
		
		baseTest.assertAll();
		
	}
	
}
