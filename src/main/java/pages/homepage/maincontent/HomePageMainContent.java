package pages.homepage.maincontent;

import enums.homepage.maincontent.MainContentEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomePageMainContent extends BasePage{
	
	public HomePageMainContent(WebDriver driver) {
		super(driver);
	}

	//region Main Content section
	public WebElement getMainContent(){
		return getElementById("main", MainContentEnum.MAIN_CONTENT_SECTION);
	}
	
	private void scrollToSection(String nameOfTheSection){
		String sectionXpathExpression = "//h1[text()='%s']/parent::*/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(sectionXpathExpression, nameOfTheSection), nameOfTheSection + " section"));
	}
	
	public WebElement getHeaderElement(String nameOfTheSection){
		String headerXpathExpression = "//*[text()='%s']";
		
		return getElementByXpath(String.format(headerXpathExpression, nameOfTheSection), nameOfTheSection + " header");
	}
	
	private String getSubheaderValue(String nameOfTheSection){
		String subheaderXpathExpression = "//*[text()='%s']/following-sibling::*/descendant::*";
		
		return getTextOfElementUsingXpathLocator(String.format(subheaderXpathExpression, nameOfTheSection));
	}
	
	public WebElement getLearnButtonElement(String nameOfTheButton){
		String learnButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";
		
		return getButtonElementByXpath(String.format(learnButtonXpathExpression, nameOfTheButton), nameOfTheButton);
	}
	
	private WebElement getReferenceButton(String nameOfTheButton){
		String referenceButtonXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";
		
		return getButtonElementByXpath(String.format(referenceButtonXpathExpression, nameOfTheButton), nameOfTheButton);
	}

	public WebElement getSubheaderTextInMainContent(){
		String learnToCodeSubheaderXpathExpression = "//*[text()=\"%s\"]";
		
		return getElementByXpath(String.format(learnToCodeSubheaderXpathExpression, MainContentEnum.LEARN_TO_CODE_SUB_HEADER.toString()), 
				MainContentEnum.LEARN_TO_CODE_SUB_HEADER.toString() + " subheader");
	}
	
	public WebElement getSearchbarField(){
		return getElementById("search2", MainContentEnum.SEARCH_FIELD);
	}
	
	public String getSearchbarfieldPlaceholder(){
		return getPlaceholderTextOfField(getSearchbarField());
	}

	public WebElement getSearchbarButton(){
		return getButtonElementById("learntocode_searchbtn", MainContentEnum.SEARCH_FIELD_BUTTON.toString());
	}
	
	public WebElement getWhereToBeginLink(){
		return getElementByLinkText(MainContentEnum.NOT_SURE_WHERE_TO_BEGIN_LINK.toString());
	}
	
	public void scrollToWhereToBeginLink(){
		control.scrollToElement(getWhereToBeginLink());
	}
	
	public void clickWhereToBeginLink(){
		control.clickButton(getWhereToBeginLink());
	}

	//endregion

	//region HTML section
	public void scrollToHtmlSection(){
		scrollToSection(MainContentEnum.HTML.name());
	}
	
	public String getHtmlHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-green')]/descendant::h1)[1]");
	}
	
	public String getHtmlSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-green')]/descendant::h1/following-sibling::*)[1]");
	}
	
	public WebElement getHtmlLearnHtmlButton(){
		return getLearnButtonElement(MainContentEnum.LEARN_HTML.toString());
	}
	
	public WebElement getHtmlVideoTutorialButton(){
		return getButtonElement("HTML video tutorial", MainContentEnum.VIDEO_TUTORIAL.toString());
	}
	
	public WebElement getHtmlReferenceButton(){
		return getReferenceButton(MainContentEnum.HTML_REFERENCE.toString());
	}
	
	public WebElement getHtmlGetCertifiedButton(){
		
		return getButtonElement(MainContentEnum.HTML_ADD_CERTIFICATION_ID.toString(), MainContentEnum.GET_CERTIFIED.toString());
	}
	
	public String getHtmlCodeExampleHeader(){
		String htmlCodeExampleHeaderXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(htmlCodeExampleHeaderXpathExpression, MainContentEnum.HTML.name()));
	}
	
	public WebElement getHtmlSampleCodeSection(){
		String htmlSampleCodeXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getButtonElementByXpath(String.format(htmlSampleCodeXpathExpression, MainContentEnum.HTML.name()), MainContentEnum.HTML_SAMPLE_CODE_SECTION.toString());
	}

	public WebElement getHtmlTryItYourselfButton(){
		return getButtonElementByXpath("(//*[text()='HTML Example:']/following-sibling::*[text()='Try it Yourself'])[1]", MainContentEnum.HTML_TRY_IT_YOURSELF_BUTTON.toString());
	}
	//endregion

	//region CSS section
	public String getCssHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'yellow')]/descendant::h1)[1]");
	}
	
	public String getCssSubheaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'yellow')]/descendant::h1/following-sibling::*)[1]");
	}
	
	public WebElement getCSSLearnCSSButton(){
		return getLearnButtonElement(MainContentEnum.LEARN_CSS.toString());
	} 
	
	public WebElement getCSSReferenceButton(){
		return getReferenceButton(MainContentEnum.CSS_REFERENCE.toString());
	}
	
	public WebElement getCSSGetCertifiedButton(){
		return getButtonElement(MainContentEnum.CSS_ADD_CERTIFICATION_ID.toString(), MainContentEnum.GET_CERTIFIED.toString());
	}
	
	public String getCSSCodeExampleHeader(){
		String cssCodeExampleHeaderXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(cssCodeExampleHeaderXpathExpression, MainContentEnum.CSS.name()));
	}
	
	public WebElement getCSSSampleCodeSection(){
		String sampleCodeSectionXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(sampleCodeSectionXpathExpression, MainContentEnum.CSS.name()), MainContentEnum.CSS_SAMPLE_CODE_SECTION.toString());
	}
	public WebElement getCSSTryItYourselfButton(){
		return getButtonElementByXpath("//*[text()='CSS Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.CSS_TRY_IT_YOURSELF_BUTTON.toString());
	}
	//endregion

	//region JavaScript section
	public String getJavaScriptHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[2]");
	}
	
	public String getJavaScriptSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[2]/following-sibling::*[1]");
	}
	
	public WebElement getJavaScriptLearnJavaScriptButton(){
		return getLearnButtonElement(MainContentEnum.LEARN_JAVASCRIPT.toString());
	} 
	
	public WebElement getJavaScriptReferenceButton(){
		return getReferenceButton(MainContentEnum.JAVASCRIPT_REFERENCE.toString());
	}
	
	public WebElement getJavaScriptGetCertifiedButton(){
		return getButtonElement(MainContentEnum.JAVASCRIPT_ADD_CERTIFICATION_ID.toString(), MainContentEnum.GET_CERTIFIED.toString());
	}
	
	public String getJavaScriptCodeExampleHeader(){
		String javaScriptCodeHeaderXpathExpression = "(//*[text()='%s'])[3]/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(javaScriptCodeHeaderXpathExpression, MainContentEnum.JAVASCRIPT.toString()));
	}
	
	public WebElement getJavaScriptSampleCodeSection(){
		String javaScriptSampleCodeSectionXpathExpression = "(//*[text()='%s'])[3]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(javaScriptSampleCodeSectionXpathExpression, MainContentEnum.JAVASCRIPT.toString()), MainContentEnum.JAVASCRIPT_SAMPLE_CODE_SECTION.toString());
	}
	
	public WebElement getJavaScriptTryItYourselfButton(){
		return getButtonElementByXpath("//*[text()='JavaScript Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.JAVASCRIPT_TRY_IT_YOURSELF_BUTTON.toString());
	}
	//endregion

	//region Python section
	public String getPythonHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-pink')]/descendant::h1)[1]");
	}
	
	public String getPythonSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-pink')]/descendant::h1)[1]/following-sibling::*[1]");
	}
	
	public WebElement getPythonLearnPythonButton(){
		return getLearnButtonElement(MainContentEnum.LEARN_PYTHON.toString());
	} 
	
	public WebElement getPythonReferenceButton(){
		return getReferenceButton(MainContentEnum.PYTHON_REFERENCE.toString());
	}
	
	public WebElement getPythonGetCertifiedButton(){
		return getButtonElement(MainContentEnum.PYTHON_ADD_CERTIFICATION_ID.toString(), MainContentEnum.GET_CERTIFIED.toString());
	}	
	
	public String getPythonCodeExampleHeader(){
		String pythonCodeHeaderXpathExpression = "(//*[text()='%s'])/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(pythonCodeHeaderXpathExpression, MainContentEnum.PYTHON.toString()));
	}
	
	public WebElement getPythonSampleCodeSection(){
		String pythonSampleCodeSection = "//*[text()='%s']/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(pythonSampleCodeSection, MainContentEnum.PYTHON.toString()), MainContentEnum.PYTHON_SAMPLE_CODE_SECTION.toString());
	}

	public WebElement getPythonTryItYourselfButton(){
		return getButtonElementByXpath("//*[text()='Python Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.PYTHON_TRY_IT_YOURSELF_BUTTON.toString());
	}
	//endregion

	//region SQL section
	public String getSQLHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'turquoise')]/descendant::h1)[1]");
	}
	
	public String getSQLSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'turquoise')]/descendant::h1)[1]/following-sibling::*[1]");
	}
	
	public WebElement getSQLLearnSQLButton(){
		return getLearnButtonElement(MainContentEnum.LEARN_SQL.toString());
	} 
	
	public WebElement getSQLReferenceButton(){
		return getReferenceButton(MainContentEnum.SQL_REFERENCE.toString());
	}
	
	public WebElement getSQLGetCertifiedButton(){
		return getButtonElement(MainContentEnum.SQL_ADD_CERTIFICATION_ID.toString(), MainContentEnum.GET_CERTIFIED.toString());
	}
	
	public String getSQLCodeExampleHeader(){
		String sqlCodeExampleHeader = "(//*[text()='%s'])/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(sqlCodeExampleHeader, MainContentEnum.SQL.name()));
	}
	
	public WebElement getSQLSampleCodeSection(){
		String sqlSampleCodeXpathExpression = "//*[text()='%s']/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(sqlSampleCodeXpathExpression, MainContentEnum.SQL.name()), MainContentEnum.SQL_SAMPLE_CODE_SECTION.toString());
	}

	public WebElement getSQLTryItYourselfButton(){
		return getButtonElementByXpath("//*[text()='SQL Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.SQL_TRY_IT_YOURSELF_BUTTON.toString());
	}
	//endregion

	//region Other tutorials section
	public void scrollToOtherTutorialsSection(){
		control.scrollToElement(getElementByXpath("(//*[contains(@class, 'ws-black')])[3]", MainContentEnum.OTHER_TUTORIALS_SECTION.toString()));
	}
	//endregion

	//region PHP section
	public String getPHPSubheader(){
		return getSubheaderValue(MainContentEnum.PHP.name());
	}
	//endregion

	//region jQuery section
	public String getjQuerySubheader(){
		return getSubheaderValue(MainContentEnum.JQUERY.toString());
	}
	//endregion

	//region Java section
	public String getJavaSubheader(){
		return getSubheaderValue(MainContentEnum.JAVA.toString());
	}
	//endregion

	//region C++ section
	public String getCplusplusSubheader(){
		return getSubheaderValue(MainContentEnum.CPLUSPLUS.toString());
	}
	//endregion

	//region W3.CSS section
	public String getW3CSSSubheader(){
		return getSubheaderValue(MainContentEnum.W3CSS.toString());
	}
	//endregion

	//region Bootstrap section
	public String getBootstrapSubheader(){
		return getSubheaderValue(MainContentEnum.BOOTSTRAP.toString());
	}
	//endregion

	//region Other tutorials button list section
	public void scrollToButton(String nameOfTutorial){
		
		if(nameOfTutorial.equals("Typing Speed")){
			
			nameOfTutorial = "Graphics"; 
			
		}
		
		nameOfTutorial = nameOfTutorial + " Tutorial";
		
		WebElement element = getButtonElement(nameOfTutorial);

		control.scrollToElement(element);
	}
	
	public WebElement getOtherTutorialButton(String nameOfTutorial){

		if(nameOfTutorial.equals("Typing Speed")){
	
			nameOfTutorial = "Graphics"; 
			
		}
		
		nameOfTutorial = nameOfTutorial + " Tutorial";
		
		return getButtonElement(nameOfTutorial);
	}
	//endregion

	//region Code editor section
	public void scrollToCodeEditorSection(){
		control.scrollToElement(getElementByXpath("//*[@class='codeeditorbr-container']", MainContentEnum.CODE_EDITOR_SECTION.toString()));
	}
	
	public String getCodeEditorHeader(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[3]");
	}
	
	public String getCodeEditorSubheader(){
		return getTextOfElementUsingXpathLocator("((//*[contains(@class, 'black')]/descendant::h1)[3]/following-sibling::*)[1]");
	}
	//endregion

	//region Code editor window section
	public WebElement getCodeEditorDotButton(int dotButtonNumber){
		return getButtonElementByXpath(String.format("((//*[contains(@class, 'codeeditorbr-container')])[1]/descendant::*[contains(@class, 'dot')])[%s]", dotButtonNumber), String.format("Code editor dot [%s]", dotButtonNumber));
	}
	
	public String getCodeEditorUrlValue(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'codeeditorbr-container')])[1]/descendant::input");
	}
	
	public WebElement getCodeEditorFrontendActive(){
		return getButtonElementByXpath("//*[contains(@class, 'ws-grey') and text()='Frontend']", MainContentEnum.FRONT_END_ACTIVE_BUTTON.toString());
	}
	
	public int getCodeEditorFrontendActiveDisplayCount(){
		return getButtonElementCountByXpath("//*[contains(@class, 'ws-grey') and text()='Frontend']", MainContentEnum.FRONT_END_ACTIVE_BUTTON.toString());
	}
	
	private WebElement getCodeEditorFrontEndNotActive(){
		return getButtonElementByXpath("//*[contains(@class, 'codeeditorbr-tablink') and text()='Frontend']", MainContentEnum.FRONT_END_INACTIVE_BUTTON.toString());
	}
	
	public void clickFrontendButton(){
		control.clickButton(getCodeEditorFrontEndNotActive());
	}

	public WebElement getCodeEditorBackEndActive(){
		return getButtonElementByXpath("//*[contains(@class, 'ws-grey') and text()='Backend']", MainContentEnum.BACK_END_ACTIVE_BUTTON.toString());
	}

	public int getCodeEditorBackEndActiveDisplayCount(){
		return getButtonElementCountByXpath("//*[contains(@class, 'ws-grey') and text()='Backend']", MainContentEnum.BACK_END_ACTIVE_BUTTON.toString());
	}
		
	private WebElement getCodeEditorBackendNotActive(){
		return getButtonElementByXpath("//*[contains(@class, 'codeeditorbr-tablink') and text()='Backend']", MainContentEnum.BACK_END_INACTIVE_BUTTON.toString());
	}

	public void clickBackEndButton(){
		control.clickButton(getCodeEditorBackendNotActive());
		
		control.waitForElementToBeDisplayedInPage(By.xpath("//*[@id='Backend']/descendant::*[@src='/tryit/best2.gif']"));
	}

	public WebElement getCodeEditorFrontendGIF(){
		return getElementByXpath("//*[@id='Frontend']/descendant::*[@src='codeeditor.gif']", MainContentEnum.FRONT_END_GIF.toString());
	}

	public WebElement getCodeEditorBackendGIF(){
		return getElementByXpath("//*[@id='Backend']/descendant::*[@src='/tryit/best2.gif']", MainContentEnum.BACK_END_GIF.toString());
	}
	
	public WebElement getCodeEditorTryFrontend(){
		return getButtonElementByXpath("//*[text()='Try Frontend Editor (HTML/CSS/JS)']", MainContentEnum.FRONT_END_EDITOR_BUTTON.toString());
	}
	
	public WebElement getCodeEditorTryBackend(){
		return getButtonElementByXpath("//*[text()='Try Backend Editor (Python/PHP/Java/C..)']", MainContentEnum.BACK_END_EDITOR_BUTTON.toString());
	}
	//endregion

	//region W3Schools Spaces section
	public void scrollToW3SchoolsSpacesSection(){
		
		control.scrollToElement(getElementByXpath("//*[text()='W3Schools Spaces']/parent::*", MainContentEnum.W3SCHOOLS_SPACES.toString()));
	}
	
	public WebElement getW3SchoolsSpacesHeader(){
		
		return getElementByXpath("//*[text()='W3Schools Spaces']", MainContentEnum.W3SCHOOLS_SPACES.toString());
	}
	
	public String getW3SchoolsSpacesSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='W3Schools Spaces']/following-sibling::*[1]");
	}
	
	public WebElement getW3SchoolsSpacesSampleScreenshot(){
		
		String xpathExpression = "//*[text()='W3Schools Spaces']/following-sibling::*[@src='/pro/pic_spaces_ide.png']";
		
		control.waitForElementToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, MainContentEnum.W3SCHOOLS_SPACES_SCREENSHOT.toString());
	}
	
	public void scrollToW3SchoolsSpacesScreenshotsSection(){
		
		control.scrollToElement(getW3SchoolsSpacesSampleScreenshot());
	}
	
	public WebElement getW3SchoolsSpacesHowItWorksImage(){
		
		String xpathExpression = "//*[text()='W3Schools Spaces']/following-sibling::*[@src='how-spaces-works3.png']";
		
		control.waitForElementToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, MainContentEnum.W3SCHOOLS_SPACES_HOW_IT_WORKS_IMAGE.toString());
	}
	
	public WebElement getW3schoolsSpacesGetStartedNowButton(){
		return getButtonElementByXpath("//*[contains(@class, 'tut-button') and text()='Get Started Now']", MainContentEnum.W3SCHOOLS_SPACES_GET_STARTED_NOW_BUTTON.toString());
	}
	//endregion

	//region My Learning section
	public void scrollToMyLearningSection(){
		control.scrollToElement(getElementByXpath("//*[text()='My Learning']/parent::*", MainContentEnum.MY_LEARNING_SECTION.toString()));
	}
	
	public WebElement getMyLearningHeader(){
		return getElementByXpath("//*[text()='My Learning']/parent::*", MainContentEnum.MY_LEARNING_HEADER.toString());
	}
	
	public String getMyLearningSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='My Learning']/following-sibling::*[1]");
	}
	
	public WebElement getMyLearningFreeStrongText(){
		return getElementByXpath("//*[text()='My Learning']/following-sibling::*[1]/descendant::strong[text()='free']", "free");
	}
	
	public String getMyLearning2ndSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='My Learning']/following-sibling::*[2]");
	}
	
	String myLearningSampleScreenshotId = "img_mylearning";
	
	public void scrollToMyLearningSampleScreenshot(){
		control.scrollToElement(getElementById(myLearningSampleScreenshotId, MainContentEnum.MY_LEARNING_SAMPLE_SCREENSHOT));
	}
	
	public WebElement getMyLearningSampleScreenshot(){
		control.waitForElementToBeDisplayedInPage(By.id(myLearningSampleScreenshotId));
		
		return getElementById(myLearningSampleScreenshotId, MainContentEnum.MY_LEARNING_SAMPLE_SCREENSHOT);
	}
	
	public WebElement getMyLearningSignupButton(){
		return getButtonElementById("myLearningFromDefault", MainContentEnum.MY_LEARNING_SIGN_UP_FOR_FREE_BUTTON.toString());
	}
	//endregion

	//region Become a Pro user section
	public void scrollToBecomeProUserSection(){
		control.scrollToElement(getElementByXpath("//*[text()='Become a PRO User']/parent::*", MainContentEnum.BECOME_A_PRO_USER_SECTION.toString()));
	}
	
	public WebElement getBecomeProUserHeader(){
		return getElementByXpath("//*[text()='Become a PRO User']/parent::*", MainContentEnum.BECOME_A_PRO_USER_HEADER.toString());
	}
	
	public String getBecomeProUserSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='Become a PRO User']/following-sibling::*[1]");		
	}
	
	//1st checkbox
	public WebElement getBecomeProUser1stCheckbox(){
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[1]", MainContentEnum.BECOME_A_PRO_USER_1ST_CHECKBOX.toString());
	}
	
	public String getBecomeProUser1stCheckboxText(){
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[1]");
	}
	
	public WebElement getBecomeProUser1stCheckboxStrongText(){
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg']/following-sibling::*)[1]", "without ads");
	}
	
	//2nd checkbox
	public WebElement getBecomeProUser2ndCheckbox(){
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[2]", MainContentEnum.BECOME_A_PRO_USER_2ND_CHECKBOX.toString());
	}
	
	public String getBecomeProUser2ndCheckboxText(){
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[2]");
	}
	
	public WebElement getBecomeProUser2ndCheckboxLink(){
		return getElementByLinkText("Spaces", MainContentEnum.BECOME_A_PRO_USER_2ND_CHECKBOX_LINK.toString());
	}
	
	//3rd checkbox
	public WebElement getBecomeProUser3rdCheckbox(){
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[3]", MainContentEnum.BECOME_A_PRO_USER_3RD_CHECKBOX.toString());
	}
	
	public String getBecomeProUser3rdCheckboxText(){
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[3]");
	}
	
	public WebElement getBecomeProUser3rdCheckboxLink(){
		return getElementByLinkText("HTML Video Tutorial", MainContentEnum.BECOME_A_PRO_USER_3RD_CHECKBOX_HTML_VIDEO_LINK.toString());
	}
	
	public WebElement getBecomeProUserLearnMoreButton(){
		return getButtonElementById("proFromDefault", MainContentEnum.BECOME_A_PRO_USER_3RD_CHECKBOX_LEARN_MORE_LINK.toString());
	}
	//endregion

	//region Color Picker section
	public void scrollToColorPickerSection(){
		control.scrollToElement(getElementByXpath("//*[text()='Color Picker']/parent::*", MainContentEnum.COLOR_PICKER_SECTION.toString()));
	}
	
	public WebElement getColorPickerHeader(){
		return getElementByXpath("//*[text()='Color Picker']", MainContentEnum.COLOR_PICKER_HEADER.toString());
	}
	
	public String getColorPickerSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='Color Picker']/following-sibling::*[1]");
	}
	
	public WebElement getColorPickerImage(){
		return getElementByXpath("//*[text()='Color Picker']/following-sibling::*[2]/*[@src='/images/colorpicker.png']", MainContentEnum.COLOR_PICKER_IMAGE.toString());
	}
	//endregion

	//region Code Game section
	public void scrollToCodeGameSection(){
		control.scrollToElement(getElementByXpath("//*[text()='Code Game']/parent::*", MainContentEnum.CODE_GAME_SECTION.toString()));
	}
	
	public WebElement getCodeGameHeader(){
		return getElementByXpath("//*[text()='Code Game']", MainContentEnum.CODE_GAME_HEADER.toString());
	}
	
	public String getCodeGameSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='Code Game']/following-sibling::*[1]");
	}
	
	public WebElement getCodeGameImageOfLynx(){
		String xpathExpression = "//*[text()='Code Game']/following-sibling::*/descendant::*[@src='/images/w3lynx_200.png']";
		
		control.waitForElementToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, "Image of Lynx");
	}
	
	public WebElement getCodeGamePlayGameButton(){
		return getButtonElementByXpath("//*[text()='Play Game']", "Play Game");
	}
	//endregion

	//region Exercises and Quizzes section
	public void scrollToExercisesQuizzesSection(){
		control.scrollToElement(getElementByXpath("(//*[text()='Exercises and Quizzes']/parent::*)[2]", "Exercises and Quizzes section"));
	}
	
	public WebElement getExercisesAndQuizzesHeader(){
		return getElementByXpath("(//*[text()='Exercises and Quizzes'])[2]", "Exercises and Quizzes header");
	}
	
	public String getExercisesAndQuizzesSubheader(){
		return getTextOfElementUsingXpathLocator("(//*[text()='Exercises and Quizzes']/following-sibling::*)[1]");
	}
	
	public WebElement getExercisesAndQuizzesExercisesButton(){
		return getButtonElementByXpath("(//*[text()='Exercises'])[2]/parent::*", "Exercises");
	}
	
	public WebElement getExercisesAndQuizzesQuizzesButton(){
		return getButtonElementByXpath("(//*[text()='Quizzes'])[2]/parent::*", "Quizzes");
	}
	//endregion

	//region Web Templates section
	public void scrollToWebTemplatesSection(){
		control.scrollToElement(getElementByXpath("(//*[text()='Web Templates'])[2]/parent::*", "Web Templates section"));
	}
	
	public WebElement getWebTemplatesHeader(){
		return getElementByXpath("(//*[text()='Web Templates'])[2]", "Web Templates header");
	}
	
	public String getWebTemplatesSubheader(){
		return getTextOfElementUsingXpathLocator("(//*[text()='Web Templates'])[2]/following-sibling::*[2]");
	}
	
	public WebElement getWebTemplatesSubheaderFreeText(){
		return getElementByXpath("(//*[text()='Web Templates'])[2]/following-sibling::*[2]/descendant::strong[text()='free']", "free");
	}
	
	public WebElement getWebTemplatesSampleImage(){
		String xpathExpression = "(//*[text()='Web Templates'])[2]/following-sibling::*/descendant::*[@src='w3css_templates.jpg']";
		
		control.waitForElementToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, "Web Templates sample images");
	}
	
	public WebElement getWebTemplatesBrowseTemplatesButton(){
		return getButtonElementByXpath("(//*[text()='Web Templates'])[2]/following-sibling::*/descendant::*[text()='Browse Templates']", "Browse Templates");
	}
	//endregion

	//region Certification section
	public void scrollToCertificationSection(){
		control.scrollToElement(getElementById("getdiploma", "Certification section"));
	}
	
	public WebElement getCertificationHeader(){
		return getElementByXpath("//*[@id='getdiploma']/descendant::*[text()='Kickstart your career']", "Kickstart your career header");
	}
	
	public String getCertificationSubheader(){
		return getTextOfElementUsingXpathLocator("//*[@id='getdiploma']/descendant::*[text()='Kickstart your career']/following-sibling::*[1]");
	}
	
	public WebElement getCertificationGetStartedButton(){
		return getButtonElementByXpath("//*[@id='getdiploma']/descendant::*[text()='Kickstart your career']/following-sibling::*[text()='Get started']", "Get started");
	}
	
	public WebElement getCertificationArrow(){
		return getElementById("w3_cert_arrow", "Arrow pointing to certification badge");
	}
	
	public WebElement getCertificationBadge(){
		return getElementById("w3_cert_badge", "Certification badge");
	}
	//endregion

	//region How To section
	public void scrollToHowToSection(){
		control.scrollToElement(getElementById("howto_padding", "How To Section"));
	}
	
	public WebElement getHowToSectionHeader(){
		return getElementByXpath("//*[@id='howto_padding']/descendant::*[text()='How To Section']", "How To Section header");
	}
	
	public String getHowToSectionSubheader(){
		return getTextOfElementUsingXpathLocator("//*[@id='howto_padding']/descendant::*[2]");
	}
	
	public String getHowToSection2ndSubheader(){
		return getTextOfElementUsingXpathLocator("//*[@id='howto_padding']/descendant::*[3]");
	}
	
	public WebElement getHowToSectionSampleWindowDotButton(int dotButtonNumber){
		return getButtonElementByXpath(String.format("((//*[contains(@class, 'codeeditorbr-container')])[2]/descendant::*[contains(@class, 'dot')])[%s]", dotButtonNumber), String.format("How To Section Window dot - %s", dotButtonNumber));
	}
	
	public String getHowToSectionSampleWindowUrlValue(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'codeeditorbr-container')])[2]/descendant::input");
	}
	
	int slideNumber = 1;
	
	public void scrollToHowToSectionSliderContainer(){
		control.scrollToElement(getElementByXpath("(//*[@class='codeeditorbr-container'])[2]", "How To Section window"));
	}
	
	public WebElement getHowToSectionSampleWindowPreviousButton(){
		return getElementByClass("prev", "How To Section Sample Window - Previous button");
	}
	
	public void switchToHowToSliderFrame(){
		switchToIframe(getElementById("howto_iframe", "How To Section - Slider"));
	}
	
	private void incrementSlideNumber(){
		slideNumber++;
		
		if(slideNumber == 4){
			slideNumber = 1;
		}
	}
	
	private void decrementSlideNumber(){
		slideNumber--;
		
		if(slideNumber == 0){
			slideNumber = 3;
		}
	}
	
	public void clickPreviousButton(){
		control.clickButton(getHowToSectionSampleWindowPreviousButton());
		
		decrementSlideNumber();
	}
	
	public void clickNextButton(){
		control.clickButton(getHowToSectionSampleWindowNextButton());
		
		incrementSlideNumber();
	}
	
	private int getArrayIndex(int slideNumber){
		return slideNumber - 1;
	}
	
	public WebElement getHowToSectionSampleWindowNextButton(){
		return getElementByClass("next", "How To Section Sample Window - Next button");
	}
	
	public WebElement getHowToSectionSampleWindowCounter(){
		return getElementByXpath(String.format("(//*[@class='numbertext'])[%s]", slideNumber), String.format("How to slider: %s / 3", slideNumber));
	}
	
	public WebElement getHowToSectionSampleWindowCaptionText(){
		String[] captionsArray = {"Caption Text", "Caption Two", "Caption Three"};

		return getElementByXpath(String.format("(//*[@class='text'])[%s]", slideNumber), String.format("Slider caption: %s", captionsArray[getArrayIndex(slideNumber)]));
	}
	
	public WebElement getHowToSectionSampleWindowImage(){
		String[] filesImagesArray = {"img_nature_wide.jpg", "img_snow_wide.jpg", "img_mountains_wide.jpg"};

		return getElementByXpath(String.format("//*[@src='%s']",filesImagesArray[getArrayIndex(slideNumber)]), String.format("Slider image: %s", slideNumber));		
	}
	
	public WebElement getHowtoSectionActiveDot(){
		return getElementByXpath(String.format("//*[contains(@class, 'dot active') and @onclick='currentSlide(%s)']", slideNumber), String.format("How To Section - Active Dot: %s", slideNumber));
	}
	
	public WebElement getHowToLearnButton(){
		return getButtonElementByXpath("//*[@id='howto_padding']/descendant::*[text()='Learn How To']", "Learn How To");
	}
	//endregion
}