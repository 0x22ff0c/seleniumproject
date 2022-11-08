package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getHeader(){
		return getElementByXpath("//*[@title='Home']/parent::*");
	}

	public WebElement getHomeLogo(){
		return getElementByXpath("//*[@title='Home']");
	}

	//Main Content
	
	public WebElement getMainContent(){
		return getElementById("main");
	}
	
	public String getHeaderTextInMainContent(){
		return getTextOfElement(getElementByXpath("//*[text()='Learn to Code']"));
	}
	
	public String getSubheaderTextInMainContent(){
		return getTextOfElement(getElementByXpath("//*[text()=\"With the world's largest web developer site.\"]"));
	}
	
	public WebElement getSearchbarField(){
		return getElementById("search2");
	}
	
	public String getSearchbarfieldPlaceholder(){
		return getPlaceholderTextOfField(getSearchbarField());
	}
	
	public WebElement getSearchbarButton(){
		return getElementById("learntocode_searchbtn");
	}
	
	public WebElement getWhereToBeginLink(){
		return getElementByLinkText("Not Sure Where To Begin?");
	}
	
	public WebElement getFooter(){
		return getElementByTagName("footer");
	}
	
}
