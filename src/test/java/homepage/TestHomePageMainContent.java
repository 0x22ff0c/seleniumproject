package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.maincontent.HomePageMainContent;
import pages.homepage.maincontent.wheretostartpage.FooterSection;
import pages.homepage.maincontent.wheretostartpage.WhereToStartPage;
import tests.BaseTest;
import utilities.Listener;

public class TestHomePageMainContent {

	HomePageMainContent homePage;
	
	WhereToStartPage whereToStartPage;

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
		
		whereToStartPage = new WhereToStartPage(driver);
		
		baseTest = new BaseTest(whereToStartPage);
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getWhereToStartHeaderContent(), "Where To Start");
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getSubheaderContent(), "To become a web developer, start with the subjects below, in the following order:");
		
		baseTest.assertAll();
	}
	
	@Test(testName = "Verify Learn HTML section", priority = 6)
	private void testLearnHtmlSection(){
	
		baseTest = new BaseTest(whereToStartPage);
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getHtmlLeftButton());
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getHtml1stStep(), "1. Create your first web page");
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getHtml1stStepAdditionalInfo(), "The first thing you have to learn, is HTML, which is the standard markup language for creating web pages.");
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getLearnHtmlButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify Learn CSS section", priority = 7)
	private void testLearnCSSSection(){
		
		baseTest = new BaseTest(whereToStartPage);
		
		whereToStartPage.scrollToCSSsection();
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getCSSLeftButton());
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getCSS2ndStep(), "2. Style your web page");
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getCSS2ndStepAdditionalInfo(), "The next step is to learn CSS, to set the layout of your web page with beautiful colors, fonts, and much more.");
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getLearnCSSButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify Learn JavaScript section", priority = 8)
	private void testLearnJSSection(){
		
		baseTest = new BaseTest(whereToStartPage);
		
		whereToStartPage.scrollToJavaScriptSection();
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getJSLeftButton());
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getJS3rdStep(), "3. Make your web page interactive");
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getJS3rdStepAdditionalInfo(), "After studying HTML and CSS, you should learn JavaScript to create dynamic and interactive web pages for your users.");
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getLearnJSButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify \"What's Next?\" section", priority = 9)
	private void testWhatsNextSection(){
		
		baseTest = new BaseTest(whereToStartPage);
		
		whereToStartPage.scrollToWhatsNextSection();
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getWhatsNextHeader(), "What's Next?");
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getWhatsNextSubHeader(), "Now you know how to use HTML, CSS, and JavaScript to create, style, and make interactive web pages.");
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getWhatsNext2ndSubHeader(), "The next step is to publish your website, so that the rest of the world can see your work.");
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getWhatsNext2ndSubheaderNextStep());
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getWhatsNext3rdSubHeader(), "There are tons of hosting services to choose from. We have made one for you, for free:");
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify \"W3Schools Spaces\" section", priority = 10)
	private void testW3SchoolsSpacesSection(){
		
		baseTest = new BaseTest(whereToStartPage);
		
		whereToStartPage.scrollToW3SchoolsSpacesSection();
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getW3SchoolsSpacesHeader(), "W3Schools Spaces");
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getW3SchoolSpacesSubheader(), "Build your own website with W3Schools Spaces.");
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getGetStartedForFreeButton());
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getHowItWorksImage());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify \"Hello Developer!\" section", priority = 11)
	private void testHelloDeveloperSection(){
		
		baseTest = new BaseTest(whereToStartPage);
		
		whereToStartPage.scrollToHelloDeveloperSection();
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getHelloDeveloperHeaderValue(), "Hello, Front-End Developer!");
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getHelloDeveloperSubheaderContent(), "People who create websites and web applications for a living, are called Front-End Developers.");
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getHelloDeveloperSubheaderFrontEndDevelopers());
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getHelloDeveloper2ndSubheaderContent(), "Tip: Many Front-End Developers also have basic knowledge of "
				+ "different CSS and JavaScript frameworks and libraries, "
				+ "like Bootstrap, SASS (CSS pre-processor), jQuery and React, and the popular version control system, Git.");
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getHelloDeveloper2ndSubheaderTip());
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getBootstrapLink());
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getSASSLink());
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getJqueryLink());
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getReactLink());
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getGitLink());
		
		baseTest.assertAll();
		
	}
	
	
	@Test(testName = "Verify \"What About Back-End?\" section", priority = 12)
	private void verifyBackEndSection(){
		
		baseTest = new BaseTest(whereToStartPage);
		
		whereToStartPage.scrollToBackEndSection();
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getBackEndHeader(), "What About Back-End?");
		
		//1st subheader
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getBackEndSubheader(), "Front-end development refers to the client-side (how a web page looks). Back-end development refers to the server-side (how a web page works).");
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getBackEndSubheaderFrontEndText());
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getBackEndSubheaderClientText());
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getBackEndSubheaderlooksText());
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getBackEndSubheaderBackEndText());
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getBackEndSubheaderClientText());
		
		baseTest.verifyIfTextIsMarkedAsImportant(whereToStartPage.getBackEndSubHeaderWorksText());
		
		//2nd subheader
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getBackEnd2ndSubheader(), "Front-end code is used to create static websites, where the purpose is to display the web page. However, if you want to make your website dynamic (manage files and databases, add contact forms, control user-access, etc.), you need to learn a back-end programming language, like PHP or Python, and use SQL to communicate with databases.");
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getBackEndPhpLink());
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getBackEndPythonLink());
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getBackEndSqlLink());
		
		//3rd subheader
		
		baseTest.verifyTextIsTheSame(whereToStartPage.getBackEnd3rdSubheader(), "A list of other popular languages can be found on our Homepage.");
		
		baseTest.verifyElementIsDisplayed(whereToStartPage.getBackEndHomePageLink());
		
		baseTest.assertAll();
		
	}
	
	
	@Test(testName = "Verify Where to start page' footer is displayed", priority = 13)
	private void testFooter(){
		
		FooterSection footerSection = new FooterSection(driver);
		
		baseTest = new BaseTest(footerSection);
		
		footerSection.scrollToWhereToStartFooter();
		
		baseTest.verifyElementIsDisplayed(footerSection.getFooterHomeButton());
		
		baseTest.verifyElementIsDisplayed(footerSection.getFooterQuizzesButton());
		
		baseTest.verifyElementIsDisplayed(footerSection.getFooterExercisesButton());
		
		baseTest.verifyElementIsDisplayed(footerSection.getFooterUpgradeButton());
		
		baseTest.verifyElementIsDisplayed(footerSection.getFooterSpacesButton());
		
		baseTest.verifyElementIsDisplayed(footerSection.getFooterSupportButton());
		
		baseTest.verifyElementIsDisplayed(footerSection.getFooterNewsletterButton());
		
		baseTest.verifyElementIsDisplayed(footerSection.getFooterShopButton());
		
		baseTest.assertAll();
		
	}
}