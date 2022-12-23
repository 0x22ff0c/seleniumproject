package pages.homepage.maincontent.wheretostartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.wheretostartpage.WhereToStartMainEnum;
import pages.BasePage;

public class WhereToStartPage extends BasePage{

	public WhereToStartPage(WebDriver driver) {
		super(driver);
	}

	//region Where To Start section
	public String getWhereToStartHeaderContent(){
		String whereToStartHeaderXpathExpression = "//*[@class='textsmallerscreens' and text()='%s']";
		
		return getTextOfElementUsingXpathLocator(String.format(whereToStartHeaderXpathExpression, WhereToStartMainEnum.WHERE_TO_START.toString()));
	}

	public String getSubheaderContent(){
		String whereToStartSubheaderXpathExpression = "(//*[@class='textsmallerscreens' and text()='%s']/following-sibling::*)[1]";
		
		return getTextOfElementUsingXpathLocator(String.format(whereToStartSubheaderXpathExpression, WhereToStartMainEnum.WHERE_TO_START.toString()));
	}
	//endregion

	//region Learn HTML section
	public WebElement getHtmlLeftButton(){
		String htmlLinkXpathExpression = "//*[contains(@class, 'yellow')]/descendant::*[text()='%s']";
		
		return getElementByXpath(String.format(htmlLinkXpathExpression, WhereToStartMainEnum.HTML.name()), WhereToStartMainEnum.HTML.name());
	}
	
	public String getHtml1stStep(){
		String html1stStepXpathExpression = "(//*[@title='%s']/following-sibling::*)[1]";
		
		return getTextOfElementUsingXpathLocator(String.format(html1stStepXpathExpression, WhereToStartMainEnum.GO_TO_HTML_TUTORIAL.toString()));
	}
	
	private String setAdditionalInfoXpathExpression(String titleOfTheSection){
		return String.format("(//*[@title='%s']/following-sibling::*)[2]", titleOfTheSection);
	}
	
	public String getHtml1stStepAdditionalInfo(){
		return getTextOfElementUsingXpathLocator(setAdditionalInfoXpathExpression( WhereToStartMainEnum.GO_TO_HTML_TUTORIAL.toString()));
	}
	
	public WebElement getLearnHtmlButton(){
		String learnHtmlButtonXpathExpression = "//*[@title='%s' and contains(@class, 'button')]";
		
		return getElementByXpath(String.format(learnHtmlButtonXpathExpression, WhereToStartMainEnum.GO_TO_HTML_TUTORIAL.toString()), 
				WhereToStartMainEnum.LEARN_HTML_BUTTON.toString());
	}
	//endregion
	
	//CSS section
	public void scrollToCSSsection(){
		String cssSectionXpathExpression = "(//*[@title='%s']/parent::*)[2]";
		
		control.scrollToElement(getElementByXpath(String.format(cssSectionXpathExpression, WhereToStartMainEnum.GO_TO_CSS_TUTORIAL.toString()), 
				WhereToStartMainEnum.LEARN_CSS_SECTION.toString()));
	}
	
	public WebElement getCSSLeftButton(){
		String cssLeftButtonXpathExpression = "//*[contains(@class, 'pink')]/descendant::*[text()='%s']";
		
		return getElementByXpath(String.format(cssLeftButtonXpathExpression, WhereToStartMainEnum.CSS.name()), WhereToStartMainEnum.CSS.name());
	}
	
	public String getCSS2ndStep(){
		String css2ndStepXpathExpression = "(//*[@title='Go To Our CSS Tutorial']/following-sibling::*)[1]";
		
		return getTextOfElementUsingXpathLocator(String.format(css2ndStepXpathExpression, WhereToStartMainEnum.GO_TO_CSS_TUTORIAL.toString()));
	}
	
	public String getCSS2ndStepAdditionalInfo(){
		return getTextOfElementUsingXpathLocator(setAdditionalInfoXpathExpression(WhereToStartMainEnum.GO_TO_CSS_TUTORIAL.toString()));
	}
	
	public WebElement getLearnCSSButton(){
		String cssLearnCSSButtonXpathExpression = "//*[@title='%s' and contains(@class, 'button')]";
		
		return getElementByXpath(String.format(cssLearnCSSButtonXpathExpression, WhereToStartMainEnum.GO_TO_CSS_TUTORIAL.toString()), WhereToStartMainEnum.LEARN_CSS_BUTTON.toString());
	}
	
	//JavaScript section
	public void scrollToJavaScriptSection(){
		String javaScriptSectionXpathExpression = "(//*[@title='%s']/parent::*/parent::*)[1]";
		
		control.scrollToElement(getElementByXpath(String.format(javaScriptSectionXpathExpression, WhereToStartMainEnum.GO_TO_JAVASCRIPT_TUTORIAL.toString()), 
				WhereToStartMainEnum.LEARN_JAVASCRIPT_SECTION.toString()));
	}
	
	public WebElement getJSLeftButton(){
		String jsLeftButtonXpathExpression = "//*[contains(@class, 'turquoise')]/descendant::*[text()='%s']";
		
		return getElementByXpath(String.format(jsLeftButtonXpathExpression, WhereToStartMainEnum.JAVASCRIPT.toString()), 
				WhereToStartMainEnum.JAVASCRIPT.toString());
	}
	
	public String getJS3rdStep(){
		String js3rdStepXpathExpression = "(//*[@title='%s']/following-sibling::*)[1]";
		
		return getTextOfElementUsingXpathLocator(String.format(js3rdStepXpathExpression, WhereToStartMainEnum.GO_TO_JAVASCRIPT_TUTORIAL.toString()));
	}
	
	public String getJS3rdStepAdditionalInfo(){
		return getTextOfElementUsingXpathLocator(setAdditionalInfoXpathExpression(WhereToStartMainEnum.GO_TO_JAVASCRIPT_TUTORIAL.toString()));
	}
	
	public WebElement getLearnJSButton(){
		String learnJSButtonXpathExpression = "//*[@title='%s' and text()='Learn JavaScript']";
		
		return getElementByXpath(String.format(learnJSButtonXpathExpression, WhereToStartMainEnum.GO_TO_JAVASCRIPT_TUTORIAL.toString()), WhereToStartMainEnum.LEARN_JAVASCRIPT_BUTTON.toString());
	}
	
	private String setNameSection(String sectioName){
		return String.format("\"%s\" section", sectioName);
	}
	
	//What's next? section
	public void scrollToWhatsNextSection(){
		String whatsNextSectionXpathExpression = "//*[text()=\"%s\"]/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(whatsNextSectionXpathExpression, WhereToStartMainEnum.WHATS_NEXT_SECTION.toString()), 
				setNameSection(WhereToStartMainEnum.WHATS_NEXT_SECTION.toString())));
	}
	
	public String getWhatsNextHeader(){
		return getTextOfElementUsingXpathLocator("(//*[@class='textsmallerscreens'])[2]");
	}
	
	public String getWhatsNextSubHeader(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[2]/following-sibling::*)[1]");	
	}
	
	public String getWhatsNext2ndSubHeader(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[2]/following-sibling::*)[2]");
	}
	
	public WebElement getWhatsNext2ndSubheaderNextStep(){
		String whatsNext2ndSubheaderNextStepXpathExpression = "(//*[@class='textsmallerscreens'])[2]/following-sibling::*[2]/descendant::b[text()='%s']";
		
		return getElementByXpath(String.format(whatsNext2ndSubheaderNextStepXpathExpression, WhereToStartMainEnum.NEXT_STEP.toString()), WhereToStartMainEnum.NEXT_STEP.toString());
	}
	
	public String getWhatsNext3rdSubHeader(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[2]/following-sibling::*)[3]");
	}
	
	//W3Schools Spaces
	public void scrollToW3SchoolsSpacesSection(){
		control.scrollToElement(getElementByXpath("(//*[@class='textsmallerscreens'])[3]/parent::*/parent::*", WhereToStartMainEnum.W3SCHOOLS_SPACES_SECTION.toString()));
	}
	
	public String getW3SchoolsSpacesHeader(){
		return getTextOfElementUsingXpathLocator("(//*[@class='textsmallerscreens'])[3]");
	}
	
	public String getW3SchoolSpacesSubheader(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[3]/following-sibling::*)[1]");
	}
	
	public WebElement getGetStartedForFreeButton(){
		String getStartedButtonXpathExpression = "//*[contains(@class, 'button') and text()='%s']";
		
		return getElementByXpath(String.format(getStartedButtonXpathExpression, WhereToStartMainEnum.GET_STARTED_BUTTON.toString()),
				String.format("\"%s\" button", WhereToStartMainEnum.GET_STARTED_BUTTON.toString()));
	}
	
	public WebElement getHowItWorksImage(){
		return getElementByXpath("//*[@src='how-spaces-works3.png']", String.format("\"%s\" image", WhereToStartMainEnum.HOW_IT_WORKS.toString()));
	}
	
	//Hello Developer
	public void scrollToHelloDeveloperSection(){
		control.scrollToElement(getElementByXpath("(//*[@class='textsmallerscreens'])[4]/parent::*/parent::*",
				setNameSection(WhereToStartMainEnum.HELLO_DEVELOPER.toString())));
	}
	
	public String getHelloDeveloperHeaderValue(){
		return getTextOfElementUsingXpathLocator("(//*[@class='textsmallerscreens'])[4]");
	}
	
	public String getHelloDeveloperSubheaderContent(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[4]/following-sibling::*)[1]");
	}
	
	public WebElement getHelloDeveloperSubheaderFrontEndDevelopers(){
		String frontEndDevelopersSubheaderXpathExpresssion = "((//*[@class='textsmallerscreens'])[4]/following-sibling::*)[1]/descendant::strong[text()='%s']";
		
		return getElementByXpath(String.format(frontEndDevelopersSubheaderXpathExpresssion, WhereToStartMainEnum.FRONT_END_DEVELOPERS.toString()), WhereToStartMainEnum.FRONT_END_DEVELOPERS.toString());
	}
	
	public String getHelloDeveloper2ndSubheaderContent(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[4]/following-sibling::*)[2]");
	}
	
	public WebElement getHelloDeveloper2ndSubheaderTip(){
		String tipXpathExpression = "((//*[@class='textsmallerscreens'])[4]/following-sibling::*)[2]/descendant::strong[text()='%s']";
		
		return getElementByXpath(String.format(tipXpathExpression, WhereToStartMainEnum.TIP.toString()), WhereToStartMainEnum.TIP.toString());
	}
	
	public WebElement getBootstrapLink(){
		return getElementByLinkText(WhereToStartMainEnum.BOOTSTRAP.toString());
	}
	
	public WebElement getSASSLink(){
		return getElementByLinkText(WhereToStartMainEnum.SASS.toString());
	}
	
	public WebElement getJqueryLink(){
		return getElementByLinkText(WhereToStartMainEnum.JQUERY.toString());
	}
	
	public WebElement getReactLink(){
		return getElementByLinkText(WhereToStartMainEnum.REACT.toString());
	}
	
	public WebElement getGitLink(){
		return getElementByLinkText(WhereToStartMainEnum.GIT.toString());
	}
	
	//What about back-end section
	public void scrollToBackEndSection(){
		control.scrollToElement(getElementByXpath("(//*[@class='textsmallerscreens'])[5]/parent::*/parent::*",
				setNameSection(WhereToStartMainEnum.WHAT_ABOUT_BACK_END_SECTION.toString())));
	}
	
	public String getBackEndHeader(){
		return getTextOfElementUsingXpathLocator("(//*[@class='textsmallerscreens'])[5]");
	}
	
	public String getBackEndSubheader(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[5]/following-sibling::*)[1]");	
	}
	
	public WebElement getBackEndSubheaderTextEnclosedInStrongTag(String textEnclosedInStrongTag){
		String xpathExpression = "((//*[@class='textsmallerscreens'])[5]/following-sibling::*)[1]/descendant::strong[text()='%s']";
		
		return getElementByXpath(String.format(xpathExpression, textEnclosedInStrongTag), textEnclosedInStrongTag);
	}

	public String getBackEnd2ndSubheader(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[5]/following-sibling::*)[2]");
	}
	
	public WebElement getBackEndPhpLink(){
		return getElementByLinkText(WhereToStartMainEnum.PHP.name());
	}
	
	public WebElement getBackEndPythonLink(){
		return getElementByLinkText(WhereToStartMainEnum.PYTHON.toString());
	}
	
	public WebElement getBackEndSqlLink(){
		return getElementByLinkText(WhereToStartMainEnum.SQL.name());
	}
	
	public String getBackEnd3rdSubheader(){
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[5]/following-sibling::*)[3]");
	}
	
	public WebElement getBackEndHomePageLink(){
		return getElementByLinkText(WhereToStartMainEnum.HOME_PAGE_LINK.toString());
	}
}