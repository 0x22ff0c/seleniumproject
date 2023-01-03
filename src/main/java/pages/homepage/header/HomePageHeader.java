package pages.homepage.header;

import enums.homepage.header.HeaderEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomePageHeader extends BasePage{

	public HomePageHeader(WebDriver driver){
		super(driver);
	}

	public WebElement getHeader(){
		return getElementByXpath("//*[@title='Home']/parent::*", HeaderEnum.HOME_PAGE_HEADER);
	}

	//region Menu Items section
	protected WebElement getHeaderCaretButton(String title){
		return getElementByXpath(String.format("//*[contains(@class, 'caret-down')]/parent::*[@title='%s']", title), String.format("%s caret down", title));
	}

	protected  WebElement getHeaderCaretButton(Object nameOfTheCaretButton){
		return getElementByXpath(String.format("//*[contains(@class, 'caret-down')]/parent::*[@title='%s']", nameOfTheCaretButton), String.format("%s caret down", nameOfTheCaretButton));
	}

	public WebElement getTutorialsButton(){
		return getButtonElement(HeaderEnum.TUTORIALS_MENU_BUTTON);
	}
	
	public void clickTutorialsButton(){
		control.clickButton(getTutorialsButton());
	}
	
	public WebElement getTutorialsCaretButton(){
		return getHeaderCaretButton(HeaderEnum.TUTORIALS_MENU_BUTTON);
	}
	
	public WebElement getReferencesButton(){
		return getButtonElement(HeaderEnum.REFERENCE_MENU_BUTTON);
	}
	
	public void clickReferencesButton(){
		control.clickButton(getReferencesButton());
	}
	
	public WebElement getReferencesCaretButton(){
		return getHeaderCaretButton(HeaderEnum.REFERENCE_MENU_BUTTON);
	}

	public WebElement getExercisesButton(){
		return getButtonElement(HeaderEnum.EXERCISES_MENU_BUTTON);
	}
	
	public void clickExercisesButton(){
		control.clickButton(getExercisesButton());
	}
	
	public WebElement getExercisesCaretButton(){
		return getHeaderCaretButton(HeaderEnum.EXERCISES_MENU_BUTTON);
	}
	
	public WebElement getVideosButton(){
		return getButtonElement(HeaderEnum.VIDEO_TUTORIALS_BUTTON);
	}
	
	public WebElement getThemeToggle(){
		return getElementByXpath(String.format("//*[@xxtitle='%s']", HeaderEnum.TOGGLE_DARK_CODE), HeaderEnum.TOGGLE_DARK_CODE);
	}
	
	public WebElement getTranslateButton(){
		return getButtonElementById("nav_translate_btn", HeaderEnum.TUTORIALS_MENU_BUTTON);
	}
	
	public WebElement getSearchButton(){
		return getButtonElementById("nav_search_btn", HeaderEnum.SEARCH_BUTTON);
	}
	
	public WebElement getUpgradeButton(){
		return getButtonElementByXpath(String.format("//*[@title='Courses']/following-sibling::*[contains(@title,'%s')]", HeaderEnum.UPGRADE_BUTTON), HeaderEnum.UPGRADE_BUTTON);
	}
	
	public WebElement getCertifiedButton(){
		return getButtonElementById("cert_navbtn", HeaderEnum.CERTIFIED_BUTTON);
	}
	
	public WebElement getFreeWebsiteButton(){
		return getButtonElementByXpath("//*[@title='Courses']/preceding-sibling::*[contains(@title, 'Get Your Own Website')]", HeaderEnum.FREE_WEBSITE_BUTTON);
	}
	
	public WebElement getLoginButton(){
		return getButtonElementById("w3loginbtn", HeaderEnum.LOGIN_BUTTON);
	}
	
	public WebElement getHomeLogo(){
		return getButtonElement("Home", HeaderEnum.HOME_LOGO);
	}
	//endregion
}