package pages.homepage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;
import tests.BaseTest;
import utilities.Control;

public class HomePageHeader extends BasePage{

	//Header
	public HomePageHeader(WebDriver driver, BaseTest baseTest){
		super(driver, baseTest);
		this.driver = driver;
		this.baseTest = baseTest;
		 
	}

	protected Control control = new Control(driver, baseTest);
	
	public WebElement getHeader(){
		return getElementByXpath("//*[@title='Home']/parent::*", "Header");		
	}

	//Header - menu items
	
	private WebElement getHeaderButton(String title){
		return getElementByXpath(String.format("//*[@title='%s']", title), String.format("%s button", title));
	}
	
	protected WebElement getHeaderCaretButton(String title){
		return getElementByXpath(String.format("//*[contains(@class, 'caret-down')]/parent::*[@title='%s']", title), String.format("%s caret down button", title));
	}
	
	protected static final String TUTORIALS_LABEL = "Tutorials";
	protected static final String REFERENCES_LABEL = "References";
	protected static final String EXCERCISES_LABEL = "Exercises";
	
	public WebElement getTutorialsButton(){
		return getHeaderButton(TUTORIALS_LABEL);
	}
	
	public void clickTutorialsButton(){
		control.clickButton(getTutorialsButton());
	}
	
	public WebElement getTutorialsCaretButton(){
		return getHeaderCaretButton(TUTORIALS_LABEL);
	}
	
	public WebElement getReferencesButton(){
		return getHeaderButton(REFERENCES_LABEL);
	}
	
	public void clickReferencesButton(){
		control.clickButton(getReferencesButton());
	}
	
	public WebElement getReferencesCaretButton(){
		return getHeaderCaretButton(REFERENCES_LABEL);
	}

	public WebElement getExercisesButton(){
		return getHeaderButton(EXCERCISES_LABEL);
	}
	
	public void clickExercisesButton(){
		control.clickButton(getExercisesButton());
	}
	
	public WebElement getExercisesCaretButton(){
		return getHeaderCaretButton(EXCERCISES_LABEL);
	}
	
	public WebElement getVideosButton(){
		return getHeaderButton("Video Tutorials");
	}
	
	public WebElement getThemeToggle(){
		return getElementByXpath("//*[@xxtitle='Toggle Dark Code']", "Toggle Dark Code");
	}
	
	public WebElement getTranslateButton(){
		return getElementById("nav_translate_btn", "Translate button");
	}
	
	public WebElement getSearchButton(){
		return getElementById("nav_search_btn", "Search button");
	}
	
	public WebElement getUpgradeButton(){
		return getElementByXpath("//*[@title='Courses']/following-sibling::*[contains(@title,'Upgrade')]", "Upgrade button");
	}
	
	public WebElement getCertifiedButton(){
		return getElementById("cert_navbtn", "Cerified button");
	}
	
	public WebElement getFreeWebsiteButton(){
		return getElementByXpath("//*[@title='Courses']/preceding-sibling::*[contains(@title, 'Get Your Own Website')]", "Free website button");
	}
	
	public WebElement getLoginButton(){
		return getElementById("w3loginbtn", "Login button");
	}
	
	public WebElement getHomeLogo(){
		return getElementByXpath("//*[@title='Home']", "Home logo");
	}
	
}
