package pages.homepage.maincontent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class HomePageMainContent extends BasePage{
	
	public HomePageMainContent(WebDriver driver) {
		super(driver);
	}

	//Main Content
	
	public WebElement getMainContent(){
		return getElementById("main", "Main homepage content");
	}
	
	public String getHeaderTextInMainContent(){
		return getTextOfElement(getElementByXpath("//*[text()='Learn to Code']",  "\"Learn to Code\" header"));
	}
	
	public String getSubheaderTextInMainContent(){
		return getTextOfElement(getElementByXpath("//*[text()=\"With the world's largest web developer site.\"]", "\"With the world's largest web developer site.\" subheader"));
	}
	
	public WebElement getSearchbarField(){
		return getElementById("search2", "Search field");
	}
	
	public String getSearchbarfieldPlaceholder(){
		return getPlaceholderTextOfField(getSearchbarField());
	}
	
	public WebElement getSearchbarButton(){
		return getElementById("learntocode_searchbtn", "Search field button");	
	}
	
	public WebElement getWhereToBeginLink(){
		return getElementByLinkText("Not Sure Where To Begin?");
	}
	
	public void scrollToWhereToBeginLink(){
		control.scrollToElement(getWhereToBeginLink());
	}
	
	public void clickWhereToBeginLink(){
		control.clickButton(getWhereToBeginLink());
	}
	
	//HTML section
	public void scrollToHtmlSection(){
		control.scrollToElement(getElementByXpath("//h1[text()='HTML']/parent::*/parent::*/parent::*", "HTML section"));
	}
	
	public String getHtmlHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-green')]/descendant::h1)[1]");
	}
	
	public String getHtmlSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-green')]/descendant::h1/following-sibling::*)[1]");
	}
	
	public WebElement getHtmlLearnHtmlButton(){
		return getElementByXpath("//*[contains(@class, 'tut-button') and contains(text(), 'Learn HTML')]", "Learn HTML button");
	}
	
	public WebElement getHtmlVideoTutorialButton(){
		return getButtonElement("HTML video tutorial", "Video Tutorial");
	}
	
	public WebElement getHtmlReferenceButton(){
		return getElementByXpath("//*[contains(@class, 'ref-button') and contains(text(), 'HTML Reference')]", "HTML Reference button");
	}
	
	public WebElement getHtmlGetCertifiedButton(){
		return getButtonElement("Add HTML Certification", "Get Certified");
	}
	
	public String getHtmlCodeExampleHeader(){
		return getTextOfElementUsingXpathLocator("(//*[text()='HTML'])[2]/parent::*/following-sibling::*/descendant::*[2]");
	}
	
	public WebElement getHtmlSampleCodeSection(){
		return getElementByXpath("(//*[text()='HTML'])[2]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]", "HTML Sample code");
	}
	
	public WebElement getHtmlTryItYourselfButton(){
		return getElementByXpath("(//*[text()='HTML Example:']/following-sibling::*[text()='Try it Yourself'])[1]", "HTML Try It Yourself button");
	}
	
	//CSS Section
	public void scrollToCSSSection(){
		control.scrollToElement(getElementByXpath("//h1[text()='CSS']/parent::*/parent::*/parent::*", "CSS section"));
	}
	
	public String getCssHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'yellow')]/descendant::h1)[1]");
	}
	
	public String getCssSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'yellow')]/descendant::h1/following-sibling::*)[1]");
	}
	
	public WebElement getCSSLearnCSSButton(){
		return getElementByXpath("//*[contains(@class, 'tut-button') and contains(text(), 'Learn CSS')]", "Learn CSS button");
	} 
	
	public WebElement getCSSReferenceButton(){
		return getElementByXpath("//*[contains(@class, 'ref-button') and contains(text(), 'CSS Reference')]", "CSS Reference button");
	}
	
	public WebElement getCSSGetCertifiedButton(){
		return getButtonElement("Add CSS Certification", "Get Certfieid");
	}
	
	public String getCSSCodeExampleHeader(){
		return getTextOfElementUsingXpathLocator("(//*[text()='CSS'])[2]/parent::*/following-sibling::*/descendant::*[2]");
	}
	
	public WebElement getCSSSampleCodeSection(){
		return getElementByXpath("(//*[text()='CSS'])[2]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]", "CSS Sample code");
	}
	
	public WebElement getCSSTryItYourselfButton(){
		return getElementByXpath("//*[text()='CSS Example:']/following-sibling::*[text()='Try it Yourself']", "CSS Try It Yourself button");
	}
	
	//JavaScript section
	public void scrollToJavaScriptSection(){
		control.scrollToElement(getElementByXpath("//h1[text()='JavaScript']/parent::*/parent::*/parent::*", "JavaScript section"));
	}
	
	public String getJavaScriptHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[2]");
	}
	
	public String getJavaScriptSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'black')]/descendant::h1)[2]/following-sibling::*[1]");
	}
	
	public WebElement getJavaScriptLearnJavaScriptButton(){
		return getElementByXpath("//*[contains(@class, 'tut-button') and contains(text(), 'Learn JavaScript')]", "Learn JavaScript button");
	} 
	
	public WebElement getJavaScriptReferenceButton(){
		return getElementByXpath("//*[contains(@class, 'ref-button') and contains(text(), 'JavaScript Reference')]", "JavaScript Reference button");
	}
	
	public WebElement getJavaScriptGetCertifiedButton(){
		return getButtonElement("Add JavaScript Certification", "JavaScript - Get Certfieid");
	}
	
	public String getJavaScriptCodeExampleHeader(){
		return getTextOfElementUsingXpathLocator("(//*[text()='JavaScript'])[3]/parent::*/following-sibling::*/descendant::*[2]");
	}
	
	public WebElement getJavaScriptSampleCodeSection(){
		return getElementByXpath("(//*[text()='JavaScript'])[3]/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]", "JavaScript Sample code");
	}
	
	public WebElement getJavaScriptTryItYourselfButton(){
		return getElementByXpath("//*[text()='JavaScript Example:']/following-sibling::*[text()='Try it Yourself']", "JavaScript Try It Yourself button");
	}
	
	//Python section
	public void scrollToPythonSection(){
		control.scrollToElement(getElementByXpath("//h1[text()='Python']/parent::*/parent::*/parent::*", "Python section"));
	}
	
	public String getPythonHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-pink')]/descendant::h1)[1]");
	}
	
	public String getPythonSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'light-pink')]/descendant::h1)[1]/following-sibling::*[1]");
	}
	
	public WebElement getPythonLearnPythonButton(){
		return getElementByXpath("//*[contains(@class, 'tut-button') and contains(text(), 'Learn Python')]", "Learn Python button");
	} 
	
	public WebElement getPythonReferenceButton(){
		return getElementByXpath("//*[contains(@class, 'ref-button') and contains(text(), 'Python Reference')]", "Python Reference button");
	}
	
	public WebElement getPythonGetCertifiedButton(){
		return getButtonElement("Add Python Certification", "Python - Get Certfieid");
	}	
	
	public String getPythonCodeExampleHeader(){
		return getTextOfElementUsingXpathLocator("(//*[text()='Python'])/parent::*/following-sibling::*/descendant::*[2]");
	}
	
	public WebElement getPythonSampleCodeSection(){
		return getElementByXpath("//*[text()='Python']/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]", "Python Sample code");
	}
	
	public WebElement getPythonTryItYourselfButton(){
		return getElementByXpath("//*[text()='Python Example:']/following-sibling::*[text()='Try it Yourself']", "Python Try It Yourself button");
	}
	
	//SQL section
	public void scrollToSQLSection(){
		control.scrollToElement(getElementByXpath("//h1[text()='SQL']/parent::*/parent::*/parent::*", "SQL section"));
	}
	
	public String getSQLHeaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'turquoise')]/descendant::h1)[1]");
	}
	
	public String getSQLSubheaderContent(){
		return getTextOfElementUsingXpathLocator("(//*[contains(@class, 'turquoise')]/descendant::h1)[1]/following-sibling::*[1]");
	}
	
	public WebElement getSQLLearnSQLButton(){
		return getElementByXpath("//*[contains(@class, 'tut-button') and contains(text(), 'Learn SQL')]", "Learn SQL button");
	} 
	
	public WebElement getSQLReferenceButton(){
		return getElementByXpath("//*[contains(@class, 'ref-button') and contains(text(), 'SQL Reference')]", "SQL Reference button");
	}
	
	public WebElement getSQLGetCertifiedButton(){
		return getButtonElement("Add SQL Certification", "SQL - Get Certfieid");
	}
	
	public String getSQLCodeExampleHeader(){
		return getTextOfElementUsingXpathLocator("(//*[text()='SQL'])/parent::*/following-sibling::*/descendant::*[2]");
	}
	
	public WebElement getSQLSampleCodeSection(){
		return getElementByXpath("//*[text()='SQL']/parent::*/following-sibling::*/descendant::*[contains(@class, 'code')]", "SQL Sample code");
	}
	
	public WebElement getSQLTryItYourselfButton(){
		return getElementByXpath("//*[text()='SQL Example:']/following-sibling::*[text()='Try it Yourself']", "SQL Try It Yourself button");
	}
	
	//Other tutorials
	public void scrollToOtherTutorialsSection(){
		control.scrollToElement(getElementByXpath("(//*[contains(@class, 'ws-black')])[3]", "Other tutorials section"));
	}
	
	//PHP
	public WebElement getPHPHeader(){
		return getElementByXpath("//*[text()='PHP']", "PHP Header");
	}
	
	public String getPHPSubheader(){
		return getTextOfElementUsingXpathLocator("//*[text()='PHP']/following-sibling::*/descendant::*");
	}

	public WebElement getLearnPHPButton(){
		return getElementByXpath("//*[text()='PHP']/following-sibling::*[contains(@class, 'tut-button') and text()='Learn PHP']");
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

}