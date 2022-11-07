package pages;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	WebDriver driver = null;
	WebElement element = null;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getElementById(String id){
		
		return getElement(By.id(id));
		
	}
	
	public WebElement getElementByClass(String className){
		
		return getElement(By.className(className));
		
	}
	
	public WebElement getElementByXpath(String xpath){
		
		return getElement(By.xpath(xpath));

	}
	
	public WebElement getElementByTagName(String tagName){
		return getElement(By.tagName(tagName));
	}
	
	private WebElement getElement(By byElement){
		
		element = null;
		
		try {
			
			element = driver.findElement(byElement);
			
		} catch (NoSuchElementException noSuchElementException){

			System.out.println(ExceptionUtils.getStackTrace(noSuchElementException));
			
		}
	
		return element;
		
	}
	
}
