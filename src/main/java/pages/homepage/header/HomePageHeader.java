package pages.homepage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.homepage.ExerciseHeaderEnum;
import enums.homepage.ReferenceHeaderEnum;
import enums.homepage.TutorialsHeaderEnum;
import pages.BasePage;

public class HomePageHeader extends BasePage{

	//Header
	public HomePageHeader(WebDriver driver){
		super(driver);
	}

	public WebElement getHeader(){
		return getElementByXpath("//*[@title='Home']/parent::*", "Header");		
	}

	//Header - menu items

	protected WebElement getHeaderCaretButton(String title){
		return getElementByXpath(String.format("//*[contains(@class, 'caret-down')]/parent::*[@title='%s']", title), String.format("%s caret down button", title));
	}

	public WebElement getTutorialsButton(){
		
		return getButtonElement(TutorialsHeaderEnum.TUTORIALS_LABEL.toString());		
	}
	
	public void clickTutorialsButton(){
		control.clickButton(getTutorialsButton());
	}
	
	public WebElement getTutorialsCaretButton(){
		return getHeaderCaretButton(TutorialsHeaderEnum.TUTORIALS_LABEL.toString());
	}
	
	public WebElement getReferencesButton(){
		
		return getButtonElement(ReferenceHeaderEnum.REFERENCES_LABEL.toString());
	}
	
	public void clickReferencesButton(){
		control.clickButton(getReferencesButton());
	}
	
	public WebElement getReferencesCaretButton(){
		return getHeaderCaretButton(ReferenceHeaderEnum.REFERENCES_LABEL.toString());
	}

	public WebElement getExercisesButton(){
		
		return getButtonElement(ExerciseHeaderEnum.EXERCISES_LABEL.toString());
		
	}
	
	public void clickExercisesButton(){
		control.clickButton(getExercisesButton());
	}
	
	public WebElement getExercisesCaretButton(){
		return getHeaderCaretButton(ExerciseHeaderEnum.EXERCISES_LABEL.toString());
	}
	
	public WebElement getVideosButton(){
		
		return getButtonElement("Video Tutorials");
		
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
