package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.HomePageMainContent;
import tests.BaseTest;
import utilities.Listener;

public class TestHomePageMainContent {

	HomePageMainContent homePage;

	BaseTest baseTest;
	
	WebDriver driver;
	
	@BeforeClass
	private void setup(){
		
		driver = Listener.getDriver();
		
		baseTest = new BaseTest();
		
		homePage = new HomePageMainContent(driver, baseTest);

	}

	@Test(testName = "Verify Main page contents", priority = 2)
	private void testMainPageContents(){

		baseTest.setSoftAssertion(Listener.getAssertion());
		
		baseTest.verifyElementIsDisplayed(homePage.getMainContent());
		
		baseTest.verifyTextIsTheSame(homePage.getHeaderTextInMainContent(), "Learn to Code", "Header");
	
		baseTest.verifyTextIsTheSame(homePage.getSubheaderTextInMainContent(), "With the world's largest web developer site.", "Subheader");
	
		baseTest.verifyElementIsDisplayed(homePage.getSearchbarField());
	
		baseTest.verifyTextIsTheSame(homePage.getSearchbarfieldPlaceholder(), "Search our tutorials, e.g. HTML", "Search field placeholder");
	
		baseTest.verifyElementIsDisplayed(homePage.getSearchbarButton());

		baseTest.verifyElementIsDisplayed(homePage.getWhereToBeginLink());
		
		baseTest.assertAll();
		
	}
	
}

