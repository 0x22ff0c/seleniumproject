package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;
import tests.BaseTest;

public class Control{
	
	WebDriver driver;
	BaseTest baseTest;
	BasePage basePage;
	String nameOfElement;
	Logger logger = LogManager.getLogger();
	
	public Control(WebDriver driver, BasePage basePage){
		this.driver = driver;
		this.basePage = basePage;
	}
	
	public Control(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickButton(WebElement element){
	
		nameOfElement = basePage.getElementName();
		
		String beforeAction = String.format("Clicking element: %s...", nameOfElement);
		String afterAction = String.format("Clicked element: %s", nameOfElement);
		
		LogUtility.logInfo(beforeAction);

		element.click();
		
		LogUtility.logInfo(afterAction);
		
	}
	
	public void navigateBackToPreviousPage(){
		
		System.out.println("Navigating back...");
		
		driver.navigate().back();
		
		System.out.println("Navigated back to previous page.");
		
	}
	
	public void typeToField(WebElement fieldElement, String valueToFillInTheField){
		
		System.out.println(String.format("Filling-in field with value: %s...", valueToFillInTheField));
		
		fieldElement.sendKeys(valueToFillInTheField);
		
		System.out.println(String.format("Filled-in field with value: %s", valueToFillInTheField));
		
	}
	
	public void scrollToElement(WebElement element){
		
		nameOfElement = basePage.getElementName();
		
		System.out.println(String.format("Scrolling to element: %s...", nameOfElement));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)", element);
		
		System.out.println(String.format("Scrolled to element: %s.", nameOfElement));
		
	}
	
}