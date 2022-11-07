package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Control{
	
	WebDriver driver = null;
	
	public Control(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickButton(WebElement element){
	
		System.out.println("Clicking element...");
		
		element.click();
		
		System.out.println("Clicked element.");
		
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