package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.header.HomePageHeader;
import pages.homepage.header.HomePageMenuItems;
import tests.BaseTest;
import utilities.Listener;

public class TestHomePageHeader {

	HomePageMenuItems homePageMenuItems;
	
	BaseTest baseTest;
	
	WebDriver driver;

	@BeforeClass
	private void setup(){

		driver = Listener.getDriver();
		
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

		HomePageHeader homePageHeader = new HomePageHeader(driver);
		
		baseTest = new BaseTest(homePageHeader);
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getHeader());

		baseTest.verifyElementIsDisplayed(homePageHeader.getHomeLogo());

		baseTest.verifyElementIsDisplayed(homePageHeader.getTutorialsButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getTutorialsCaretButton());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getReferencesButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getReferencesCaretButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getExercisesButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getExercisesCaretButton());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getVideosButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getThemeToggle());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getTranslateButton());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getSearchButton());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getUpgradeButton());
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getCertifiedButton());
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getFreeWebsiteButton());
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getLoginButton());
		
		baseTest.assertAll();
		
	}
	
	private void verifyCategoryItems(String categoryName, String[] categoryItems){
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsMenuCategoryName(categoryName));

		for(String categoryItem : categoryItems){
			
			baseTest.verifyElementIsDisplayed(homePageMenuItems.getCategoryItem(categoryName, categoryItem));
			
		}
		
	}

	@Test(testName = "Verify Tutorial menu items", priority = 2)
	private void testTutorialMenuIems(){

		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickTutorialsButton();

		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsMenuContainer());

		String categoryName = "HTML and CSS";

		String[] categoryItems = new String[]{"Learn HTML", "Learn CSS", "Learn RWD", "Learn Bootstrap", "Learn W3.CSS", "Learn Colors", 
				"Learn Icons", "Learn Graphics", "Learn SVG", "Learn Canvas", "Learn How To", "Learn Sass"};
		
		verifyCategoryItems(categoryName, categoryItems);
		
		categoryName = "JavaScript";

		categoryItems = new String[]{"Learn JavaScript", "Learn jQuery", "Learn React", "Learn AngularJS", "Learn JSON",
				"Learn AJAX", "Learn AppML", "Learn W3.JS"};
		
		verifyCategoryItems(categoryName, categoryItems);
				
		categoryName = "Programming";
		
		categoryItems = new String[]{"Learn Python", "Learn Java", "Learn C", "Learn C++", "Learn C#", "Learn R", 
				"Learn Kotlin", "Learn Go", "Learn Django", "Learn TypeScript"};
		
		verifyCategoryItems(categoryName, categoryItems);
		
		categoryName = "Server Side";
		
		categoryItems = new String[]{"Learn SQL", "Learn MySQL", "Learn PHP", "Learn ASP", "Learn Node.js",
				"Learn Raspberry Pi", "Learn Git", "Learn MongoDB", "Learn AWS Cloud"};
		
		verifyCategoryItems(categoryName, categoryItems);
		
		categoryName = "Web Building";
		
		categoryItems = new String[] {"Create a Website ", "Where To Start", "Web Templates", "Web Statistics", "Web Certificates",
				"Web Development", "Code Editor", "Test Your Typing Speed", "Play a Code Game", "Cyber Security", "Accessibility", "Join our Newsletter"};
		
		verifyCategoryItems(categoryName, categoryItems);
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsCaretButton());

		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsCloseButton());
		
		homePageMenuItems.clickTutorialsCloseButton();
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify header menu items", priority =  3)
	private void testHeaderMenuItems(){

		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickReferencesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesCaretButton());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesCloseButton());
		
		homePageMenuItems.clickReferencesCloseButton();
		
		homePageMenuItems.clickExercisesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesCaretButton());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesCloseButton());
		
		homePageMenuItems.clickExercisesCloseButton();
		
		baseTest.assertAll();
		
	}
	
}