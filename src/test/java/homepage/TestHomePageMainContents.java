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

//	@Test(testName = "Verify Main page contents", priority = 1)
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
	
//	@Test(testName = "Verify Learn HTML section", priority = 2)
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
	
//	@Test(testName = "Verify Learn CSS section", priority = 3)
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
	
//	@Test(testName = "Verify Learn JavaScript section", priority = 4)
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
	
//	@Test(testName =  "Verify Learn Python section", priority = 5)
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
	
//	@Test(testName = "Verify Learn SQL section", priority = 6)
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
	
//	@Test(testName = "Verify Other tutorials section", priority =  7)
	
	private void testOtherTutorialsSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		homePage.scrollToOtherTutorialsSection();
		
		baseTest.verifyElementIsDisplayed(homePage.getPHPHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getPHPSubheader(), "A web server programming language");
		
		baseTest.verifyButtonIsDisplayed(homePage.getLearnPHPButton());
		
		baseTest.verifyElementIsDisplayed(homePage.getjQueryHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getjQuerySubheader(), "A JS library for developing web pages");
		
		baseTest.verifyButtonIsDisplayed(homePage.getLearnjQueryButton());
		
		baseTest.verifyElementIsDisplayed(homePage.getJavaHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getJavaSubheader(), "A programming language");
		
		baseTest.verifyButtonIsDisplayed(homePage.getLearnJavaButton());
		
		baseTest.verifyElementIsDisplayed(homePage.getCplusplusHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getCplusplusSubheader(), "A programming language");
		
		baseTest.verifyButtonIsDisplayed(homePage.getLearnCplusplusButton());
		
		baseTest.verifyElementIsDisplayed(homePage.getW3CSSHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getW3CSSSubheader(), "A CSS framework for faster and better responsive web pages");
		
		baseTest.verifyButtonIsDisplayed(homePage.getLearnW3CSSButton());
		
		baseTest.verifyElementIsDisplayed(homePage.getBootstrapHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getBootstrapSubheader(), "A CSS framework for designing better web pages");
		
		baseTest.verifyElementIsDisplayed(homePage.getLearnBootstrapButton());
		
		//Other buttons 
		//Missing buttons - 
		String[] buttonNames = {"C", "C#", "R", "Kotlin", "Node.js", "React", "JSON", "AngularJS", "MySQL",
				"XML", "Sass", "Icons", "Responsive Web Design","Graphics", "SVG", "Canvas", "Raspberry Pi", "Cyber Security",
				"Colors", "Git", "Python Matplotlib", "Python NumPy", "Python Pandas", "Python SciPy", "ASP", "Accessibility", "AppML",
				"Go", "TypeScript", "Django", "MongoDB", "Statistics", "Data Science", "Typing Speed", "Excel",
				"Google Sheets", "Machine Learning", "Artificial Intelligence"};
		
		for(String nameOfTutorial : buttonNames){
			
			verifyOtherTutorialButtons(nameOfTutorial);
		}
		
		baseTest.assertAll();
		
	}
	
	private void verifyOtherTutorialButtons(String nameOfTutorial){
		
		homePage.scrollToButton(nameOfTutorial);
		
		baseTest.verifyButtonIsDisplayed(homePage.getOtherTutorialButton(nameOfTutorial));
		
	}
	
//	@Test(testName = "Verify Code Editor section", priority = 8)
	private void testCodeEditorSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		homePage.scrollToCodeEditorSection();
		
		baseTest.verifyTextIsTheSame(homePage.getCodeEditorHeader(), "Code Editor");
		
		baseTest.verifyTextIsTheSame(homePage.getCodeEditorSubheader(), "With our online code editor, you can edit code and view the result in your browser");
		
		for(int buttonNumber = 1; buttonNumber <= 3; buttonNumber++){
			
			baseTest.verifyElementIsDisplayed(homePage.getCodeEditorDotButton(buttonNumber));
			
		}
		
		baseTest.verifyTextIsTheSame(homePage.getCodeEditorUrlValue(), "www.w3schools.com/tryit/");
		
		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorFrontendActive());

		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorBackEndActiveDisplayCount());
		
		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorFrontendGIF());
		
		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorBackendGIF());
		
		homePage.clickBackEndButton();
		
		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorFrontendActiveDisplayCount());
		
		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorBackEndActive());
		
		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorFrontendGIF());

		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorBackendGIF());
		
		homePage.clickFrontendButton();
		
		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorBackEndActiveDisplayCount());
		
		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorFrontendActive());
		
		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorFrontendGIF());
		
		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorBackendGIF());
		
		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorTryFrontend());
		
		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorTryBackend());
		
		baseTest.assertAll();
	
	}

//	@Test(testName = "Verify W3Schools Spaces section", priority = 9)
	private void testW3SchoolsSpacesSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		homePage.scrollToW3SchoolsSpacesSection();
		
		baseTest.verifyElementIsDisplayed(homePage.getW3SchoolsSpacesHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getW3SchoolsSpacesSubheader(), "Build your own website with W3Schools Spaces.");
		
		homePage.scrollToW3SchoolsSpacesScreenshotsSection();
		
		baseTest.verifyElementIsDisplayed(homePage.getW3SchoolsSpacesSampleScreenshot());
		
		baseTest.verifyElementIsDisplayed(homePage.getW3SchoolsSpacesHowItWorksImage());
		
		baseTest.verifyButtonIsDisplayed(homePage.getW3schoolsSpacesGetStartedForFreeButton());
		
		baseTest.assertAll();
		
	}
	
//	@Test(testName = "Verify My Learning section", priority = 10)
	private void testMyLearningSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		homePage.scrollToMyLearningSection();
		
		baseTest.verifyElementIsDisplayed(homePage.getMyLearningHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getMyLearningSubheader(), "Track your progress with the free \"My Learning\" program here at W3Schools.");
		
		baseTest.verifyIfTextIsMarkedAsImportant(homePage.getMyLearningFreeStrongText());
		
		homePage.scrollToMyLearningSampleScreenshot();
		
		baseTest.verifyElementIsDisplayed(homePage.getMyLearningSampleScreenshot());
		
		baseTest.verifyButtonIsDisplayed(homePage.getMyLearningSignupButton());
		
		baseTest.assertAll();
		
	}
	
//	@Test(testName = "Verify Become a Pro User section", priority = 11)
	
	private void testBecomeProUserSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		homePage.scrollToBecomeProUserSection();
		
		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUserHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getBecomeProUserSubheader(), "And unlock powerful features:");
		
		// 1st checkbox
		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser1stCheckbox());
		
		baseTest.verifyTextIsTheSame(homePage.getBecomeProUser1stCheckboxText(), "Browse W3Schools without ads");
		
		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser1stCheckboxStrongText());
		
		//2nd checkbox
		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser2ndCheckbox());
		
		baseTest.verifyTextIsTheSame(homePage.getBecomeProUser2ndCheckboxText(), "Website hosting (Includes Spaces PRO)");
		
		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser2ndCheckboxLink());
		
		//3rd checkbox
		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser3rdCheckbox());
		
		baseTest.verifyTextIsTheSame(homePage.getBecomeProUser3rdCheckboxText(), "Access to our HTML Video Tutorial");
		
		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser3rdCheckboxLink());
		
		baseTest.verifyButtonIsDisplayed(homePage.getBecomeProUserLearnMoreButton());
		
		baseTest.assertAll();
				
	}
	
	@Test(testName = "Verify Color Picker", priority = 12)
	private void testColorPickerSection(){
		
		homePage = new HomePageMainContent(driver);
		
		baseTest = new BaseTest(homePage);
		
		homePage.scrollToColorPickerSection();
		
		baseTest.verifyElementIsDisplayed(homePage.getColorPickerHeader());
		
		baseTest.verifyTextIsTheSame(homePage.getColorPickerSubheader(), "W3Schools' famous color picker:");
		
		baseTest.verifyElementIsDisplayed(homePage.getColorPickerImage());
		
		baseTest.assertAll();
		
	}
	
}