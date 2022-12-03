package pages.homepage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.homepage.HeaderEnum;
import pages.BasePage;

public class HomePageHeader extends BasePage{

	//Header
	public HomePageHeader(WebDriver driver){
		super(driver);
	}

	public WebElement getHeader(){
		
		return getElementByXpath("//*[@title='Home']/parent::*", HeaderEnum.HOME_PAGE_HEADER.toString());		
	}

	//Header - menu items

	protected WebElement getHeaderCaretButton(String title){
		
		return getElementByXpath(String.format("//*[contains(@class, 'caret-down')]/parent::*[@title='%s']", title), String.format("%s caret down button", title));
	}

	public WebElement getTutorialsButton(){
		
		return getButtonElement(HeaderEnum.TUTORIALS_MENU_BUTTON.toString());		
	}
	
	public void clickTutorialsButton(){
		control.clickButton(getTutorialsButton());
	}
	
	public WebElement getTutorialsCaretButton(){
		return getHeaderCaretButton(HeaderEnum.TUTORIALS_MENU_BUTTON.toString());
	}
	
	public WebElement getReferencesButton(){
		
		return getButtonElement(HeaderEnum.REFERENCE_MENU_BUTTON.toString());
	}
	
	public void clickReferencesButton(){
		
		control.clickButton(getReferencesButton());
	}
	
	public WebElement getReferencesCaretButton(){
		
		return getHeaderCaretButton(HeaderEnum.REFERENCE_MENU_BUTTON.toString());
	}

	public WebElement getExercisesButton(){
		
		return getButtonElement(HeaderEnum.EXERCISES_MENU_BUTTON.toString());
	}
	
	public void clickExercisesButton(){
		
		control.clickButton(getExercisesButton());
	}
	
	public WebElement getExercisesCaretButton(){
		
		return getHeaderCaretButton(HeaderEnum.EXERCISES_MENU_BUTTON.toString());
	}
	
	public WebElement getVideosButton(){
		
		return getButtonElement(HeaderEnum.VIDEO_TUTORIALS_BUTTON.toString());
	}
	
	public WebElement getThemeToggle(){
		return getElementByXpath("//*[@xxtitle='Toggle Dark Code']", "Toggle Dark Code");
	}
	
	public WebElement getTranslateButton(){
		
		return getButtonElementById("nav_translate_btn", "Translate");
		
	}
	
	public WebElement getSearchButton(){
		
		return getButtonElementById("nav_search_btn", "Search");
		
	}
	
	public WebElement getUpgradeButton(){
		return getElementByXpath("//*[@title='Courses']/following-sibling::*[contains(@title,'Upgrade')]", "Upgrade button");
	}
	
	public WebElement getCertifiedButton(){
		
		return getButtonElementById("cert_navbtn", "Certified");
		
	}
	
	public WebElement getFreeWebsiteButton(){
		return getElementByXpath("//*[@title='Courses']/preceding-sibling::*[contains(@title, 'Get Your Own Website')]", "Free website button");
	}
	
	public WebElement getLoginButton(){
		
		return getButtonElementById("w3loginbtn", "Login");
		
	}
	
	public WebElement getHomeLogo(){
		
		return getButtonElement("Home", "Home logo");
		
	}
	
}
