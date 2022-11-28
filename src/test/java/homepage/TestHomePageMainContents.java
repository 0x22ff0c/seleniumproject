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
		
		baseTest.verifyTextIsTheSame(homePage.getCssSubheaderContent(), "The language for styling web pages");
		
		baseTest.verifyButtonIsDisplayed(homePage.getCSSLearnCSSButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getCSSReferenceButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getCSSGetCertifiedButton());
		
		baseTest.verifyTextIsTheSame(homePage.getCSSCodeExampleHeader(), "CSS Example:");
		
		baseTest.verifyElementIsDisplayed(homePage.getCSSSampleCodeSection());
		
		baseTest.verifyButtonIsDisplayed(homePage.getCSSTryItYourselfButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify Learn JavaScript section", priority = 8)
	private void testLearnJavaScriptSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		baseTest.verifyTextIsTheSame(homePage.getJavaScriptHeaderContent(), "JavaScript");
		
		baseTest.verifyTextIsTheSame(homePage.getJavaScriptSubheaderContent(), "The language for programming web pages");
		
		baseTest.verifyButtonIsDisplayed(homePage.getJavaScriptLearnJavaScriptButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getJavaScriptReferenceButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getJavaScriptGetCertifiedButton());
		
		baseTest.verifyTextIsTheSame(homePage.getJavaScriptCodeExampleHeader(), "JavaScript Example:");
		
		baseTest.verifyElementIsDisplayed(homePage.getJavaScriptSampleCodeSection());
		
		baseTest.verifyElementIsDisplayed(homePage.getJavaScriptTryItYourselfButton());
		
		baseTest.assertAll();
		
	}
	
	
	@Test(testName =  "Verify Learn Python section", priority = 9)
	private void testLearnPythonSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		baseTest.verifyTextIsTheSame(homePage.getPythonHeaderContent(), "Python");
		
		baseTest.verifyTextIsTheSame(homePage.getPythonSubheaderContent(), "A popular programming language");
		
		baseTest.verifyButtonIsDisplayed(homePage.getPythonLearnPythonButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getPythonReferenceButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getPythonGetCertifiedButton());
		
		baseTest.verifyTextIsTheSame(homePage.getPythonCodeExampleHeader(), "Python Example:");
		
		baseTest.verifyElementIsDisplayed(homePage.getPythonSampleCodeSection());
		
		baseTest.verifyButtonIsDisplayed(homePage.getPythonTryItYourselfButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify Learn SQL section", priority = 10)
	private void testLearnSQLSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		baseTest.verifyTextIsTheSame(homePage.getSQLHeaderContent(), "SQL");
		
		baseTest.verifyTextIsTheSame(homePage.getSQLSubheaderContent(), "A language for accessing databases");
		
		baseTest.verifyButtonIsDisplayed(homePage.getSQLLearnSQLButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getSQLReferenceButton());
		
		baseTest.verifyButtonIsDisplayed(homePage.getSQLGetCertifiedButton());
		
		baseTest.verifyTextIsTheSame(homePage.getSQLCodeExampleHeader(), "SQL Example:");
		
		baseTest.verifyElementIsDisplayed(homePage.getSQLSampleCodeSection());
		
		baseTest.verifyButtonIsDisplayed(homePage.getSQLTryItYourselfButton());
		
		baseTest.assertAll();
		
	}

}