package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver, BaseTest baseTest) {
		super(driver, baseTest);
	}

	//Header
	
	public WebElement getHeader(){
		return getElementByXpath("//*[@title='Home']/parent::*", "Header");		
	}

	//Header - menu items
	
	private WebElement getHeaderButton(String title){
		return getElementByXpath(String.format("//*[@title='%s']", title), String.format("%s button", title));
	}
	
	private WebElement getHeaderCaretDownButton(String title){
		return getElementByXpath(String.format("//*[contains(@class, 'caret-down')]/parent::*[@title='%s']", title), String.format("%s caret down button", title));
	}
	
	public WebElement getTutorialsButton(){
		return getHeaderButton("Tutorials");
	}
	
	public WebElement getTutorialsCaretDownButton(){
		return getHeaderCaretDownButton("Tutorials");
	}
	
	public WebElement getReferencesButton(){
		return getHeaderButton("References");
	}
	
	public WebElement getReferencesCaretDownButton(){
		return getHeaderCaretDownButton("References");
	}
	
	public WebElement getExercisesButton(){
		return getHeaderButton("Exercises");
	}
	
	public WebElement getExercisesDownButton(){
		return getHeaderCaretDownButton("Exercises");
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

	//Main Content
	
	public WebElement getMainContent(){
		return getElementById("main", "Main homepage content");
	}
	
	public String getHeaderTextInMainContent(){
		return getTextOfElement(getElementByXpath("//*[text()='Learn to Code']",  "\"Learn to Code\" header"));
	}
	
	public String getSubheaderTextInMainContent(){
		return getTextOfElement(getElementByXpath("//*[text()=\"With the world's largest web developer site.\"]", "\"With the world's largest web developer site.\" sub header"));
	}
	
	public WebElement getSearchbarField(){
		return getElementById("search2", "Search field");
	}
	
	public String getSearchbarfieldPlaceholder(){
		return getPlaceholderTextOfField(getSearchbarField());
	}
	
	public WebElement getSearchbarButton(){
		return getElementById("learntocode_searchbtn", "Search field button");	
	}
	
	public WebElement getWhereToBeginLink(){
		return getElementByLinkText("Not Sure Where To Begin?", "\"Not Sure Where To Begin?\" link");
	}
	
	public WebElement getFooter(){
		return getElementByTagName("footer", "Main page footer");
	}
	
}
