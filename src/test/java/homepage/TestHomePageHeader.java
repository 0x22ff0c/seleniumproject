package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import enums.homepage.HomePageHeaderEnum;
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
	
//	@Test(testName = "Verify Home page header elements", priority =  1)
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

		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(HomePageHeaderEnum.HTML_AND_CSS_CATEGORY.toString()), HomePageHeaderEnum.HTML_AND_CSS_CATEGORY_ITEMS.getCategoryItems());
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(HomePageHeaderEnum.JAVASCRIPT_CATEGORY.toString()), HomePageHeaderEnum.JAVA_SCRIPT_CATEGORY_ITEMS.getCategoryItems());
	
		categoryItems = new String[]{"Learn Python", "Learn Java", "Learn C", "Learn C++", "Learn C#", "Learn R", 
				"Learn Kotlin", "Learn Go", "Learn Django", "Learn TypeScript"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(HomePageHeaderEnum.PROGRAMMING_CATEGORY.toString()), categoryItems);

		categoryItems = new String[]{"Learn SQL", "Learn MySQL", "Learn PHP", "Learn ASP", "Learn Node.js",
				"Learn Raspberry Pi", "Learn Git", "Learn MongoDB", "Learn AWS Cloud"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(HomePageHeaderEnum.SERVER_SIDE_CATEGORY.toString()), categoryItems);

		categoryItems = new String[] {"Create a Website ", "Where To Start", "Web Templates", "Web Statistics", "Web Certificates",
				"Web Development", "Code Editor", "Test Your Typing Speed", "Play a Code Game", "Cyber Security", "Accessibility", "Join our Newsletter"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(HomePageHeaderEnum.WEB_BUILDING_CATEGORY.toString()), categoryItems);

		categoryItems = new String[] {"Learn AI", "Learn Machine Learning", "Learn Data Science", "Learn NumPy", "Learn Pandas",
				"Learn SciPy", "Learn Matplotlib", "Learn Statistics", "Learn Excel", "Learn Google Sheets"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(HomePageHeaderEnum.DATA_ANALYTICS_CATEGORY.toString()), categoryItems);

		categoryItems = new String[] {"Learn XML", "Learn XML AJAX", "Learn XML DOM", "Learn XML DTD", "Learn XML Schema",
				"Learn XSLT", "Learn XPath", "Learn XQuery"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(HomePageHeaderEnum.XML_TUTORIALS_CATEGORY.toString()), categoryItems);
		
		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getTutorialsCaretButton());

		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getTutorialsCloseButton());
		
		homePageMenuItems.clickTutorialsCloseButton();
		
		baseTest.assertAll();
		
	}
	
//	@Test(testName = "Verify References menu items", priority = 3)
	private void testReferencesMenuItems(){
		
		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickReferencesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesMenuContainer());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesMenuHeader());
		
		categoryName = "HTML";
		
		categoryItems = new String[]{"HTML Tag Reference", "HTML Browser Support", "HTML Event Reference", "HTML Color Reference", "HTML Attribute Reference"
				,"HTML Canvas Reference", "HTML SVG Reference", "Google Maps Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "CSS";
		
		categoryItems = new String[]{"CSS Reference", "CSS Browser Support", "CSS Selector Reference", "Bootstrap 3 Reference", "Bootstrap 4 Reference"
				,"W3.CSS Reference", "Icon Reference", "Sass Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "JavaScript";
		
		categoryItems = new String[]{"JavaScript Reference", "HTML DOM Reference", "jQuery Reference", "AngularJS Reference", "AppML Reference"
				,"W3.JS Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "Programming";
		
		categoryItems = new String[]{"Python Reference", "Java Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);	
		
		categoryName = "Server Side";
		
		categoryItems = new String[]{"SQL Reference", "MySQL Reference", "PHP Reference", "ASP Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);	
		
		categoryName = "XML";
		
		categoryItems = new String[]{"XML DOM Reference", "XML Http Reference", "XSLT Reference", "XML Schema Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);	
		
		categoryName = "Character Sets";
		
		categoryItems = new String[]{"HTML Character Sets", "HTML ASCII", "HTML ANSI", "HTML Windows-1252", "HTML ISO-8859-1"
				,"HTML Symbols", "HTML UTF-8"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);	
		
		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getReferencesCaretButton());
		
		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getReferencesCloseButton());
		
		homePageMenuItems.clickReferencesCloseButton();
		
		baseTest.assertAll();
		
	}
	
	private void verifyExerciseLinks(String[] links){
		
		for(String link : links){
			
			baseTest.verifyElementIsDisplayed(homePageMenuItems.getExerciseMenuButton(link));
		
		}
		
	}
	
//	@Test(testName = "Verify exercise header menu items", priority =  4)
	private void testExerciseMenuItems(){

		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickExercisesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesCaretButton());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesMenuHeader());
		
		String[] yellowButtons = {"Exercises", "Quizzes", "Courses", "Certificates"};
		
		for(String buttons : yellowButtons){
			
			baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesYellowButtons(buttons));

		}
		
		String[] exerciseLinks = {"HTML Exercises", "CSS Exercises", "JavaScript Exercises", "Python Exercises", "SQL Exercises"
				,"PHP Exercises", "Java Exercises", "C Exercises", "C++ Exercises", "C# Exercises", "jQuery Exercises", "React.js Exercises"
				,"MySQL Exercises", "Bootstrap 5 Exercises", "Bootstrap 4 Exercises", "Bootstrap 3 Exercises", "NumPy Exercises", "Pandas Exercises"
				,"SciPy Exercises", "TypeScript Exercises", "Excel Exercises", "R Exercises", "Git Exercises", "Kotlin Exercises", "Go Exercises"
				,"MongoDB Exercises"};
		
		verifyExerciseLinks(exerciseLinks);
		
		String[] quizzesLinks = {"HTML Quiz", "CSS Quiz", "JavaScript Quiz", "Python Quiz", "SQL Quiz", "PHP Quiz", "Java Quiz", "C Quiz"
				,"C++ Quiz", "C# Quiz", "jQuery Quiz", "React.js Quiz", "MySQL Quiz", "Bootstrap 5 Quiz", "Bootstrap 4 Quiz", "Bootstrap 3 Quiz"
				,"NumPy Quiz", "Pandas Quiz", "SciPy Quiz", "TypeScript Quiz", "XML Quiz", "R Quiz", "Git Quiz", "Kotlin Quiz", "Cyber Security Quiz"
				,"Accessibility Quiz"};
		
		verifyExerciseLinks(quizzesLinks);
		
		String[] coursesLinks = {"HTML Course", "CSS Course", "JavaScript Course", "Front End Course", "Python Course", "SQL Course", "PHP Course"
				,"Java Course", "C++ Course", "C# Course", "jQuery Course", "React.js Course", "Bootstrap 4 Course", "Bootstrap 3 Course"
				,"NumPy Course", "Pandas Course", "TypeScript Course", "XML Course", "R Course", "Data Analytics Course", "Cyber Security Course"
				,"Accessibility Course"};
		
		verifyExerciseLinks(coursesLinks);
		
		String[] certificatesLinks = {"HTML Certificate", "CSS Certificate", "JavaScript Certificate", "Front End Certificate", "Python Certificate"
				,"SQL Certificate", "PHP Certificate", "Java Certificate", "C++ Certificate", "C# Certificate", "jQuery Certificate", "React.js Certificate"
				,"MySQL Certificate", "Bootstrap 5 Certificate", "Bootstrap 4 Certificate", "Bootstrap 3 Certificate", "TypeScript Certificate", "XML Certificate"
				,"Excel Certificate", "Data Science Certificate", "Cyber Security Certificate", "Accessibility Certificate"};
		
		verifyExerciseLinks(certificatesLinks);
		
		baseTest.verifyButtonIsDisplayed(homePageMenuItems.getExercisesCloseButton());
		
		homePageMenuItems.clickExercisesCloseButton();
		
		baseTest.assertAll();
		
	}
	
}