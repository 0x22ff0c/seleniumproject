package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getHomeLogo(){
		return getElementByXpath("//*[@title='Home']");
	}
	
	public WebElement getHomeLogo2(){
		return getElementByXpath("//*[@title='Home1']");
	}
	
}
