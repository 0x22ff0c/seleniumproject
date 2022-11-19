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
	
	public String getHtmlFirstStep(){
		return getTextOfElement(By.xpath("(//*[@title='Go To Our HTML Tutorial']/following-sibling::*)[1]"));
	}
	
	public String getHtmlFirstStepAdditionalInfo(){
		return getTextOfElement(By.xpath("(//*[@title='Go To Our HTML Tutorial']/following-sibling::*)[2]"));
	}
	
	public WebElement getLearnHtmlButton(){
		return getElementByXpath("//*[@title='Go To Our HTML Tutorial' and contains(@class, 'button')]", "Learn HTML button");
	}
	
	
	
}
