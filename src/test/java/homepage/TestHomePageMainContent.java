package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.maincontent.HomePageMainContent;
import pages.homepage.maincontent.WhereToStartPage;
import tests.BaseTest;
import utilities.Listener;

public class TestHomePageMainContent {

	HomePageMainContent homePage;

	BaseTest baseTest;
	
	WebDriver driver;
	
	@BeforeClass
	private void setup(){
		
		driver = Listener.getDriver();
		
	}

	@Test(testName = "Verify Main page contents", priority = 4)
	private void testMainPageContents(){

		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		baseTest.verifyElementIsDisplayed(homePage.getMainContent());
		
		baseTest.verifyTextIsTheSame(homePage.getHeaderTextInMainContent(), "Learn to Code");
	
		baseTest.verifyTextIsTheSame(homePage.getSubheaderTextInMainContent(), "With the world's largest web developer site.");
	
		baseTest.verifyElementIsDisplayed(homePage.getSearchbarField());
	
		baseTest.verifyTextIsTheSame(homePage.getSearchbarfieldPlaceholder(), "Search our tutorials, e.g. HTML");
	
		baseTest.verifyElementIsDisplayed(homePage.getSearchbarButton());

		baseTest.verifyElementIsDisplayed(homePage.getWhereToBeginLink());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify Where to start page", priority = 5)
	private void testWhereToStartPage(){
		
		homePage.clickWhereToBeginLink();
		
		WhereToStartPage whereToStartPage = new WhereToStartPage(driver);
		
		baseTest = new BaseTest(whereToStartPage);
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getWhereToStartHeader());
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getSubheaderContent(), "To become a web developer, start with the subjects below, in the following order:");
		
		baseTest.assertAll();
	}
	
}

