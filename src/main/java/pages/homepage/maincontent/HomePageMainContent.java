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
	
	public WebElement getHeaderElement(String nameOfTheSection){
		String headerXpathExpression = "//*[text()='%s']";
		
		return getElementByXpath(String.format(headerXpathExpression, nameOfTheSection), nameOfTheSection + " header");
	}

	public WebElement getHeaderElement(Object nameOfTheSection){
		String headerXpathExpression = "//*[text()='%s']";

		return getElementByXpath(String.format(headerXpathExpression, nameOfTheSection), nameOfTheSection + " header");
	}
	
	private String getSubheaderValue(String nameOfTheSection){
		String subheaderXpathExpression = "//*[text()='%s']/following-sibling::*/descendant::*";
		
		return getTextOfElementUsingXpathLocator(String.format(subheaderXpathExpression, nameOfTheSection));
	}

	private String getSubheaderValue(Object nameOfTheSection){
		String subheaderXpathExpression = "//*[text()='%s']/following-sibling::*/descendant::*";

		return getTextOfElementUsingXpathLocator(String.format(subheaderXpathExpression, nameOfTheSection));
	}
	
	public WebElement getLearnButtonElement(String nameOfTheButton){
		String learnButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";
		
		return getButtonElementByXpath(String.format(learnButtonXpathExpression, nameOfTheButton), nameOfTheButton);
	}

	public WebElement getLearnButtonElement(Object nameOfTheButton){
		String learnButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";

		return getButtonElementByXpath(String.format(learnButtonXpathExpression, nameOfTheButton), nameOfTheButton);
	}
	
	private WebElement getReferenceButton(String nameOfTheButton){
		String referenceButtonXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";
		
		return getButtonElementByXpath(String.format(referenceButtonXpathExpression, nameOfTheButton), nameOfTheButton);
	}

	private WebElement getReferenceButton(Object nameOfTheButton){
		String referenceButtonXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";

		return getButtonElementByXpath(String.format(referenceButtonXpathExpression, nameOfTheButton), nameOfTheButton);
	}

	public WebElement getSubheaderTextInMainContent(){
		String learnToCodeSubheaderXpathExpression = "//*[text()=\"%s\"]";
		
		return getElementByXpath(String.format(learnToCodeSubheaderXpathExpression, MainContentEnum.LEARN_TO_CODE_SUB_HEADER),
				MainContentEnum.LEARN_TO_CODE_SUB_HEADER + " subheader");
	}
	
	public WebElement getSearchbarField(){
		return getElementById("search2", MainContentEnum.SEARCH_FIELD);
	}
	
	public String getSearchbarfieldPlaceholder(){
		return getPlaceholderTextOfField(getSearchbarField());
	}

	public WebElement getSearchbarButton(){
		return getButtonElementById("learntocode_searchbtn", MainContentEnum.SEARCH_FIELD_BUTTON);
	}
	
	public WebElement getWhereToBeginLink(){
		return getElementByLinkText(MainContentEnum.NOT_SURE_WHERE_TO_BEGIN_LINK);
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
		control.scrollToElement(getElementByXpath(String.format("//h1[text()='%s']/parent::*/parent::*/parent::*", MainContentEnum.HTML.name()), MainContentEnum.HTML + " section"));
	}
	
	public String getHtmlHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-green')]/descendant::h1)[1]");
	}
	
	public String getHtmlSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-green')]/descendant::h1/following-sibling::*)[1]");
	}
	
	public WebElement getHtmlLearnHtmlButton(){
		return getLearnButtonElement(MainContentEnum.LEARN_HTML);
	}
	
	public WebElement getHtmlVideoTutorialButton(){
		return getButtonElement("HTML video tutorial", MainContentEnum.VIDEO_TUTORIAL);
	}
	
	public WebElement getHtmlReferenceButton(){
		return getReferenceButton(MainContentEnum.HTML_REFERENCE);
	}
	
	public WebElement getHtmlGetCertifiedButton(){
		
		return getButtonElement(MainContentEnum.HTML_ADD_CERTIFICATION_ID.toString(), MainContentEnum.GET_CERTIFIED);
	}
	
	public String getHtmlCodeExampleHeader(){
		String htmlCodeExampleHeaderXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(htmlCodeExampleHeaderXpathExpression, MainContentEnum.HTML.name()));
	}
	
	public WebElement getHtmlSampleCodeSection(){
		String htmlSampleCodeXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getButtonElementByXpath(String.format(htmlSampleCodeXpathExpression, MainContentEnum.HTML.name()), MainContentEnum.HTML_SAMPLE_CODE_SECTION);
	}

	public WebElement getHtmlTryItYourselfButton(){
		return getButtonElementByXpath("(//*[text()='HTML Example:']/following-sibling::*[text()='Try it Yourself'])[1]", MainContentEnum.HTML_TRY_IT_YOURSELF_BUTTON);
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
		return getLearnButtonElement(MainContentEnum.LEARN_CSS);
	} 
	
	public WebElement getCSSReferenceButton(){
		return getReferenceButton(MainContentEnum.CSS_REFERENCE);
	}
	
	public WebElement getCSSGetCertifiedButton(){
		return getButtonElement("Add CSS Certification", MainContentEnum.GET_CERTIFIED);
	}
	
	public String getCSSCodeExampleHeader(){
		String cssCodeExampleHeaderXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(cssCodeExampleHeaderXpathExpression, MainContentEnum.CSS.name()));
	}
	
	public WebElement getCSSSampleCodeSection(){
		String sampleCodeSectionXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(sampleCodeSectionXpathExpression, MainContentEnum.CSS.name()), MainContentEnum.CSS_SAMPLE_CODE_SECTION);
	}
	public WebElement getCSSTryItYourselfButton(){
		return getButtonElementByXpath("//*[text()='CSS Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.CSS_TRY_IT_YOURSELF_BUTTON);
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
		return getLearnButtonElement(MainContentEnum.LEARN_JAVASCRIPT);
	} 
	
	public WebElement getJavaScriptReferenceButton(){
		return getReferenceButton(MainContentEnum.JAVASCRIPT_REFERENCE);
	}
	
	public WebElement getJavaScriptGetCertifiedButton(){
		return getButtonElement("Add JavaScript Certification", MainContentEnum.GET_CERTIFIED);
	}
	
	public String getJavaScriptCodeExampleHeader(){
		String javaScriptCodeHeaderXpathExpression = "(//*[text()='%s'])[3]/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(javaScriptCodeHeaderXpathExpression, MainContentEnum.JAVASCRIPT));
	}
	
	public WebElement getJavaScriptSampleCodeSection(){
		String javaScriptSampleCodeSectionXpathExpression = "(//*[text()='%s'])[3]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(javaScriptSampleCodeSectionXpathExpression, MainContentEnum.JAVASCRIPT), MainContentEnum.JAVASCRIPT_SAMPLE_CODE_SECTION);
	}
	
	public WebElement getJavaScriptTryItYourselfButton(){
		return getButtonElementByXpath("//*[text()='JavaScript Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.JAVASCRIPT_TRY_IT_YOURSELF_BUTTON);
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
		return getLearnButtonElement(MainContentEnum.LEARN_PYTHON);
	} 
	
	public WebElement getPythonReferenceButton(){
		return getReferenceButton(MainContentEnum.PYTHON_REFERENCE);
	}
	
	public WebElement getPythonGetCertifiedButton(){
		return getButtonElement("Add Python Certification", MainContentEnum.GET_CERTIFIED);
	}	
	
	public String getPythonCodeExampleHeader(){
		String pythonCodeHeaderXpathExpression = "(//*[text()='%s'])/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(pythonCodeHeaderXpathExpression, MainContentEnum.PYTHON));
	}
	
	public WebElement getPythonSampleCodeSection(){
		String pythonSampleCodeSection = "//*[text()='%s']/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(pythonSampleCodeSection, MainContentEnum.PYTHON), MainContentEnum.PYTHON_SAMPLE_CODE_SECTION);
	}

	public WebElement getPythonTryItYourselfButton(){
		return getButtonElementByXpath("//*[text()='Python Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.PYTHON_TRY_IT_YOURSELF_BUTTON);
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
		return getLearnButtonElement(MainContentEnum.LEARN_SQL);
	} 
	
	public WebElement getSQLReferenceButton(){
		return getReferenceButton(MainContentEnum.SQL_REFERENCE);
	}
	
	public WebElement getSQLGetCertifiedButton(){
		return getButtonElement("Add SQL Certification", MainContentEnum.GET_CERTIFIED);
	}
	
	public String getSQLCodeExampleHeader(){
		String sqlCodeExampleHeader = "(//*[text()='%s'])/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(sqlCodeExampleHeader, MainContentEnum.SQL.name()));
	}
	
	public WebElement getSQLSampleCodeSection(){
		String sqlSampleCodeXpathExpression = "//*[text()='%s']/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(sqlSampleCodeXpathExpression, MainContentEnum.SQL.name()), MainContentEnum.SQL_SAMPLE_CODE_SECTION + " section");
	}

	public WebElement getSQLTryItYourselfButton(){
		return getButtonElementByXpath("//*[text()='SQL Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.SQL_TRY_IT_YOURSELF_BUTTON);
	}
	//endregion

	//region Other tutorials section
	public void scrollToOtherTutorialsSection(){
		control.scrollToElement(getElementByXpath("(//*[contains(@class, 'ws-black')])[3]", MainContentEnum.OTHER_TUTORIALS_SECTION));
	}
	//endregion

	//region PHP section
	public String getPHPSubheader(){
		return getSubheaderValue(MainContentEnum.PHP.name());
	}
	//endregion

	//region jQuery section
	public String getjQuerySubheader(){
		return getSubheaderValue(MainContentEnum.JQUERY);
	}
	//endregion

	//region Java section
	public String getJavaSubheader(){
		return getSubheaderValue(MainContentEnum.JAVA);
	}
	//endregion

	//region C++ section
	public String getCplusplusSubheader(){
		return getSubheaderValue(MainContentEnum.CPLUSPLUS);
	}
	//endregion

	//region W3.CSS section
	public String getW3CSSSubheader(){
		return getSubheaderValue(MainContentEnum.W3CSS);
	}
	//endregion

	//region Bootstrap section
	public String getBootstrapSubheader(){
		return getSubheaderValue(MainContentEnum.BOOTSTRAP);
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
		control.scrollToElement(getElementByXpath("//*[@class='codeeditorbr-container']", MainContentEnum.CODE_EDITOR_SECTION));
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
		return getButtonElementByXpath("//*[contains(@class, 'ws-grey') and text()='Frontend']", MainContentEnum.FRONT_END_ACTIVE_BUTTON);
	}
	
	public int getCodeEditorFrontendActiveDisplayCount(){
		return getButtonElementCountByXpath("//*[contains(@class, 'ws-grey') and text()='Frontend']", MainContentEnum.FRONT_END_ACTIVE_BUTTON);
	}
	
	private WebElement getCodeEditorFrontEndNotActive(){
		return getButtonElementByXpath("//*[contains(@class, 'codeeditorbr-tablink') and text()='Frontend']", MainContentEnum.FRONT_END_INACTIVE_BUTTON);
	}
	
	public void clickFrontendButton(){
		control.clickButton(getCodeEditorFrontEndNotActive());
	}

	public WebElement getCodeEditorBackEndActive(){
		return getButtonElementByXpath("//*[contains(@class, 'ws-grey') and text()='Backend']", MainContentEnum.BACK_END_ACTIVE_BUTTON);
	}

	public int getCodeEditorBackEndActiveDisplayCount(){
		return getButtonElementCountByXpath("//*[contains(@class, 'ws-grey') and text()='Backend']", MainContentEnum.BACK_END_ACTIVE_BUTTON);
	}
		
	private WebElement getCodeEditorBackendNotActive(){
		return getButtonElementByXpath("//*[contains(@class, 'codeeditorbr-tablink') and text()='Backend']", MainContentEnum.BACK_END_INACTIVE_BUTTON);
	}

	public void clickBackEndButton(){
		control.clickButton(getCodeEditorBackendNotActive());
		
		control.waitForElementToBeDisplayedInPage(By.xpath("//*[@id='Backend']/descendant::*[@src='/tryit/best2.gif']"));
	}

	public WebElement getCodeEditorFrontendGIF(){
		return getElementByXpath("//*[@id='Frontend']/descendant::*[@src='codeeditor.gif']", MainContentEnum.FRONT_END_GIF);
	}

	public WebElement getCodeEditorBackendGIF(){
		return getElementByXpath("//*[@id='Backend']/descendant::*[@src='/tryit/best2.gif']", MainContentEnum.BACK_END_GIF);
	}
	
	public WebElement getCodeEditorTryFrontend(){
		return getButtonElementByXpath("//*[text()='Try Frontend Editor (HTML/CSS/JS)']", MainContentEnum.FRONT_END_EDITOR_BUTTON);
	}
	
	public WebElement getCodeEditorTryBackend(){
		return getButtonElementByXpath("//*[text()='Try Backend Editor (Python/PHP/Java/C..)']", MainContentEnum.BACK_END_EDITOR_BUTTON);
	}
	//endregion

	//region W3Schools Spaces section
	public void scrollToW3SchoolsSpacesSection(){
		
		control.scrollToElement(getElementByXpath("//*[text()='W3Schools Spaces']/parent::*", MainContentEnum.W3SCHOOLS_SPACES));
	}
	
	public WebElement getW3SchoolsSpacesHeader(){
		
		return getElementByXpath("//*[text()='W3Schools Spaces']", MainContentEnum.W3SCHOOLS_SPACES);
	}
	
	public String getW3SchoolsSpacesSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='W3Schools Spaces']/following-sibling::*[1]");
	}

	public String getW3SchoolsSpaces2ndSubheader(){

		return getTextOfElementUsingXpathLocator("//*[text()='W3Schools Spaces']/following-sibling::*[2]");
	}

	public WebElement getW3SchoolsSpacesSampleGIF(){

		return getElementByXpath("//*[text()='W3Schools Spaces']/following-sibling::*[@src='/spaces/dynamicspaces.gif']", MainContentEnum.W3SCHOOLS_DEMO_GIF);
	}

	public WebElement getW3SchoolsSpacesHowItWorksImage(){
		
		String xpathExpression = "//*[text()='W3Schools Spaces']/following-sibling::*[@src='how-spaces-works3.png']";
		
		control.waitForElementToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, MainContentEnum.W3SCHOOLS_SPACES_HOW_IT_WORKS_IMAGE);
	}
	
	public WebElement getW3schoolsSpacesGetStartedNowButton(){
		return getButtonElementByXpath("//*[text()='W3Schools Spaces']/following-sibling::*[contains(@class, 'tut-button') and text()='Learn More']", MainContentEnum.W3SCHOOLS_SPACES_GET_STARTED_NOW_BUTTON);
	}
	//endregion

	//region My Learning section
	public void scrollToMyLearningSection(){
		control.scrollToElement(getElementByXpath("//*[text()='My Learning']/parent::*", MainContentEnum.MY_LEARNING_SECTION));
	}
	
	public WebElement getMyLearningHeader(){
		return getElementByXpath("//*[text()='My Learning']/parent::*", MainContentEnum.MY_LEARNING_HEADER);
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
		return getButtonElementById("myLearningFromDefault", MainContentEnum.MY_LEARNING_SIGN_UP_FOR_FREE_BUTTON);
	}
	//endregion

	//region Become a Pro user section
	public void scrollToBecomeProUserSection(){
		control.scrollToElement(getElementByXpath("//*[text()='Become a PRO User']/parent::*", MainContentEnum.BECOME_A_PRO_USER_SECTION));
	}
	
	public WebElement getBecomeProUserHeader(){
		return getElementByXpath("//*[text()='Become a PRO User']/parent::*", MainContentEnum.BECOME_A_PRO_USER_HEADER);
	}
	
	public String getBecomeProUserSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='Become a PRO User']/following-sibling::*[1]");		
	}
	
	//1st checkbox
	public WebElement getBecomeProUser1stCheckbox(){
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[1]", MainContentEnum.BECOME_A_PRO_USER_1ST_CHECKBOX);
	}
	
	public String getBecomeProUser1stCheckboxText(){
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[1]");
	}
	
	public WebElement getBecomeProUser1stCheckboxStrongText(){
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg']/following-sibling::*)[1]", "without ads");
	}
	
	//2nd checkbox
	public WebElement getBecomeProUser2ndCheckbox(){
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[2]", MainContentEnum.BECOME_A_PRO_USER_2ND_CHECKBOX);
	}
	
	public String getBecomeProUser2ndCheckboxText(){
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[2]");
	}
	
	public WebElement getBecomeProUser2ndCheckboxLink(){
		return getElementByLinkText("Spaces", MainContentEnum.BECOME_A_PRO_USER_2ND_CHECKBOX_LINK);
	}
	
	//3rd checkbox
	public WebElement getBecomeProUser3rdCheckbox(){
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[3]", MainContentEnum.BECOME_A_PRO_USER_3RD_CHECKBOX);
	}
	
	public String getBecomeProUser3rdCheckboxText(){
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[3]");
	}
	
	public WebElement getBecomeProUser3rdCheckboxLink(){
		return getElementByLinkText("HTML Video Tutorial", MainContentEnum.BECOME_A_PRO_USER_3RD_CHECKBOX_HTML_VIDEO_LINK);
	}
	
	public WebElement getBecomeProUserLearnMoreButton(){
		return getButtonElementById("proFromDefault", MainContentEnum.BECOME_A_PRO_USER_3RD_CHECKBOX_LEARN_MORE_LINK);
	}
	//endregion

	//region Color Picker section
	public void scrollToColorPickerSection(){
		control.scrollToElement(getElementByXpath("//*[text()='Color Picker']/parent::*", MainContentEnum.COLOR_PICKER_SECTION));
	}
	
	public WebElement getColorPickerHeader(){
		return getElementByXpath("//*[text()='Color Picker']", MainContentEnum.COLOR_PICKER_HEADER);
	}
	
	public String getColorPickerSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='Color Picker']/following-sibling::*[1]");
	}
	
	public WebElement getColorPickerImage(){
		return getElementByXpath("//*[text()='Color Picker']/following-sibling::*[2]/*[@src='/images/colorpicker.png']", MainContentEnum.COLOR_PICKER_IMAGE);
	}
	//endregion

	//region Code Game section
	public void scrollToCodeGameSection(){
		control.scrollToElement(getElementByXpath("//*[text()='Code Game']/parent::*", MainContentEnum.CODE_GAME_SECTION));
	}
	
	public WebElement getCodeGameHeader(){
		return getElementByXpath("//*[text()='Code Game']", MainContentEnum.CODE_GAME_HEADER);
	}
	
	public String getCodeGameSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='Code Game']/following-sibling::*[1]");
	}
	
	public WebElement getCodeGameImageOfLynx(){
		String xpathExpression = "//*[text()='Code Game']/following-sibling::*/descendant::*[@src='/images/w3lynx_200.png']";
		
		control.waitForElementToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, MainContentEnum.CODE_GAME_IMAGE_OF_LYNX);
	}
	
	public WebElement getCodeGamePlayGameButton(){
		return getButtonElementByXpath("//*[text()='Play Game']", MainContentEnum.CODE_GAME_PLAY_GAME_BUTTON);
	}
	//endregion

	//region Exercises and Quizzes section
	public void scrollToExercisesQuizzesSection(){
		control.scrollToElement(getElementByXpath("(//*[text()='Exercises and Quizzes']/parent::*)[2]", MainContentEnum.EXERCISES_AND_QUIZZES_SECTION));
	}
	
	public WebElement getExercisesAndQuizzesHeader(){
		return getElementByXpath("(//*[text()='Exercises and Quizzes'])[2]", MainContentEnum.EXERCISES_AND_QUIZZES_HEADER);
	}
	
	public String getExercisesAndQuizzesSubheader(){
		return getTextOfElementUsingXpathLocator("(//*[text()='Exercises and Quizzes']/following-sibling::*)[1]");
	}
	
	public WebElement getExercisesAndQuizzesExercisesButton(){
		return getButtonElementByXpath("(//*[text()='Exercises'])[2]/parent::*", MainContentEnum.EXERCISES_BUTTON);
	}
	
	public WebElement getExercisesAndQuizzesQuizzesButton(){
		return getButtonElementByXpath("(//*[text()='Quizzes'])[2]/parent::*", MainContentEnum.QUIZZES_BUTTON);
	}
	//endregion

	//region Web Templates section
	public void scrollToWebTemplatesSection(){
		control.scrollToElement(getElementByXpath("(//*[text()='Web Templates'])[2]/parent::*", MainContentEnum.WEB_TEMPLATES_SECTION));
	}
	
	public WebElement getWebTemplatesHeader(){
		return getElementByXpath("(//*[text()='Web Templates'])[2]", MainContentEnum.WEB_TEMPLATES_HEADER);
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
		
		return getElementByXpath(xpathExpression, MainContentEnum.WEB_TEMPLATES_SAMPLE_IMAGES);
	}
	
	public WebElement getWebTemplatesBrowseTemplatesButton(){
		return getButtonElementByXpath("(//*[text()='Web Templates'])[2]/following-sibling::*/descendant::*[text()='Browse Templates']", MainContentEnum.BROWSE_TEMPLATES_BUTTON);
	}
	//endregion

	//region Certification section
	public void scrollToCertificationSection(){
		control.scrollToElement(getElementById("getdiploma", MainContentEnum.CERTIFICATION_SECTION));
	}
	
	public WebElement getCertificationHeader(){
		return getElementByXpath("//*[@id='getdiploma']/descendant::*[text()='Kickstart your career']", MainContentEnum.KICKSTART_YOUR_CAREER_HEADER);
	}
	
	public String getCertificationSubheader(){
		return getTextOfElementUsingXpathLocator("//*[@id='getdiploma']/descendant::*[text()='Kickstart your career']/following-sibling::*[1]");
	}
	
	public WebElement getCertificationGetStartedButton(){
		return getButtonElementByXpath("//*[@id='getdiploma']/descendant::*[text()='Kickstart your career']/following-sibling::*[text()='Get started']", MainContentEnum.CERTIFICATION_GET_STARTED_BUTTON);
	}
	
	public WebElement getCertificationArrow(){
		return getElementById("w3_cert_arrow", MainContentEnum.CERTIFICATION_ARROW);
	}
	
	public WebElement getCertificationBadge(){
		return getElementById("w3_cert_badge", MainContentEnum.CERTIFICATION_BADGE);
	}
	//endregion

	//region How To section
	public void scrollToHowToSection(){
		control.scrollToElement(getElementById("howto_padding", MainContentEnum.HOW_TO_SECTION));
	}
	
	public WebElement getHowToSectionHeader(){
		return getElementByXpath("//*[@id='howto_padding']/descendant::*[text()='How To Section']", MainContentEnum.HOW_TO_HEADER);
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
		control.scrollToElement(getElementByXpath("(//*[@class='codeeditorbr-container'])[2]", MainContentEnum.HOW_TO_WINDOW));
	}
	
	public WebElement getHowToSectionSampleWindowPreviousButton(){
		return getElementByClass("prev", MainContentEnum.HOW_TO_WINDOW_PREVIOUS_BUTTON);
	}
	
	public void switchToHowToSliderFrame(){
		switchToIframe(getElementById("howto_iframe", MainContentEnum.HOW_TO_WINDOW_SLIDER.toString()));
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
		return getElementByClass("next", MainContentEnum.HOW_TO_WINDOW_NEXT_BUTTON);
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
		return getButtonElementByXpath("//*[@id='howto_padding']/descendant::*[text()='Learn How To']", MainContentEnum.LEARN_HOW_TO_BUTTON);
	}
	//endregion
}