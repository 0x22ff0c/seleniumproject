package tests;

import org.openqa.selenium.WebElement;

import utilities.SoftAssertion;

public class BaseTest {

	SoftAssertion softAssertion;
	
	public void setSoftAssertion(SoftAssertion softAssertion){
		this.softAssertion = softAssertion;
	}
	
	public void assertAll(){
		softAssertion.assertAll();
	}
	
	public void verifyElementIsDisplayed(WebElement element, String nameOfElement){

		softAssertion.assertTrue(exceptionHandler(element), String.format("%s is displayed", nameOfElement));
		
	}
	
	public void verifyButtonIsDisplayed(WebElement element, String nameOfThebutton){
		verifyElementIsDisplayed(element, String.format("%s button is displayed", nameOfThebutton));
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
