package pages;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Control;

public class BasePage {

	protected WebDriver driver = null;
	WebElement element = null;
	private String nameOfElement = "";
	protected Control control;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		control = new Control(driver, this);
	}

	public String getElementName(){
		return nameOfElement;
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
	
	protected WebElement getElementByXpath(String xpath){
		
		return getElement(By.xpath(xpath));
		
	}
	
	protected WebElement getElementByTagName(String tagName, String nameOfElement){
		
		return getElement(By.tagName(tagName), nameOfElement);
	
	}
	
	protected WebElement getElementByLinkText(String linkText){
		
		return getElement(By.linkText(linkText), linkText + " link");
	
	}
	
	protected WebElement getElementByLinkText(String linkText, String nameOfElement){
	
		return getElement(By.linkText(linkText), nameOfElement + " link");
	
	}
	
	private WebElement getElement(By byElement){
		
		element = null; 
		
		try {
			element = driver.findElement(byElement);
		} catch (NoSuchElementException noSuchElementException) {
			
			System.out.println(ExceptionUtils.getStackTrace(noSuchElementException));
			
		}
		
		return element;
	}
	
	private WebElement getElement(By byElement, String nameOfElement){

		this.nameOfElement = nameOfElement;

		element = null;
		
		try {
			
			element = driver.findElement(byElement);
			
		} catch (NoSuchElementException noSuchElementException){

			System.out.println(ExceptionUtils.getStackTrace(noSuchElementException));
			
		}
	
		return element;
		
	}

	private String setNameOfTheButton(String nameOfTheButtonElement){
		return nameOfTheButtonElement + " button";
	} 

	public WebElement getButtonElement(String nameOfTheButton){

		return getElementByXpath(String.format("//*[@title='%s']", nameOfTheButton), setNameOfTheButton(nameOfTheButton));
		
	}
	
	public WebElement getButtonElementById(String idOfElement, String nameOfTheButton){
		
		return getElementById(idOfElement, setNameOfTheButton(nameOfTheButton));
		
	}
	
	public WebElement getButtonElement(String titleOfTheButton, String actualNameOfTheButton){
		
		element = getButtonElement(titleOfTheButton);
		
		this.nameOfElement = setNameOfTheButton(actualNameOfTheButton);
		
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
	
	protected String getTextOfElementUsingXpathLocator(String xpathExpression){
		
		return getElementByXpath(xpathExpression).getText().replace("\n", " ");
		
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
