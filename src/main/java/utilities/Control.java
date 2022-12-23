package utilities;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;
import tests.BaseTest;

public class Control{
	
	WebDriver driver;
	BaseTest baseTest;
	BasePage basePage;
	String nameOfElement;
	WebDriverWait wait;
	
	public Control(WebDriver driver, BasePage basePage){
		this.driver = driver;
		this.basePage = basePage;
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public Control(WebDriver driver){
		this.driver = driver;
	}

	public void waitForElmentToBeDisplayedInPage(By locator){
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	private void logBeforeAction(String message){
		LogUtility.logInfo(message + "...");
	}
	
	private void logAfterAction(String message){
		LogUtility.logInfo(message + ".");
	}
	
	public void clickButton(WebElement element){
		nameOfElement = basePage.getElementName();
		
		logBeforeAction(String.format("Clicking element: %s", nameOfElement));

		element.click();

		logAfterAction( String.format("Clicked element: %s", nameOfElement));
	}
	
	public void navigateBackToPreviousPage(){
		logBeforeAction("Navigating back");
		
		driver.navigate().back();
		
		logAfterAction("Navigated back to previous page");
	}
	
	public void typeToField(WebElement fieldElement, String valueToFillInTheField){
		logBeforeAction(String.format("Filling-in field with value: %s", valueToFillInTheField));
		
		fieldElement.sendKeys(valueToFillInTheField);
		
		logAfterAction(String.format("Filled-in field with value: %s", valueToFillInTheField));
	}
		
	public void scrollToElement(WebElement element){
		nameOfElement = basePage.getElementName();
		
		logBeforeAction(String.format("Scrolling to element: %s", nameOfElement));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
		
		logBeforeAction(String.format("Scrolled to element: %s.", nameOfElement));
	}
}