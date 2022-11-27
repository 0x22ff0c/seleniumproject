package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.maincontent.HomePageMainContent;
import pages.homepage.maincontent.wheretostartpage.WhereToStartPage;
import tests.BaseTest;
import utilities.Listener;

public class TestHomePageMainContents {

	HomePageMainContent homePage;
	
	WhereToStartPage whereToStartPage;

	BaseTest baseTest;
	
	WebDriver driver;
	
	@BeforeClass
	private void setup(){
		
		driver = Listener.getDriver();
		
	}

	@Test(testName = "Verify Main page contents", priority = 5)
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
	
	@Test(testName = "Verify Learn HTML section", priority = 6)
	private void testLearnHtmlSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		homePage.scrollToHtmlSection();
		
		baseTest.verifyTextIsTheSame(homePage.getHtmlHeaderContent(), "HTML");
		
		baseTest.verifyTextIsTheSame(homePage.getHtmlSubheaderContent(), "The language for building web pages");
		
		baseTest.verifyButtonIsDisplayed(homePage.getHtmlLearnHtmlButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getHtmlVideoTutorialButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getHtmlReferenceButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getHtmlGetCertifiedButton());
		
		baseTest.verifyTextIsTheSame(homePage.getHtmlCodeExampleHeader(), "HTML Example:");
		
		baseTest.verifyElementIsDisplayed(homePage.getHtmlSampleCodeSection());
		
		baseTest.verifyButtonIsDisplayed(homePage.getHtmlTryItYourselfButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify Learn CSS section", priority = 7)
	private void testLearnCSSSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		baseTest.verifyTextIsTheSame(homePage.getCssHeaderContent(), "CSS");
		
		baseTest.verifyTextIsTheSame(homePage.getHtmlCssSubheaderContent(), "The language for styling web pages");
		
		baseTest.verifyButtonIsDisplayed(homePage.getCSSLearnCSSButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getCSSReferenceButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getCSSGetCertifiedButton());
		
		baseTest.assertAll();
		
	}

}