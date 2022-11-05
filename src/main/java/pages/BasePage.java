package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	WebDriver driver = null;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getElementById(String id){
		return driver.findElement(By.id(id));
	}
	
	public WebElement getElementByClass(String className){
		return driver.findElement(By.className(className));
		
	}
	
	public WebElement getElementByXpath(String xpath){
		return driver.findElement(By.xpath(xpath));
	}
	
}
