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

		verifyElementIsDisplayed(homePage.getHeader(), "Header");
		
		verifyElementIsDisplayed(homePage.getHomeLogo(), "Home logo");

		verifyButtonIsDisplayed(homePage.getTutorialsButton(), "Tutorials");
	
		verifyButtonIsDisplayed(homePage.getTutorialsCaretDownButton(), "Tutorials caret");

		verifyButtonIsDisplayed(homePage.getReferencesButton(), "References");

		verifyButtonIsDisplayed(homePage.getReferencesCaretDownButton(), "References caret");
	
		verifyButtonIsDisplayed(homePage.getExercisesButton(), "Exercises");
		
		verifyButtonIsDisplayed(homePage.getExercisesDownButton(), "Excercises caret");
		
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
	
}
