package pages.homepage.maincontent;

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
	
	public String getHtmlCssSubheaderContent(){
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
	
}