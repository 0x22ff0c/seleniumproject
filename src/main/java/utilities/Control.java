package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class Control{
	
	WebDriver driver;
	BaseTest baseTest;
	
	public Control(WebDriver driver, BaseTest baseTest){
		this.driver = driver;
		this.baseTest = baseTest;
	}
	
	public void clickButton(WebElement element){
	
		String nameOfElement = baseTest.getNameOfElement();
		
		
		System.out.println(String.format("Clicking element: %s...", nameOfElement));
		
		element.click();
		
		System.out.println(String.format("Clicked element: %s", nameOfElement));
		
	}
	
	public void typeToField(WebElement fieldElement, String valueToFillInTheField){
		
		System.out.println(String.format("Filling-in field with value: %s...", valueToFillInTheField));
		
		fieldElement.sendKeys(valueToFillInTheField);
		
		System.out.println(String.format("Filled-in field with value: %s", valueToFillInTheField));
		
	}
	
	public void scrollToElement(WebElement element){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
}