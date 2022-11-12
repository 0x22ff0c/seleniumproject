package pages;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class BasePage {

	WebDriver driver = null;
	WebElement element = null;
	String nameOfElement;

	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	protected WebElement getElementById(String id, String nameOfElement){
		
		return getElement(By.id(id), nameOfElement);
		
	}
	
	protected WebElement getElementByClass(String className, String nameOfElement){
		
		return getElement(By.className(className), nameOfElement);
		
	}
	
	protected WebElement getElementByXpath(String xpath, String nameOfElement){
		
		return getElement(By.xpath(xpath), nameOfElement);

	}
	
	protected WebElement getElementByTagName(String tagName, String nameOfElement){
		return getElement(By.tagName(tagName), nameOfElement);
	}
	
	protected WebElement getElementByLinkText(String linkText, String nameOfElement){
		return getElement(By.linkText(linkText), nameOfElement);
	}
	
	private WebElement getElement(By byElement, String nameOfElement){
		
		BaseTest.setElementName(nameOfElement);
		
		element = null;
		
		try {
			
			element = driver.findElement(byElement);
			
		} catch (NoSuchElementException noSuchElementException){

			System.out.println(ExceptionUtils.getStackTrace(noSuchElementException));
			
		}
	
		return element;
		
	}
	
	protected String getTextOfElement(WebElement element){
		
		String textOfElement = "";
		
		if(element != null){
			textOfElement = element.getText();
		}else {
			System.out.println("WARNING, unable to locate the element. Text is empty.");
		}
		
		return textOfElement;
	}
	
	protected String getPlaceholderTextOfField(WebElement element){
		
		String placeholderText = "";
		
		if(element != null){
			placeholderText = element.getAttribute("placeholder");
		}else {
			System.out.println("WARNING, unable to locate the element. Inner text is empty.");
		}
		
		return placeholderText;
		
	}
	
}
