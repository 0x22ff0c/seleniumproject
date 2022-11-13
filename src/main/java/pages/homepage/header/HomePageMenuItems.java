package pages.homepage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class HomePageMenuItems extends HomePageHeader{

	public HomePageMenuItems(WebDriver driver, BaseTest baseTest) {
		super(driver, baseTest);
	}
	
	@Override
	protected WebElement getHeaderCaretButton(String title){
		return getElementByXpath(String.format("//*[@title='%s']/descendant::*[contains(@class, 'caret-up') and contains(@style, 'inline')]", title), String.format("%s caret up button", title));
	}
	
	private WebElement getHeaderMenuCloseButton(String idValue, String elementName){
		return getElementByXpath(String.format("//*[@id='%s']/descendant::*[text()='×']", idValue), String.format("%s close button", elementName));
	}

	@Override
	public WebElement getTutorialsCaretButton(){
		return getHeaderCaretButton(TUTORIALS_LABEL);
	}
	
	@Override
	public WebElement getReferencesCaretButton(){
		return getHeaderCaretButton(REFERENCES_LABEL);
	}
	
	@Override
	public WebElement getExercisesCaretButton(){
		return getHeaderCaretButton(EXCERCISES_LABEL);
	}
	
	public WebElement getTutorialsCloseButton(){
		return getHeaderMenuCloseButton("nav_tutorials", TUTORIALS_LABEL);
	}
	
	public void clickTutorialsCloseButton(){
		control.clickButton(getTutorialsCloseButton());
	}
	
	public WebElement getReferencesCloseButton(){
		return getHeaderMenuCloseButton("nav_references", REFERENCES_LABEL);
	}
	
	public void clickReferencesCloseButton(){
		control.clickButton(getReferencesCloseButton());
	}
	
	public WebElement getExercisesCloseButton(){
		return getHeaderMenuCloseButton("nav_exercises", EXCERCISES_LABEL);
	}
	
	public void clickExercisesCloseButton(){
		control.clickButton(getExercisesCloseButton());
	} 

	
	
}
