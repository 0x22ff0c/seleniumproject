package homepage;

import enums.homepage.maincontent.MainContentEnum;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.homepage.maincontent.HomePageMainContent;
import tests.BaseTest;
import utilities.GoogleSheets;
import utilities.Listener;

import java.util.List;

public class TestHomePageMainContents {

	HomePageMainContent homePage;

	BaseTest baseTest;
	
	WebDriver driver;

	List<List<Object>> listOfTestData = null;
	
	@BeforeClass
	private void setup(){

		driver = Listener.getDriver();

		listOfTestData = GoogleSheets.getTestData("Home Page!A1:A16");

	}

	private int index = 0;

	private String getTestData(){

		String testData = listOfTestData.get(index).toString();

		index++;

		return testData.replaceAll("\\[|\\]", "");
	}

	@Test(testName = "Verify Main page contents", priority = 1)
	private void testMainPageContents(){

		homePage = new HomePageMainContent(driver);

		baseTest = new BaseTest(homePage);

		baseTest.verifyElementIsDisplayed(homePage.getMainContent());

		baseTest.verifyElementIsDisplayed(homePage.getHeaderElement(MainContentEnum.LEARN_TO_CODE_HEADER.toString()));

		baseTest.verifyElementIsDisplayed(homePage.getSubheaderTextInMainContent());

		baseTest.verifyElementIsDisplayed(homePage.getSearchbarField());

		baseTest.verifyTextIsTheSame(homePage.getSearchbarfieldPlaceholder(), getTestData());

		baseTest.verifyElementIsDisplayed(homePage.getSearchbarButton());

		baseTest.verifyElementIsDisplayed(homePage.getWhereToBeginLink());

		baseTest.assertAll();
	}

	@Test(testName = "Verify Learn HTML section", priority = 2)
	private void testLearnHtmlSection(){

		homePage = new HomePageMainContent(driver);

		baseTest = new BaseTest(homePage);

		homePage.scrollToHtmlSection();

		baseTest.verifyTextIsTheSame(homePage.getHtmlHeaderContent(), getTestData());

		baseTest.verifyTextIsTheSame(homePage.getHtmlSubheaderContent(), getTestData());

		baseTest.verifyButtonIsDisplayed(homePage.getHtmlLearnHtmlButton());

		baseTest.verifyButtonIsDisplayed(homePage.getHtmlVideoTutorialButton());

		baseTest.verifyButtonIsDisplayed(homePage.getHtmlReferenceButton());

		baseTest.verifyButtonIsDisplayed(homePage.getHtmlGetCertifiedButton());

		baseTest.verifyTextIsTheSame(homePage.getHtmlCodeExampleHeader(), getTestData());

		baseTest.verifyElementIsDisplayed(homePage.getHtmlSampleCodeSection());

		baseTest.verifyButtonIsDisplayed(homePage.getHtmlTryItYourselfButton());

		baseTest.assertAll();
	}

	@Test(testName = "Verify Learn CSS section", priority = 3)
	private void testLearnCSSSection(){

		homePage = new HomePageMainContent(driver);

		baseTest = new BaseTest(homePage);

		baseTest.verifyTextIsTheSame(homePage.getCssHeaderContent(), getTestData());

		baseTest.verifyTextIsTheSame(homePage.getCssSubheaderContent(), getTestData());

		baseTest.verifyButtonIsDisplayed(homePage.getCSSLearnCSSButton());

		baseTest.verifyButtonIsDisplayed(homePage.getCSSReferenceButton());

		baseTest.verifyButtonIsDisplayed(homePage.getCSSGetCertifiedButton());

		baseTest.verifyTextIsTheSame(homePage.getCSSCodeExampleHeader(), getTestData());

		baseTest.verifyElementIsDisplayed(homePage.getCSSSampleCodeSection());

		baseTest.verifyButtonIsDisplayed(homePage.getCSSTryItYourselfButton());

		baseTest.assertAll();
	}

	@Test(testName = "Verify Learn JavaScript section", priority = 4)
	private void testLearnJavaScriptSection(){

		homePage = new HomePageMainContent(driver);

		baseTest = new BaseTest(homePage);

		baseTest.verifyTextIsTheSame(homePage.getJavaScriptHeaderContent(), getTestData());

		baseTest.verifyTextIsTheSame(homePage.getJavaScriptSubheaderContent(), getTestData());

		baseTest.verifyButtonIsDisplayed(homePage.getJavaScriptLearnJavaScriptButton());

		baseTest.verifyButtonIsDisplayed(homePage.getJavaScriptReferenceButton());

		baseTest.verifyButtonIsDisplayed(homePage.getJavaScriptGetCertifiedButton());

		baseTest.verifyTextIsTheSame(homePage.getJavaScriptCodeExampleHeader(), getTestData());

		baseTest.verifyElementIsDisplayed(homePage.getJavaScriptSampleCodeSection());

		baseTest.verifyElementIsDisplayed(homePage.getJavaScriptTryItYourselfButton());

		baseTest.assertAll();
	}

	@Test(testName =  "Verify Learn Python section", priority = 5)
	private void testLearnPythonSection(){

		homePage = new HomePageMainContent(driver);

		baseTest = new BaseTest(homePage);

		baseTest.verifyTextIsTheSame(homePage.getPythonHeaderContent(), getTestData());

		baseTest.verifyTextIsTheSame(homePage.getPythonSubheaderContent(), getTestData());

		baseTest.verifyButtonIsDisplayed(homePage.getPythonLearnPythonButton());

		baseTest.verifyButtonIsDisplayed(homePage.getPythonReferenceButton());

		baseTest.verifyButtonIsDisplayed(homePage.getPythonGetCertifiedButton());

		baseTest.verifyTextIsTheSame(homePage.getPythonCodeExampleHeader(), getTestData());

		baseTest.verifyElementIsDisplayed(homePage.getPythonSampleCodeSection());

		baseTest.verifyButtonIsDisplayed(homePage.getPythonTryItYourselfButton());

		baseTest.assertAll();
	}

	@Test(testName = "Verify Learn SQL section", priority = 6)
	private void testLearnSQLSection(){

		homePage = new HomePageMainContent(driver);

		baseTest = new BaseTest(homePage);

		baseTest.verifyTextIsTheSame(homePage.getSQLHeaderContent(), getTestData());

		baseTest.verifyTextIsTheSame(homePage.getSQLSubheaderContent(), getTestData());

		baseTest.verifyButtonIsDisplayed(homePage.getSQLLearnSQLButton());

		baseTest.verifyButtonIsDisplayed(homePage.getSQLReferenceButton());

		baseTest.verifyButtonIsDisplayed(homePage.getSQLGetCertifiedButton());

		baseTest.verifyTextIsTheSame(homePage.getSQLCodeExampleHeader(), getTestData());

		baseTest.verifyElementIsDisplayed(homePage.getSQLSampleCodeSection());

		baseTest.verifyButtonIsDisplayed(homePage.getSQLTryItYourselfButton());

		baseTest.assertAll();
	}

//	private void verifyOtherTutorialButtons(String nameOfTutorial){
//
//		homePage.scrollToButton(nameOfTutorial);
//
//		baseTest.verifyButtonIsDisplayed(homePage.getOtherTutorialButton(nameOfTutorial));
//
//	}
//
//	private void verifyElementsInSections(String nameOfTheSection){
//
//		baseTest.verifyElementIsDisplayed(homePage.getHeaderElement(nameOfTheSection));
//
//		baseTest.verifyButtonIsDisplayed(homePage.getLearnButtonElement(nameOfTheSection));
//	}
//
//	@Test(testName = "Verify Other tutorials section", priority =  7)
//
//	private void testOtherTutorialsSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToOtherTutorialsSection();
//
//		verifyElementsInSections(MainContentEnum.PHP.name());
//
//		baseTest.verifyTextIsTheSame(homePage.getPHPSubheader(), "A web server programming language");
//
//		verifyElementsInSections(MainContentEnum.JQUERY.toString());
//
//		baseTest.verifyTextIsTheSame(homePage.getjQuerySubheader(), "A JS library for developing web pages");
//
//		verifyElementsInSections(MainContentEnum.JAVA.toString());
//
//		baseTest.verifyTextIsTheSame(homePage.getJavaSubheader(), "A programming language");
//
//		verifyElementsInSections(MainContentEnum.CPLUSPLUS.toString());
//
//		baseTest.verifyTextIsTheSame(homePage.getCplusplusSubheader(), "A programming language");
//
//		verifyElementsInSections(MainContentEnum.W3CSS.toString());
//
//		baseTest.verifyTextIsTheSame(homePage.getW3CSSSubheader(), "A CSS framework for faster and better responsive web pages");
//
//		verifyElementsInSections(MainContentEnum.BOOTSTRAP.toString());
//
//		baseTest.verifyTextIsTheSame(homePage.getBootstrapSubheader(), "A CSS framework for designing better web pages");
//
//		//Other buttons
//		//Missing buttons -
//		String[] buttonNames = {"C", "C#", "R", "Kotlin", "Node.js", "React", "JSON", "AngularJS", "MySQL",
//				"XML", "Sass", "Icons", "Responsive Web Design","Graphics", "SVG", "Canvas", "Raspberry Pi", "Cyber Security",
//				"Colors", "Git", "Python Matplotlib", "Python NumPy", "Python Pandas", "Python SciPy", "ASP", "Accessibility", "AppML",
//				"Go", "TypeScript", "Django", "MongoDB", "Statistics", "Data Science", "Typing Speed", "Excel",
//				"Google Sheets", "Machine Learning", "Artificial Intelligence"};
//
//		for(String nameOfTutorial : buttonNames){
//
//			verifyOtherTutorialButtons(nameOfTutorial);
//		}
//
//		baseTest.assertAll();
//	}
//	@Test(testName = "Verify Code Editor section", priority = 8)
//	private void testCodeEditorSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToCodeEditorSection();
//
//		baseTest.verifyTextIsTheSame(homePage.getCodeEditorHeader(), "Code Editor");
//
//		baseTest.verifyTextIsTheSame(homePage.getCodeEditorSubheader(), "With our online code editor, you can edit code and view the result in your browser");
//
//		for(int dotNumber = 1; dotNumber <= 3; dotNumber++){
//
//			baseTest.verifyElementIsDisplayed(homePage.getCodeEditorDotButton(dotNumber));
//
//		}
//
//		baseTest.verifyTextIsTheSame(homePage.getCodeEditorUrlValue(), "www.w3schools.com/tryit/");
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorFrontendActive());
//
//		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorBackEndActiveDisplayCount());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorFrontendGIF());
//
//		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorBackendGIF());
//
//		homePage.clickBackEndButton();
//
//		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorFrontendActiveDisplayCount());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorBackEndActive());
//
//		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorFrontendGIF());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorBackendGIF());
//
//		homePage.clickFrontendButton();
//
//		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorBackEndActiveDisplayCount());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorFrontendActive());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorFrontendGIF());
//
//		baseTest.verifyElementIsNotDisplayed(homePage.getCodeEditorBackendGIF());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorTryFrontend());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeEditorTryBackend());
//
//		baseTest.assertAll();
//	}
//
//	@Test(testName = "Verify W3Schools Spaces section", priority = 9)
//	private void testW3SchoolsSpacesSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToW3SchoolsSpacesSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getW3SchoolsSpacesHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getW3SchoolsSpacesSubheader(), "Build your own website with W3Schools Spaces.");
//
//		homePage.scrollToW3SchoolsSpacesScreenshotsSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getW3SchoolsSpacesSampleScreenshot());
//
//		baseTest.verifyElementIsDisplayed(homePage.getW3SchoolsSpacesHowItWorksImage());
//
//		baseTest.verifyButtonIsDisplayed(homePage.getW3schoolsSpacesGetStartedNowButton());
//
//		baseTest.assertAll();
//	}
//
//	@Test(testName = "Verify My Learning section", priority = 10)
//	private void testMyLearningSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToMyLearningSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getMyLearningHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getMyLearningSubheader(), "Track your progress with the free \"My Learning\" program here at W3Schools.");
//
//		baseTest.verifyIfTextIsMarkedAsImportant(homePage.getMyLearningFreeStrongText());
//
//		baseTest.verifyTextIsTheSame(homePage.getMyLearning2ndSubheader(), "Log in to your account, and start earning points!");
//
//		homePage.scrollToMyLearningSampleScreenshot();
//
//		baseTest.verifyElementIsDisplayed(homePage.getMyLearningSampleScreenshot());
//
//		baseTest.verifyButtonIsDisplayed(homePage.getMyLearningSignupButton());
//
//		baseTest.assertAll();
//	}
//
//	@Test(testName = "Verify Become a Pro User section", priority = 11)
//	private void testBecomeProUserSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToBecomeProUserSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUserHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getBecomeProUserSubheader(), "And unlock powerful features:");
//
//		// 1st checkbox
//		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser1stCheckbox());
//
//		baseTest.verifyTextIsTheSame(homePage.getBecomeProUser1stCheckboxText(), "Browse W3Schools without ads");
//
//		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser1stCheckboxStrongText());
//
//		//2nd checkbox
//		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser2ndCheckbox());
//
//		baseTest.verifyTextIsTheSame(homePage.getBecomeProUser2ndCheckboxText(), "Website hosting (Includes Spaces PRO)");
//
//		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser2ndCheckboxLink());
//
//		//3rd checkbox
//		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser3rdCheckbox());
//
//		baseTest.verifyTextIsTheSame(homePage.getBecomeProUser3rdCheckboxText(), "Access to our HTML Video Tutorial");
//
//		baseTest.verifyElementIsDisplayed(homePage.getBecomeProUser3rdCheckboxLink());
//
//		baseTest.verifyButtonIsDisplayed(homePage.getBecomeProUserLearnMoreButton());
//
//		baseTest.assertAll();
//	}
//
//	@Test(testName = "Verify Color Picker section", priority = 12)
//	private void testColorPickerSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToColorPickerSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getColorPickerHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getColorPickerSubheader(), "W3Schools' famous color picker:");
//
//		baseTest.verifyElementIsDisplayed(homePage.getColorPickerImage());
//
//		baseTest.assertAll();
//	}
//
//	@Test(testName = "Verify Code Game section", priority = 13)
//	private void testCodeGameSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToCodeGameSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeGameHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getCodeGameSubheader(), "Help the Lynx collect pine cones!");
//
//		baseTest.verifyElementIsDisplayed(homePage.getCodeGameImageOfLynx());
//
//		baseTest.verifyButtonIsDisplayed(homePage.getCodeGamePlayGameButton());
//
//		baseTest.assertAll();
//
//	}
//
//	@Test(testName = "Verify Exercises and Quizzes section", priority = 14)
//	private void testExercisesAndQuizzesSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToExercisesQuizzesSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getExercisesAndQuizzesHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getExercisesAndQuizzesSubheader(), "Test your skills!");
//
//		baseTest.verifyButtonIsDisplayed(homePage.getExercisesAndQuizzesExercisesButton());
//
//		baseTest.verifyButtonIsDisplayed(homePage.getExercisesAndQuizzesQuizzesButton());
//
//		baseTest.assertAll();
//	}
//
//	@Test(testName = "Verify Web Templates section", priority = 15)
//	private void testWebTemplatesSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToWebTemplatesSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getWebTemplatesHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getWebTemplatesSubheader(), "Browse our selection of free responsive HTML Templates");
//
//		baseTest.verifyIfTextIsMarkedAsImportant(homePage.getWebTemplatesSubheaderFreeText());
//
//		baseTest.verifyElementIsDisplayed(homePage.getWebTemplatesSampleImage());
//
//		baseTest.verifyButtonIsDisplayed(homePage.getWebTemplatesBrowseTemplatesButton());
//
//		baseTest.assertAll();
//	}
//
//	@Test(testName = "Verify Certification section", priority = 16)
//	private void testCertificationSection(){
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToCertificationSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getCertificationHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getCertificationSubheader(), "Get certified by completing a course");
//
//		baseTest.verifyButtonIsDisplayed(homePage.getCertificationGetStartedButton());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCertificationArrow());
//
//		baseTest.verifyElementIsDisplayed(homePage.getCertificationBadge());
//
//		baseTest.assertAll();
//	}
//
//	@Test(testName = "Verify How To Section", priority = 17)
//	private void testHowToSection() {
//
//		homePage = new HomePageMainContent(driver);
//
//		baseTest = new BaseTest(homePage);
//
//		homePage.scrollToHowToSection();
//
//		baseTest.verifyElementIsDisplayed(homePage.getHowToSectionHeader());
//
//		baseTest.verifyTextIsTheSame(homePage.getHowToSectionSubheader(), "Code snippets for HTML, CSS and JavaScript");
//
//		baseTest.verifyTextIsTheSame(homePage.getHowToSection2ndSubheader(), "For example, how to create a slideshow:");
//
//		for (int buttonNumber = 1; buttonNumber <= 3; buttonNumber++) {
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowDotButton(buttonNumber));
//
//		}
//
//		baseTest.verifyTextIsTheSame(homePage.getHowToSectionSampleWindowUrlValue(), "www.w3schools.com/howto/");
//
//		homePage.scrollToHowToSectionSliderContainer();
//
//		homePage.switchToHowToSliderFrame();
//
//		baseTest.verifyButtonIsDisplayed(homePage.getHowToSectionSampleWindowPreviousButton());
//
//		baseTest.verifyButtonIsDisplayed(homePage.getHowToSectionSampleWindowNextButton());
//
//		baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowCounter());
//
//		baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowImage());
//
//		baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowCaptionText());
//
//		baseTest.verifyElementIsDisplayed(homePage.getHowtoSectionActiveDot());
//
//		for (int iteration = 1; iteration <= 3; iteration++) {
//
//			homePage.clickNextButton();
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowCounter());
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowCaptionText());
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowImage());
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowtoSectionActiveDot());
//
//		}
//
//		for (int iteration = 1; iteration <= 3; iteration++) {
//
//			homePage.clickPreviousButton();
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowCounter());
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowCaptionText());
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowToSectionSampleWindowImage());
//
//			baseTest.verifyElementIsDisplayed(homePage.getHowtoSectionActiveDot());
//
//		}
//
//		homePage.switchToDefaultContent();
//
//		baseTest.verifyButtonIsDisplayed(homePage.getHowToLearnButton());
//
//		baseTest.assertAll();
//	}
}