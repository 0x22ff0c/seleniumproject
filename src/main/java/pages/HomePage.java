package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	//Header
	
	public WebElement getHeader(){
		return getElementByXpath("//*[@title='Home']/parent::*");
	}

	//Header - menu items
	
	private WebElement getHeaderButton(String title){
		return getElementByXpath(String.format("//*[@title='%s']", title));
	}
	
	private WebElement getHeaderCaretDownButton(String title){
		return getElementByXpath(String.format("//*[contains(@class, 'caret-down')]/parent::*[@title='%s']", title));
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
	
	public WebElement getExcercisesButton(){
		return getHeaderButton("Exercises");
	}
	
	public WebElement getExcercisesDownButton(){
		return getHeaderCaretDownButton("Exercises");
	}
	
	public WebElement getVideosButton(){
		return getHeaderButton("Video Tutorials");
	}
	
	public WebElement getHomeLogo(){
		return getElementByXpath("//*[@title='Home']");
	}

	//Main Content
	
	public WebElement getMainContent(){
		return getElementById("main");
	}
	
	public String getHeaderTextInMainContent(){
		return getTextOfElement(getElementByXpath("//*[text()='Learn to Code']"));
	}
	
	public String getSubheaderTextInMainContent(){
		return getTextOfElement(getElementByXpath("//*[text()=\"With the world's largest web developer site.\"]"));
	}
	
	public WebElement getSearchbarField(){
		return getElementById("search2");
	}
	
	public String getSearchbarfieldPlaceholder(){
		return getPlaceholderTextOfField(getSearchbarField());
	}
	
	public WebElement getSearchbarButton(){
		return getElementById("learntocode_searchbtn");
	}
	
	public WebElement getWhereToBeginLink(){
		return getElementByLinkText("Not Sure Where To Begin?");
	}
	
	public WebElement getFooter(){
		return getElementByTagName("footer");
	}
	
}
