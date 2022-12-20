package pages.homepage.maincontent;

import java.text.MessageFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.homepage.maincontent.MainContentEnum;
import pages.BasePage;

public class HomePageMainContent extends BasePage{
	
	public HomePageMainContent(WebDriver driver) {
		super(driver);
	}

	//Main Content
	//region
	public WebElement getMainContent(){
		
		return getElementById("main", MainContentEnum.MAIN_CONTENT_SECTION.toString());
	}
	
	private void scrollToSection(String nameOfTheSection){
		
		String sectionXpathExpression = "//h1[text()='%s']/parent::*/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(sectionXpathExpression, nameOfTheSection), nameOfTheSection + " section"));
	}
	
	private WebElement getHeaderElement(String nameOfTheSection){
	
		String headerXpathExpression = "//*[text()='%s']";
		
		return getElementByXpath(String.format(headerXpathExpression, nameOfTheSection), nameOfTheSection + " header");
	}
	
	private String getSubheaderValue(String nameOfTheSection){
		
		String subheaderXpathExpression = "//*[text()='%s']/following-sibling::*/descendant::*";
		
		return getTextOfElementUsingXpathLocator(String.format(subheaderXpathExpression, nameOfTheSection));
	}
	
	private WebElement getLearnButtonElement(String nameOfTheButton){
		
		String learnButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(learnButtonXpathExpression, nameOfTheButton), nameOfTheButton + " button");
	}
	
	private WebElement getReferenceButton(String nameOfTheButton){
	
		String referenceButtonXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(referenceButtonXpathExpression, nameOfTheButton), 
				nameOfTheButton + " button");
	}
	
	private WebElement getTutorialButton(String nameOfTheButton){
		
		String tutorialButtonExpathExpression = "//*[text()=''{0}'']/following-sibling::*[contains(@class, ''tut-button'') and text()=''Learn {0}'']";
		
		return getElementByXpath(MessageFormat.format(tutorialButtonExpathExpression, nameOfTheButton), nameOfTheButton + " button");
	}
	
	public WebElement getHeaderTextInMainContent(){
		
		return getHeaderElement(MainContentEnum.LEARN_TO_CODE_HEADER.toString());
	}
	
	public WebElement getSubheaderTextInMainContent(){
		
		String learnToCodeSubheaderXpathExpression = "//*[text()=\"%s\"]";
		
		return getElementByXpath(String.format(learnToCodeSubheaderXpathExpression, MainContentEnum.LEARN_TO_CODE_SUBHEADER.toString()), 
				MainContentEnum.LEARN_TO_CODE_SUBHEADER.toString() + " subheader");
	}
	
	public WebElement getSearchbarField(){
		
		return getElementById("search2", MainContentEnum.SEARCH_FIELD.toString());
	}
	
	public String getSearchbarfieldPlaceholder(){
		
		return getPlaceholderTextOfField(getSearchbarField());
	}
	
	public WebElement getSearchbarButton(){
		
		return getElementById("learntocode_searchbtn", MainContentEnum.SEARCH_FIELD_BUTTON.toString() + " button");	
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

	//HTML section
	//region
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
		
		return getButtonElement("Add HTML Certification", MainContentEnum.GET_CERTIFIED.toString());
	}
	
	public String getHtmlCodeExampleHeader(){
		
		String htmlCodeExampleHeaderXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[2]";
		
		return getTextOfElementUsingXpathLocator(String.format(htmlCodeExampleHeaderXpathExpression, MainContentEnum.HTML.name()));
	}
	
	public WebElement getHtmlSampleCodeSection(){
		
		String htmlSampleCodeXpathExpression = "(//*[text()='%s'])[2]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]";
		
		return getElementByXpath(String.format(htmlSampleCodeXpathExpression, MainContentEnum.HTML.name()), MainContentEnum.HTML_SAMPLE_CODE_SECTION.toString());
	}
	
	public WebElement getHtmlTryItYourselfButton(){
		
		return getElementByXpath("(//*[text()='HTML Example:']/following-sibling::*[text()='Try it Yourself'])[1]", MainContentEnum.HTML_TRY_IT_YOURSELF_BUTTON.toString() + " button");
	}
	//endregion

	//CSS Section
	//region
	public void scrollToCSSSection(){
		
		scrollToSection(MainContentEnum.CSS.name());
	}
	
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
		
		return getButtonElement("Add CSS Certification", MainContentEnum.GET_CERTIFIED.toString());
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
		
		return getElementByXpath("//*[text()='CSS Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.CSS_TRY_IT_YOURSELF_BUTTON.toString() + " button");
	}
	//endregion

	//JavaScript section
	//region
	public void scrollToJavaScriptSection(){
		
		scrollToSection(MainContentEnum.JAVASCRIPT.toString());
	}
	
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
		
		return getButtonElement("Add JavaScript Certification", MainContentEnum.GET_CERTIFIED.toString());
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
		
		return getElementByXpath("//*[text()='JavaScript Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.JAVASCRIPT_TRY_IT_YOURSELF_BUTTON.toString());
	}
	//endregion

	//Python section
	//region
	public void scrollToPythonSection(){
		
		scrollToSection(MainContentEnum.PYTHON.toString());
	}
	
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
		
		return getButtonElement("Add Python Certification", MainContentEnum.GET_CERTIFIED.toString());
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
		
		return getElementByXpath("//*[text()='Python Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.PYTHON_TRY_IT_YOURSELF_BUTTON.toString() + " button");
	}
	//endregion
	
	//SQL section
	//region
	public void scrollToSQLSection(){
		
		scrollToSection(MainContentEnum.SQL.name());
	}
	
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
		
		return getButtonElement("Add SQL Certification", MainContentEnum.GET_CERTIFIED.toString());
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
		
		return getElementByXpath("//*[text()='SQL Example:']/following-sibling::*[text()='Try it Yourself']", MainContentEnum.SQL_TRY_IT_YOURSELF_BUTTON.toString() + " button");
	}
	//endregion
	
	//Other tutorials
	//region
	public void scrollToOtherTutorialsSection(){
		
		control.scrollToElement(getElementByXpath("(//*[contains(@class, 'ws-black')])[3]", "Other tutorials section"));
	}
	//endregion
	
	//PHP
	//region
	public WebElement getPHPHeader(){
		
		return getHeaderElement(MainContentEnum.PHP.name());
	}
	
	public String getPHPSubheader(){
		
		return getSubheaderValue(MainContentEnum.PHP.name());
	}

	public WebElement getLearnPHPButton(){
		
		return getTutorialButton(MainContentEnum.PHP.name());
	}
	//endregion

	//jQuery
	//region
	public WebElement getjQueryHeader(){
		
		return getHeaderElement(MainContentEnum.JQUERY.toString());
	}
	
	public String getjQuerySubheader(){
		
		return getSubheaderValue(MainContentEnum.JQUERY.toString());
	}
	
	public WebElement getLearnjQueryButton(){
		
		return getTutorialButton(MainContentEnum.JQUERY.toString());
	}
	//endregion
	
	//Java
	//region
	public WebElement getJavaHeader(){
		
		return getHeaderElement(MainContentEnum.JAVA.toString());
	}
	
	public String getJavaSubheader(){

		return getSubheaderValue(MainContentEnum.JAVA.toString());
	}
	
	public WebElement getLearnJavaButton(){
		
		return getTutorialButton(MainContentEnum.JAVA.toString());
	}
	//endregion

	//C++
	//region
	public WebElement getCplusplusHeader(){
		
		return getHeaderElement(MainContentEnum.CPLUSPLUS.toString());
	}
	
	public String getCplusplusSubheader(){
		
		return getSubheaderValue(MainContentEnum.CPLUSPLUS.toString());
	}
	
	public WebElement getLearnCplusplusButton(){
		
		return getTutorialButton(MainContentEnum.CPLUSPLUS.toString());
	}
	//endregion

	//W3.CSS
	//region
	public WebElement getW3CSSHeader(){
		
		return getHeaderElement(MainContentEnum.W3CSS.toString());
	}
	
	public String getW3CSSSubheader(){
		
		return getSubheaderValue(MainContentEnum.W3CSS.toString());
	}
	
	public WebElement getLearnW3CSSButton(){
		
		return getTutorialButton(MainContentEnum.W3CSS.toString());
	}
	//endregion
	
	//Bootstrap
	//region
	public WebElement getBootstrapHeader(){
		
		return getHeaderElement(MainContentEnum.BOOTSTRAP.toString());		
	}
	
	public String getBootstrapSubheader(){
		
		return getSubheaderValue(MainContentEnum.BOOTSTRAP.toString());
	}
	
	public WebElement getLearnBootstrapButton(){

		return getTutorialButton(MainContentEnum.BOOTSTRAP.toString());
	}
	//endregion
	
	//Other tutorials button list
	//region
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

	//Code editor section
	//region
	public void scrollToCodeEditorSection(){
		
		control.scrollToElement(getElementByXpath("//*[@class='codeeditorbr-container']", "Code Editor section"));
	}
	
	public String getCodeEditorHeader(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[3]");
	}
	
	public String getCodeEditorSubheader(){
		
		return getTextOfElementUsingXpathLocator("((//*[contains(@class, 'black')]/descendant::h1)[3]/following-sibling::*)[1]");
	}
	//endregion

	//Code editor window
	//region
	public WebElement getCodeEditorDotButton(int dotButtonNumber){

		return getElementByXpath(String.format("((//*[contains(@class, 'codeeditorbr-container')])[1]/descendant::*[contains(@class, 'dot')])[%s]", dotButtonNumber), String.format("Code editor dot button - %s", dotButtonNumber));
	}
	
	public String getCodeEditorUrlValue(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'codeeditorbr-container')])[1]/descendant::input");
	}
	
	public WebElement getCodeEditorFrontendActive(){
		
		return getElementByXpath("//*[contains(@class, 'ws-grey') and text()='Frontend']", "Frontend active button");
	}
	
	public int getCodeEditorFrontendActiveDisplayCount(){
		
		return getElementByXpathCount("//*[contains(@class, 'ws-grey') and text()='Frontend']", "Frontend active button");
	}
	
	private WebElement getCodeEditorFrontEndNotActive(){
		
		return getElementByXpath("//*[contains(@class, 'codeeditorbr-tablink') and text()='Frontend']", "Frontend inactive button");
	}
	
	public void clickFrontendButton(){
		
		control.clickButton(getCodeEditorFrontEndNotActive());
	}

	public WebElement getCodeEditorBackEndActive(){
		
		return getElementByXpath("//*[contains(@class, 'ws-grey') and text()='Backend']", "Backend active button");
	}
		
	private WebElement getCodeEditorBackendNotActive(){
		
		return getElementByXpath("//*[contains(@class, 'codeeditorbr-tablink') and text()='Backend']", "Backend inactive button");
	}
	
	public int getCodeEditorBackEndActiveDisplayCount(){
		
		return getElementByXpathCount("//*[contains(@class, 'ws-grey') and text()='Backend']", "Backend active button");
	}
	
	public void clickBackEndButton(){
		
		control.clickButton(getCodeEditorBackendNotActive());
		
		control.waitForElmentToBeDisplayedInPage(By.xpath("//*[@id='Backend']/descendant::*[@src='/tryit/best2.gif']"));
	}

	public WebElement getCodeEditorFrontendGIF(){
		
		return getElementByXpath("//*[@id='Frontend']/descendant::*[@src='codeeditor.gif']", "Frontend GIF");
	}

	public WebElement getCodeEditorBackendGIF(){
		
		return getElementByXpath("//*[@id='Backend']/descendant::*[@src='/tryit/best2.gif']", "Backend GIF");
	}
	
	public WebElement getCodeEditorTryFrontend(){
		
		return getElementByXpath("//*[text()='Try Frontend Editor (HTML/CSS/JS)']", "Frontend editor button");
	}
	
	public WebElement getCodeEditorTryBackend(){
		
		return getElementByXpath("//*[text()='Try Backend Editor (Python/PHP/Java/C..)']", "Backend editor button");
	}
	//endregion

	//W3Schools Spaces section
	//region
	public void scrollToW3SchoolsSpacesSection(){
		
		control.scrollToElement(getElementByXpath("//*[text()='W3Schools Spaces']/parent::*", "W3Schools Spaces"));
	}
	
	public WebElement getW3SchoolsSpacesHeader(){
		
		return getElementByXpath("//*[text()='W3Schools Spaces']", "W3Schools Spaces");
	}
	
	public String getW3SchoolsSpacesSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='W3Schools Spaces']/following-sibling::*[1]");
	}
	
	public WebElement getW3SchoolsSpacesSampleScreenshot(){
		
		String xpathExpression = "//*[text()='W3Schools Spaces']/following-sibling::*[@src='/pro/picture_spaces_ide.png']";
		
		control.waitForElmentToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, "W3Schools Spaces sample screenshot");
	}
	
	public void scrollToW3SchoolsSpacesScreenshotsSection(){
		
		control.scrollToElement(getW3SchoolsSpacesSampleScreenshot());
	}
	
	public WebElement getW3SchoolsSpacesHowItWorksImage(){
		
		String xpathExpression = "//*[text()='W3Schools Spaces']/following-sibling::*[@src='how-spaces-works3.png']";
		
		control.waitForElmentToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, "W3Schools Spaces how it works image");
	}
	
	public WebElement getW3schoolsSpacesGetStartedForFreeButton(){
		
		return getElementByXpath("//*[contains(@class, 'tut-button') and text()='Get Started for Free']", "W3Schools Spaces - Get Started for Free");
	}
	//endregion
	
	//My Learning section
	//region
	public void scrollToMyLearningSection(){

		control.scrollToElement(getElementByXpath("//*[text()='My Learning']/parent::*", "My Learning section"));
	}
	
	public WebElement getMyLearningHeader(){
		
		return getElementByXpath("//*[text()='My Learning']/parent::*", "My Learning header");
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
		
		control.scrollToElement(getElementById(myLearningSampleScreenshotId, "My Learning sample screenshot"));
	}
	
	public WebElement getMyLearningSampleScreenshot(){
		
		control.waitForElmentToBeDisplayedInPage(By.id(myLearningSampleScreenshotId));
		
		return getElementById(myLearningSampleScreenshotId, "My Learning sample screenshot");
	}
	
	public WebElement getMyLearningSignupButton(){
		
		return getButtonElementById("myLearningFromDefault", "Sign Up for Free");
	}
	//endregion
	
	//Become a Pro user section
	//region
	public void scrollToBecomeProUserSection(){
		
		control.scrollToElement(getElementByXpath("//*[text()='Become a PRO User']/parent::*", "Become a Pro User section"));
	}
	
	public WebElement getBecomeProUserHeader(){
		
		return getElementByXpath("//*[text()='Become a PRO User']/parent::*", "Become a Pro User header");
	}
	
	public String getBecomeProUserSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='Become a PRO User']/following-sibling::*[1]");		
	}
	
	//1st checkbox
	public WebElement getBecomeProUser1stCheckbox(){
		
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[1]", "Become Pro User - 1st checkbox");
	}
	
	public String getBecomeProUser1stCheckboxText(){
		
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[1]");
	}
	
	public WebElement getBecomeProUser1stCheckboxStrongText(){
		
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg']/following-sibling::*)[1]", "without ads");
	}
	
	//2nd checkbox
	public WebElement getBecomeProUser2ndCheckbox(){
		
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[2]", "Become Pro User - 2nd checkbox");
	}
	
	public String getBecomeProUser2ndCheckboxText(){
		
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[2]");
	}
	
	public WebElement getBecomeProUser2ndCheckboxLink(){
		
		return getElementByLinkText("Spaces", "Become Pro User - Spaces");
	}
	
	//3rd checkbox
	public WebElement getBecomeProUser3rdCheckbox(){
		
		return getElementByXpath("(//*[@src='/spaces/files/check3.db67d31e.svg'])[3]", "Become Pro User - 3rd checkbox");
	}
	
	public String getBecomeProUser3rdCheckboxText(){
		
		return getTextOfElementUsingXpathLocator("(//*[@src='/spaces/files/check3.db67d31e.svg']/parent::*)[3]");
	}
	
	public WebElement getBecomeProUser3rdCheckboxLink(){
		 
		return getElementByLinkText("HTML Video Tutorial", "Become Pro User - HTML Video Tutorial");
	}
	
	public WebElement getBecomeProUserLearnMoreButton(){
		
		return getButtonElementById("proFromDefault", "Learn More");
	}
	//endregion

	//Color Picker section
	//region
	public void scrollToColorPickerSection(){
		
		control.scrollToElement(getElementByXpath("//*[text()='Color Picker']/parent::*", "Color Picker section"));
	}
	
	public WebElement getColorPickerHeader(){
		
		return getElementByXpath("//*[text()='Color Picker']", "Color Picker header");
	}
	
	public String getColorPickerSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='Color Picker']/following-sibling::*[1]");
	}
	
	public WebElement getColorPickerImage(){
		
		return getElementByXpath("//*[text()='Color Picker']/following-sibling::*[2]/*[@src='/images/colorpicker.png']");
	}
	//endregion

	//Code Game section
	//region
	public void scrollToCodeGameSection(){
		
		control.scrollToElement(getElementByXpath("//*[text()='Code Game']/parent::*", "Code Game section"));
	}
	
	public WebElement getCodeGameHeader(){
		
		return getElementByXpath("//*[text()='Code Game']", "Code Game header");
	}
	
	public String getCodeGameSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='Code Game']/following-sibling::*[1]");
	}
	
	public WebElement getCodeGameImageOfLynx(){
		
		String xpathExpression = "//*[text()='Code Game']/following-sibling::*/descendant::*[@src='/images/w3lynx_200.png']";
		
		control.waitForElmentToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, "Image of Lynx");
	}
	
	public WebElement getCodeGamePlayGameButton(){
		
		return getElementByXpath("//*[text()='Play Game']", "Play Game");
	}
	//endregion
	
	//Exercises and Quizzes section
	//region
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
		
		return getElementByXpath("(//*[text()='Exercises'])[2]/parent::*", "Exercises");
	}
	
	public WebElement getExercisesAndQuizzesQuizzesButton(){
		
		return getElementByXpath("(//*[text()='Quizzes'])[2]/parent::*", "Quizzes");
	}
	//endregion
	
	//Web Templates section
	//region
	public void scrollToWebTemplatesSection(){
		
		control.scrollToElement(getElementByXpath("(//*[text()='Web Templates'])[2]/parent::*", "Web Templates section"));
		
	}
	
	public WebElement getWebTemplatesHeader(){
		
		return getElementByXpath("(//*[text()='Web Templates'])[2]");
	}
	
	public String getWebTemplatesSubheader(){
		
		return getTextOfElementUsingXpathLocator("(//*[text()='Web Templates'])[2]/following-sibling::*[2]");
	}
	
	public WebElement getWebTemplatesSubheaderFreeText(){

		return getElementByXpath("(//*[text()='Web Templates'])[2]/following-sibling::*[2]/descendant::strong[text()='free']", "free");
	}
	
	public WebElement getWebTemplatesSampleImage(){
		
		String xpathExpression = "(//*[text()='Web Templates'])[2]/following-sibling::*/descendant::*[@src='w3css_templates.jpg']";
		
		control.waitForElmentToBeDisplayedInPage(By.xpath(xpathExpression));
		
		return getElementByXpath(xpathExpression, "Web Templates sample images");
	}
	
	public WebElement getWebTemplatesBrowseTemplatesButton(){

		return getElementByXpath("(//*[text()='Web Templates'])[2]/following-sibling::*/descendant::*[text()='Browse Templates']", "Browse Templates");
	}
	//endregion

	//Certification section
	//region
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
		
		return getElementByXpath("//*[@id='getdiploma']/descendant::*[text()='Kickstart your career']/following-sibling::*[text()='Get started']", "Get started");
	}
	
	public WebElement getCertificationArrow(){

		return getElementById("w3_cert_arrow", "Arrow pointing to certification badge");
	}
	
	public WebElement getCertificationBadge(){
		
		return getElementById("w3_cert_badge", "Certification badge");
	}
	//endregion
	
	//How To Section
	//region
	public void scrollToHowToSection(){
		
		control.scrollToElement(getElementById("howto_padding", "How To Section"));
	}
	
	public WebElement getHowToSectionHeader(){
		
		return getElementByXpath("//*[@id='howto_padding']/descendant::*[text()='How To Section']");
	}
	
	public String getHowToSectionSubheader(){

		return getTextOfElementUsingXpathLocator("//*[@id='howto_padding']/descendant::*[2]");
	}
	
	public String getHowToSection2ndSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[@id='howto_padding']/descendant::*[3]");
	}
	
	public WebElement getHowToSectionSampleWindowDotButton(int dotButtonNumber){
		
		return getElementByXpath(String.format("((//*[contains(@class, 'codeeditorbr-container')])[2]/descendant::*[contains(@class, 'dot')])[%s]", dotButtonNumber), String.format("How To Section Window dot button - %s", dotButtonNumber));
	}
	
	public String getHowToSectionSampleWindowUrlValue(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'codeeditorbr-container')])[2]/descendant::input");
	}
	
	int slideNumber = 1;
	
	public void scrollToHowToSectionSliderContainer(){
		
		control.scrollToElement(getElementByXpath("(//*[@class='codeeditorbr-container'])[2]", "How To Section window"));
	}
	
	public WebElement getHowToSectionSampleWindowPreviousButton(){
		
		return getElementByXpath("//*[@class='prev']", "How To Section Sample Window - Previous");
	}
	
	public void switchToHowToSliderFrame(){
		
		switchToIframe(getElementById("howto_iframe", "How To Section - Slider"));
		
	}
	
	private void increaseSlideNumber(){
		
		slideNumber++;
		
		if(slideNumber == 4){
			slideNumber = 1;
		}
		
	}
	
	private void decreaseSlideNumber(){
		
		slideNumber--;
		
		if(slideNumber == 0){
			slideNumber = 3;
		}
		
	}
	
	public void clickPreviousButton(){
		
		control.clickButton(getHowToSectionSampleWindowPreviousButton());
		
		decreaseSlideNumber();
		
	}
	
	public void clickNextButton(){
		
		control.clickButton(getHowToSectionSampleWindowNextButton());
		
		increaseSlideNumber();
		
	}
	
	private int getArrayIndex(int slideNumber){
		
		return slideNumber - 1;
	}
	
	public WebElement getHowToSectionSampleWindowNextButton(){
		
		return getElementByClass("next", "How To Section Sample Window - Next");
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
	
		return getElementByXpath("//*[@id='howto_padding']/descendant::*[text()='Learn How To']", "Learn How To");
	}
	//endregion
}