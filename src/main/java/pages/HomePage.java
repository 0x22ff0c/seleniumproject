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
	
	public WebElement getMainContent(){
		return getElementById("main");
	}
	
	public WebElement getFooter(){
		return getElementByTagName("footer");
	}
	
}
