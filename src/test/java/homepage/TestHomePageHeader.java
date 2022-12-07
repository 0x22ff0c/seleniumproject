package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import enums.homepage.header.ExerciseHeaderEnum;
import enums.homepage.header.ReferenceHeaderEnum;
import enums.homepage.header.TutorialsHeaderEnum;
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
	
	@Test(testName = "Verify Home page header elements", priority =  1)
	private void testHomePageHeaderElements(){

		HomePageHeader homePageHeader = new HomePageHeader(driver);
		
		baseTest = new BaseTest(homePageHeader);
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getHeader());

		baseTest.verifyElementIsDisplayed(homePageHeader.getHomeLogo());

		baseTest.verifyButtonIsDisplayed(homePageHeader.getTutorialsButton());

		baseTest.verifyButtonIsDisplayed(homePageHeader.getTutorialsCaretButton());
	
		baseTest.verifyButtonIsDisplayed(homePageHeader.getReferencesButton());

		baseTest.verifyButtonIsDisplayed(homePageHeader.getReferencesCaretButton());

		baseTest.verifyButtonIsDisplayed(homePageHeader.getExercisesButton());

		baseTest.verifyButtonIsDisplayed(homePageHeader.getExercisesCaretButton());
	
		baseTest.verifyButtonIsDisplayed(homePageHeader.getVideosButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getThemeToggle());
	
		baseTest.verifyButtonIsDisplayed(homePageHeader.getTranslateButton());
	
		baseTest.verifyButtonIsDisplayed(homePageHeader.getSearchButton());
	
		baseTest.verifyButtonIsDisplayed(homePageHeader.getUpgradeButton());
		
		baseTest.verifyButtonIsDisplayed(homePageHeader.getCertifiedButton());
		
		baseTest.verifyButtonIsDisplayed(homePageHeader.getFreeWebsiteButton());
		
		baseTest.verifyButtonIsDisplayed(homePageHeader.getLoginButton());
		
		baseTest.assertAll();
		
	}

	String categoryName = "";
	
	String[] categoryItems = new String[]{};
	
	private void verifyCategoryItems(WebElement element, String[] categoryItems){
		
		baseTest.verifyElementIsDisplayed(element);

		for(String categoryItem : categoryItems){
			
			baseTest.verifyElementIsDisplayed(homePageMenuItems.getCategoryItem(categoryItem));
			
		}
		
	}
	
	@Test(testName = "Verify Tutorial menu items", priority = 2)
	private void testTutorialMenuIems(){

		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickTutorialsButton();

		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsMenuContainer());

		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsMenuHeader());

		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(TutorialsHeaderEnum.HTML_AND_CSS_CATEGORY.toString()), TutorialsHeaderEnum.HTML_AND_CSS_CATEGORY_ITEMS.getCategoryItems());
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(TutorialsHeaderEnum.JAVASCRIPT_CATEGORY.toString()), TutorialsHeaderEnum.JAVA_SCRIPT_CATEGORY_ITEMS.getCategoryItems());
	
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(TutorialsHeaderEnum.PROGRAMMING_CATEGORY.toString()), TutorialsHeaderEnum.PROGRAMMING_CATEGORY_ITEMS.getCategoryItems());

		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(TutorialsHeaderEnum.SERVER_SIDE_CATEGORY.toString()), TutorialsHeaderEnum.SERVER_SIDE_CATEGORY_ITEMS.getCategoryItems());

		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(TutorialsHeaderEnum.WEB_BUILDING_CATEGORY.toString()), TutorialsHeaderEnum.WEB_BUILDING_CATEGORY_ITEMS.getCategoryItems());

		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(TutorialsHeaderEnum.DATA_ANALYTICS_CATEGORY.toString()), TutorialsHeaderEnum.DATA_ANALYTICS_CATEGORY_ITEMS.getCategoryItems());

		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(TutorialsHeaderEnum.XML_TUTORIALS_CATEGORY.toString()), TutorialsHeaderEnum.XML_TUTORIALS_CATEGORY_ITEMS.getCategoryItems());
		
		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getTutorialsCaretButton());

		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getTutorialsCloseButton());
		
		homePageMenuItems.clickTutorialsCloseButton();
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify References menu items", priority = 3)
	private void testReferencesMenuItems(){
		
		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickReferencesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesMenuContainer());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesMenuHeader());

		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(ReferenceHeaderEnum.HTML.name()), ReferenceHeaderEnum.HTML_CATEGORY_ITEMS.getCategoryItems());
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(ReferenceHeaderEnum.CSS.name()), ReferenceHeaderEnum.CSS_CATEGORY_ITEMS.getCategoryItems());

		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(ReferenceHeaderEnum.JAVASCRIPT.toString()), ReferenceHeaderEnum.JAVASCRIPT_CATEGORY_ITEMS.getCategoryItems());

		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(ReferenceHeaderEnum.PROGRAMMING.toString()), ReferenceHeaderEnum.PROGRAMMING_CATEGORY_ITEMS.getCategoryItems());	
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(ReferenceHeaderEnum.SERVER_SIDE.toString()), ReferenceHeaderEnum.SERVER_SIDE_CATEGORY_ITEMS.getCategoryItems());	

		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(ReferenceHeaderEnum.XML.name()), ReferenceHeaderEnum.XML_CATEGORY_ITEMS.getCategoryItems());	
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(ReferenceHeaderEnum.CHARACTER_SETS.toString()), ReferenceHeaderEnum.CHARACTER_SETS_ITEMS.getCategoryItems());	
		
		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getReferencesCaretButton());
		
		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getReferencesCloseButton());
		
		homePageMenuItems.clickReferencesCloseButton();
		
		baseTest.assertAll();
		
	}
	
	private void verifyExerciseLinks(String[] links){
		
		for(String link : links){
			
			baseTest.verifyButtonIsDisplayed(homePageMenuItems.getExerciseMenuButton(link));
		
		}
		
	}
	
	@Test(testName = "Verify exercise header menu items", priority =  4)
	private void testExerciseMenuItems(){

		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickExercisesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesCaretButton());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesMenuHeader());

		for(String buttons : ExerciseHeaderEnum.BUTTON_NAMES.getLinksArray()){
			
			baseTest.verifyButtonIsDisplayed(homePageMenuItems.getExercisesYellowButtons(buttons));

		}

		verifyExerciseLinks(ExerciseHeaderEnum.EXERCISE_LINKS.getLinksArray());
		
		verifyExerciseLinks(ExerciseHeaderEnum.QUIZZES_LINKS.getLinksArray());
		
		verifyExerciseLinks(ExerciseHeaderEnum.COURSES_LINKS.getLinksArray());

		verifyExerciseLinks(ExerciseHeaderEnum.CERTIFICATES_LINKS.getLinksArray());
		
		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getExercisesCloseButton());
		
		homePageMenuItems.clickExercisesCloseButton();
		
		baseTest.assertAll();
		
	}
	
}