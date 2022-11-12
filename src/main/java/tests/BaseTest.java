package tests;

import org.openqa.selenium.WebElement;

import utilities.SoftAssertion;

public class BaseTest {

	SoftAssertion softAssertion;
	static String nameOfElement;
	
	public static void setElementName(String nameOfElement1){
		nameOfElement = nameOfElement1;
	}
	
	public void setSoftAssertion(SoftAssertion softAssertion){
		this.softAssertion = softAssertion;
	}
	
	public void assertAll(){
		softAssertion.assertAll();
	}
	
	public void verifyElementIsDisplayed(WebElement element){
		softAssertion.assertTrue(exceptionHandler(element), String.format("%s is displayed", nameOfElement));
		
	}
	
	public void verifyTextIsTheSame(String actualTextInElement, String expectedTextInElement, String expectedResult){
		softAssertion.assertEquals(actualTextInElement, expectedTextInElement, expectedResult);
	}

	private boolean exceptionHandler(WebElement element){
		
		boolean defaultValue = false;
		
		if(element == null){
			
			System.out.println("Unable to locate element therefore element is not displayed.");
			
		}else {
			
			defaultValue = element.isDisplayed();
		}
		
		return defaultValue;
		
	}
	
}
