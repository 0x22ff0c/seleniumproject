package pages.homepage.maincontent;

import org.checkerframework.checker.units.qual.m;
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
	public WebElement getMainContent(){
		
		return getElementById("main", MainContentEnum.MAIN_CONTENT_SECTION.toString());
	}
	
	public WebElement getHeaderTextInMainContent(){
		
		String learnToCodeHeaderXpathExpression = "//*[text()='%s']";
		
		return getElementByXpath(String.format(learnToCodeHeaderXpathExpression, MainContentEnum.LEARN_TO_CODE_HEADER.toString()), 
				MainContentEnum.LEARN_TO_CODE_HEADER.toString() + " header");
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
	
	//HTML section
	public void scrollToHtmlSection(){
		
		String htmlSectionXpathExpression = "//h1[text()='%s']/parent::*/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(htmlSectionXpathExpression, MainContentEnum.HTML.name()), MainContentEnum.HTML.name() + " section"));
	}
	
	public String getHtmlHeaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-green')]/descendant::h1)[1]");
	}
	
	public String getHtmlSubheaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-green')]/descendant::h1/following-sibling::*)[1]");
	}
	
	public WebElement getHtmlLearnHtmlButton(){
		
		String learnHTMLButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(learnHTMLButtonXpathExpression, MainContentEnum.LEARN_HTML.toString()), MainContentEnum.LEARN_HTML.toString() + " button");
	}
	
	public WebElement getHtmlVideoTutorialButton(){
		
		return getButtonElement("HTML video tutorial", MainContentEnum.VIDEO_TUTORIAL.toString());
	}
	
	public WebElement getHtmlReferenceButton(){
		
		String htmlReferenceXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(htmlReferenceXpathExpression, MainContentEnum.HTML_REFERENCE.toString()),  MainContentEnum.HTML_REFERENCE.toString() + " button");
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
	
	//CSS Section
	public void scrollToCSSSection(){
		
		String cssSectionXpathExpression = "//h1[text()='%s']/parent::*/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(cssSectionXpathExpression, MainContentEnum.CSS.name()), 
				MainContentEnum.CSS.name() + " section"));
	}
	
	public String getCssHeaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'yellow')]/descendant::h1)[1]");
	}
	
	public String getCssSubheaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'yellow')]/descendant::h1/following-sibling::*)[1]");
	}
	
	public WebElement getCSSLearnCSSButton(){
		
		String learnCSSButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(learnCSSButtonXpathExpression, MainContentEnum.LEARN_CSS.toString()), 
				MainContentEnum.LEARN_CSS.toString() + " button");
	} 
	
	public WebElement getCSSReferenceButton(){
		
		String cssReferenceButtonXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(cssReferenceButtonXpathExpression, MainContentEnum.CSS_REFERENCE.toString()), 
				MainContentEnum.CSS_REFERENCE.toString() + " button");
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
	
	//JavaScript section
	public void scrollToJavaScriptSection(){
		
		String javaScriptSectionXpathExpression = "//h1[text()='%s']/parent::*/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(javaScriptSectionXpathExpression, MainContentEnum.JAVASCRIPT.toString()), MainContentEnum.JAVASCRIPT.toString() + " section"));
	}
	
	public String getJavaScriptHeaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[2]");
	}
	
	public String getJavaScriptSubheaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[2]/following-sibling::*[1]");
	}
	
	public WebElement getJavaScriptLearnJavaScriptButton(){
		
		String learnJavaScriptButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(learnJavaScriptButtonXpathExpression, MainContentEnum.LEARN_JAVASCRIPT.toString()), MainContentEnum.LEARN_JAVASCRIPT.toString() + " button");
	} 
	
	public WebElement getJavaScriptReferenceButton(){
		
		String javaScriptReferenceButtonXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(javaScriptReferenceButtonXpathExpression, MainContentEnum.JAVASCRIPT_REFERENCE.toString()), 
				MainContentEnum.JAVASCRIPT_REFERENCE.toString() + " button");
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
	
	//Python section
	public void scrollToPythonSection(){
		
		String pythonSectionXpathExpression = "//h1[text()='%s']/parent::*/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(pythonSectionXpathExpression, MainContentEnum.PYTHON.toString()), MainContentEnum.PYTHON.toString() + " section"));
	}
	
	public String getPythonHeaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-pink')]/descendant::h1)[1]");
	}
	
	public String getPythonSubheaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-pink')]/descendant::h1)[1]/following-sibling::*[1]");
	}
	
	public WebElement getPythonLearnPythonButton(){
		
		String learnPythonButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(learnPythonButtonXpathExpression, MainContentEnum.LEARN_PYTHON.toString()), MainContentEnum.LEARN_PYTHON.toString() + " button");
	} 
	
	public WebElement getPythonReferenceButton(){
		
		String pythonReferenceButtonXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(pythonReferenceButtonXpathExpression, MainContentEnum.PYTHON_REFERENCE.toString()), MainContentEnum.PYTHON_REFERENCE.toString() + " button");
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
	
	//SQL section
	public void scrollToSQLSection(){
		
		String sqlSectionXpathExpression = "//h1[text()='%s']/parent::*/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(sqlSectionXpathExpression, MainContentEnum.SQL.name()), MainContentEnum.SQL.name() + " section"));
	}
	
	public String getSQLHeaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'turquoise')]/descendant::h1)[1]");
	}
	
	public String getSQLSubheaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'turquoise')]/descendant::h1)[1]/following-sibling::*[1]");
	}
	
	public WebElement getSQLLearnSQLButton(){
		
		String learnSQLButtonXpathExpression = "//*[contains(@class, 'tut-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(learnSQLButtonXpathExpression, MainContentEnum.LEARN_SQL.toString()), MainContentEnum.LEARN_SQL.toString() + " button");
	} 
	
	public WebElement getSQLReferenceButton(){
		
		String sqlReferenceButtonXpathExpression = "//*[contains(@class, 'ref-button') and contains(text(), '%s')]";
		
		return getElementByXpath(String.format(sqlReferenceButtonXpathExpression, MainContentEnum.SQL_REFERENCE.toString()), MainContentEnum.SQL_REFERENCE.toString() + " button");
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
	
	//Other tutorials
	public void scrollToOtherTutorialsSection(){
		
		control.scrollToElement(getElementByXpath("(//*[contains(@class, 'ws-black')])[3]", "Other tutorials section"));
	}
	
	//PHP
	public WebElement getPHPHeader(){
		
		String phpHeaderXpathExpression = "//*[text()='%s']";
		
		return getElementByXpath(String.format(phpHeaderXpathExpression, MainContentEnum.PHP.name()), MainContentEnum.PHP.name() + " header");
	}
	
	public String getPHPSubheader(){
		
		return getTextOfElementUsingXpathLocator(String.format("//*[text()='%s']/following-sibling::*/descendant::*", MainContentEnum.PHP.name()));
	}

	public WebElement getLearnPHPButton(){
		
		String learnPhpButtonXpathExpression = "//*[text()='{0}']/following-sibling::*[contains(@class, 'tut-button') and text()='Learn {0}']";
		
		return getElementByXpath(String.format(learnPhpButtonXpathExpression, MainContentEnum.PHP.name()), MainContentEnum.PHP.name() + " button");
		
	}

	//jQuery
	public WebElement getjQueryHeader(){
		
		return getElementByXpath("//*[text()='jQuery']", "jQuery Header");
	}
	
	public String getjQuerySubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='jQuery']/following-sibling::*/descendant::*");
	}
	
	public WebElement getLearnjQueryButton(){
		
		return getElementByXpath("//*[text()='jQuery']/following-sibling::*[contains(@class, 'tut-button') and text()='Learn jQuery']");
	}
	
	//Java
	public WebElement getJavaHeader(){
		
		return getElementByXpath("//*[text()='Java']", "Java Header");
	}
	
	public String getJavaSubheader(){

		return getTextOfElementUsingXpathLocator("//*[text()='Java']/following-sibling::*/descendant::*");
	}
	
	public WebElement getLearnJavaButton(){
		
		return getElementByXpath("//*[text()='Java']/following-sibling::*[contains(@class, 'tut-button') and text()='Learn Java']");
	}
	
	//C++
	public WebElement getCplusplusHeader(){
		
		return getElementByXpath("//*[text()='C++']", "C++ Header");
	}
	
	public String getCplusplusSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='C++']/following-sibling::*/descendant::*");
	}
	
	public WebElement getLearnCplusplusButton(){
		
		return getElementByXpath("//*[text()='C++']/following-sibling::*[contains(@class, 'tut-button') and text()='Learn C++']");
	}
	
	//W3.CSS
	public WebElement getW3CSSHeader(){
		
		return getElementByXpath("//*[text()='W3.CSS']", "W3.CSS Header");
	}
	
	public String getW3CSSSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='W3.CSS']/following-sibling::*/descendant::*");
	}
	
	public WebElement getLearnW3CSSButton(){
		
		return getElementByXpath("//*[text()='W3.CSS']/following-sibling::*[contains(@class, 'tut-button') and text()='Learn W3.CSS']", "Learn W3.CSS button");
	}
	
	//Bootstrap
	public WebElement getBootstrapHeader(){
		
		return getElementByXpath("//*[text()='Bootstrap']", "Bootstrap Header");
	}
	
	public String getBootstrapSubheader(){
		
		return getTextOfElementUsingXpathLocator("//*[text()='Bootstrap']/following-sibling::*/descendant::*");
	}
	
	public WebElement getLearnBootstrapButton(){
		
		return getElementByXpath("//*[text()='Bootstrap']/following-sibling::*[contains(@class, 'tut-button') and text()='Learn Bootstrap']", "Learn Bootstrap button");
	}
	
	//Other tutorials button list
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

	//Code editor section
	public void scrollToCodeEditorSection(){
		
		control.scrollToElement(getElementByXpath("//*[@class='codeeditorbr-container']", "Code Editor section"));
	}
	
	public String getCodeEditorHeader(){
		
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[3]");
	}
	
	public String getCodeEditorSubheader(){
		
		return getTextOfElementUsingXpathLocator("((//*[contains(@class, 'black')]/descendant::h1)[3]/following-sibling::*)[1]");
	}
	
	//Code editor window

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
	
	//W3Schools Spaces section
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
	
	
	//My Learning section
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
	
	
	//Become a Pro user section
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
	
	//Color Picker section
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
	
	//Code Game section
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
	
	//Exercises and Quizzes section
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
	
	//Web Templates section
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
	
	//Certification section
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
	
	//How To Section
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
	
}