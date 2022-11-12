package homepage;

import org.testng.annotations.Test;

import pages.HomePage;
import tests.BaseTest;
import utilities.Control;
import utilities.Listener;

public class TestHomePageHeader extends BaseTest{

	HomePage homePage;

	Control control;
	
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

		homePage = new HomePage(Listener.getDriver());

		setSoftAssertion(Listener.getAssertion());

		verifyElementIsDisplayed(homePage.getHeader());

		verifyElementIsDisplayed(homePage.getHomeLogo());

		verifyElementIsDisplayed(homePage.getTutorialsButton());

		verifyElementIsDisplayed(homePage.getTutorialsCaretDownButton());
	
		verifyElementIsDisplayed(homePage.getReferencesButton());

		verifyElementIsDisplayed(homePage.getReferencesCaretDownButton());

		verifyElementIsDisplayed(homePage.getExercisesButton());

		verifyElementIsDisplayed(homePage.getExercisesDownButton());
	
		verifyElementIsDisplayed(homePage.getVideosButton());

		verifyElementIsDisplayed(homePage.getThemeToggle());
	
		verifyElementIsDisplayed(homePage.getTranslateButton());
	
		verifyElementIsDisplayed(homePage.getSearchButton());
	
		verifyElementIsDisplayed(homePage.getUpgradeButton());
		
		verifyElementIsDisplayed(homePage.getCertifiedButton());
		
		verifyElementIsDisplayed(homePage.getFreeWebsiteButton());
		
		verifyElementIsDisplayed(homePage.getLoginButton());
		
		assertAll();
		
	}
	
}
