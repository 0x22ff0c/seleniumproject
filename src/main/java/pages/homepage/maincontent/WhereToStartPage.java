package pages.homepage.maincontent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class WhereToStartPage extends BasePage{

	public WhereToStartPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getWhereToStartHeader(){
		return getElementByXpath("//*[@class='textsmallerscreens' and text()='Where To Start']", "\"Where To Start\" header");
	}
	
	public String getSubheaderContent(){
		
		String actualString = getTextOfElement(By.xpath("(//*[@class='textsmallerscreens' and text()='Where To Start']/following-sibling::*)[1]"));
		
		return actualString.replace("\n", " ");
	}
	
	//Learn HTML section
	public WebElement getHtmlLeftButton(){
		return getElementByXpath("//*[contains(@class, 'yellow')]/descendant::*[text()='HTML']", "HTML button");
	}
	
	public String getHtml1stStep(){
		return getTextOfElement(By.xpath("(//*[@title='Go To Our HTML Tutorial']/following-sibling::*)[1]"));
	}
	
	public String getHtml1stStepAdditionalInfo(){
		return getTextOfElement(By.xpath("(//*[@title='Go To Our HTML Tutorial']/following-sibling::*)[2]"));
	}
	
	public WebElement getLearnHtmlButton(){
		return getElementByXpath("//*[@title='Go To Our HTML Tutorial' and contains(@class, 'button')]", "Learn HTML button");
	}
	
	//CSS section
	public void scrollToCSSsection(){
		
		control.scrollToElement(getElementByXpath("(//*[@title='Go To Our CSS Tutorial']/parent::*)[2]", "Learn CSS section"));
		
	}
	
	public WebElement getCSSLeftButton(){
		return getElementByXpath("//*[contains(@class, 'pink')]/descendant::*[text()='CSS']", "CSS button");
	}
	
	public String getCSS2ndStep(){
		return getTextOfElement(By.xpath("(//*[@title='Go To Our CSS Tutorial']/following-sibling::*)[1]"));
	}
	
	public String getCSS2ndStepAdditionalInfo(){
		return getTextOfElement(By.xpath("(//*[@title='Go To Our CSS Tutorial']/following-sibling::*)[2]"));
	}
	
	public WebElement getLearnCSSButton(){
		return getElementByXpath("//*[@title='Go To Our CSS Tutorial' and contains(@class, 'button')]", "Learn CSS button");
	}
	
	//JavaScript section
	public void scrollToJavaScriptSection(){
		control.scrollToElement(getElementByXpath("(//*[@title='Go To Our JavaScript Tutorial']/parent::*/parent::*)[1]", "Learn JavaScript section"));
	}
	
	public WebElement getJSLeftButton(){
		return getElementByXpath("//*[contains(@class, 'turquoise')]/descendant::*[text()='JavaScript']", "JavaScript button");
	}
	
	public String getJS3rdStep(){
		return getTextOfElement(By.xpath("(//*[@title='Go To Our JavaScript Tutorial']/following-sibling::*)[1]"));
	}
	
	public String getJS3rdStepAdditionalInfo(){
		return getTextOfElement(By.xpath("(//*[@title='Go To Our JavaScript Tutorial']/following-sibling::*)[2]"));
	}
	
	public WebElement getLearnJSButton(){
		return getElementByXpath("//*[@title='Go To Our JavaScript Tutorial' and text()='Learn JavaScript']", "Learn JavaScript button");
	}
	
}
