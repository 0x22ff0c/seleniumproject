package pages.homepage.maincontent.wheretostartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.wheretostartpage.WhereToStartMainEnum;
import pages.BasePage;

public class WhereToStartPage extends BasePage{

	public WhereToStartPage(WebDriver driver) {
		super(driver);
	}
	
	//"Where To Start" section
	public String getWhereToStartHeaderContent(){
		
		return getTextOfElementUsingXpathLocator("//*[@class='textsmallerscreens' and text()='Where To Start']");
	}

	public String getSubheaderContent(){
		
		return getTextOfElementUsingXpathLocator("(//*[@class='textsmallerscreens' and text()='Where To Start']/following-sibling::*)[1]");
	}
	
	//Learn HTML section
	public WebElement getHtmlLeftButton(){
		
		return getElementByXpath("//*[contains(@class, 'yellow')]/descendant::*[text()='HTML']", WhereToStartMainEnum.HTML.name());
	}
	
	public String getHtml1stStep(){
		
		return getTextOfElementUsingXpathLocator("(//*[@title='Go To Our HTML Tutorial']/following-sibling::*)[1]");
	}
	
	public String getHtml1stStepAdditionalInfo(){
		
		return getTextOfElementUsingXpathLocator("(//*[@title='Go To Our HTML Tutorial']/following-sibling::*)[2]");
	}
	
	public WebElement getLearnHtmlButton(){
		
		return getElementByXpath("//*[@title='Go To Our HTML Tutorial' and contains(@class, 'button')]", WhereToStartMainEnum.LEARN_HTML_BUTTON.toString());
	}
	
	//CSS section
	public void scrollToCSSsection(){
		
		control.scrollToElement(getElementByXpath("(//*[@title='Go To Our CSS Tutorial']/parent::*)[2]", WhereToStartMainEnum.LEARN_CSS_SECTION.toString()));
		
	}
	
	public WebElement getCSSLeftButton(){
		
		return getElementByXpath("//*[contains(@class, 'pink')]/descendant::*[text()='CSS']", WhereToStartMainEnum.CSS.name());
	}
	
	public String getCSS2ndStep(){
		
		return getTextOfElementUsingXpathLocator("(//*[@title='Go To Our CSS Tutorial']/following-sibling::*)[1]");
	}
	
	public String getCSS2ndStepAdditionalInfo(){
		
		return getTextOfElementUsingXpathLocator("(//*[@title='Go To Our CSS Tutorial']/following-sibling::*)[2]");
	}
	
	public WebElement getLearnCSSButton(){
		
		return getElementByXpath("//*[@title='Go To Our CSS Tutorial' and contains(@class, 'button')]", WhereToStartMainEnum.LEARN_CSS_BUTTON.toString());
	}
	
	//JavaScript section
	public void scrollToJavaScriptSection(){
		
		control.scrollToElement(getElementByXpath("(//*[@title='Go To Our JavaScript Tutorial']/parent::*/parent::*)[1]", WhereToStartMainEnum.LEARN_JAVASCRIPT_SECTION.toString()));
	}
	
	public WebElement getJSLeftButton(){
		
		return getElementByXpath("//*[contains(@class, 'turquoise')]/descendant::*[text()='JavaScript']", WhereToStartMainEnum.JAVASCRIPT.toString());
	}
	
	public String getJS3rdStep(){
		
		return getTextOfElementUsingXpathLocator("(//*[@title='Go To Our JavaScript Tutorial']/following-sibling::*)[1]");
	}
	
	public String getJS3rdStepAdditionalInfo(){
		
		return getTextOfElementUsingXpathLocator("(//*[@title='Go To Our JavaScript Tutorial']/following-sibling::*)[2]");
	}
	
	public WebElement getLearnJSButton(){
		
		return getElementByXpath("//*[@title='Go To Our JavaScript Tutorial' and text()='Learn JavaScript']", WhereToStartMainEnum.LEARN_JAVASCRIPT_BUTTON.toString());
	}
	
	//What's next? section
	public void scrollToWhatsNextSection(){
		
		String whatsNextSectionXpathExpression = "//*[text()=\"%s\"]/parent::*/parent::*";
		
		control.scrollToElement(getElementByXpath(String.format(whatsNextSectionXpathExpression, WhereToStartMainEnum.WHATS_NEXT_SECTION.toString()),
				String.format("\"%s\" section", WhereToStartMainEnum.WHATS_NEXT_SECTION.toString())));
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
				String.format("\"%s\" section", WhereToStartMainEnum.HELLO_DEVELOPER.toString())));
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
		
		control.scrollToElement(getElementByXpath("(//*[@class='textsmallerscreens'])[5]/parent::*/parent::*", "\"What About Back-End?\" section"));
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
		
		return getElementByLinkText("PHP");
	}
	
	public WebElement getBackEndPythonLink(){
		
		return getElementByLinkText("Python");
	}
	
	public WebElement getBackEndSqlLink(){
		
		return getElementByLinkText("SQL");
	}
	
	public String getBackEnd3rdSubheader(){
		
		return getTextOfElementUsingXpathLocator("((//*[@class='textsmallerscreens'])[5]/following-sibling::*)[3]");
	}
	
	public WebElement getBackEndHomePageLink(){
		
		return getElementByLinkText("Homepage");
	}
	
}