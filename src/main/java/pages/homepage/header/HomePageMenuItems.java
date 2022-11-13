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
	
	private WebElement getMenuContainer(String idValue, String elementName){
		return getElementByXpath(String.format("//*[@id='%s' and contains(@style, 'display: block')]", idValue), String.format("%s menu container", elementName));
	}

	private static final String TUTORIAL_NAV_ID = "nav_tutorials";
	private static final String REFERENCES_NAV_ID = "nav_references";
	private static final String EXERCISES_NAV_ID = "nav_exercises";
	
	
	//Tutorials menu
	
	@Override
	public WebElement getTutorialsCaretButton(){
		return getHeaderCaretButton(TUTORIALS_LABEL);
	}
	
	public WebElement getTutorialsMenuContainer(){
		return getMenuContainer(TUTORIAL_NAV_ID, TUTORIALS_LABEL);
	}
	
	public WebElement getTutorialsCloseButton(){
		return getHeaderMenuCloseButton(TUTORIAL_NAV_ID, TUTORIALS_LABEL);
	}
	
	public void clickTutorialsCloseButton(){
		control.clickButton(getTutorialsCloseButton());
	}
	
	//References menu
	
	@Override
	public WebElement getReferencesCaretButton(){
		return getHeaderCaretButton(REFERENCES_LABEL);
	}
	
	public WebElement getReferencesMenuContainer(){
		return getMenuContainer(REFERENCES_NAV_ID, REFERENCES_LABEL);
	}
	
	public WebElement getReferencesCloseButton(){
		return getHeaderMenuCloseButton(REFERENCES_NAV_ID, REFERENCES_LABEL);
	}
	
	public void clickReferencesCloseButton(){
		control.clickButton(getReferencesCloseButton());
	}
	
	//Exercises menu
	
	@Override
	public WebElement getExercisesCaretButton(){
		return getHeaderCaretButton(EXCERCISES_LABEL);
	}
	
	public WebElement getExercisesMenuButton(){
		return getMenuContainer(EXERCISES_NAV_ID, EXCERCISES_LABEL);
	}
	
	public WebElement getExercisesCloseButton(){
		return getHeaderMenuCloseButton(EXERCISES_NAV_ID, EXCERCISES_LABEL);
	}
	
	public void clickExercisesCloseButton(){
		control.clickButton(getExercisesCloseButton());
	}
	
}
