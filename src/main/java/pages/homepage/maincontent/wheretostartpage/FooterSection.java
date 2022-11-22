package pages.homepage.maincontent.wheretostartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.homepage.HomePageFooter;

public class FooterSection extends HomePageFooter{

	public FooterSection(WebDriver driver) {
		super(driver);
		
	}
	
	public void scrollToWhereToStartFooter(){
		control.scrollToElement(getElementByTagName("footer", "Where to start - footer section"));
	}
	
	public WebElement getFooterHomeButton(){
		return getElementByXpath("//footer/*[@title='Home']", "Home button");
	}
	
	public WebElement getFooterQuizzesButton(){
		return getElementByXpath("(//*[@title='Quizzes'])[1]", "Quizzes button");
	}
	
	public WebElement getFooterExercisesButton(){
		return getElementByXpath("(//*[@title='Exercises'])[1]", "Exercises button");
	}
	
	public WebElement getFooterCertificatesButton(){
		return getElementByXpath("(//*[@title='Courses and Certificates'])[1]", "Certificates button");
	}
	
	public WebElement getFooterUpgradeButton(){
		return getElementByXpath("(//*[@title='Upgrade to Improve Your Learning Experiences'])[1]", "Upgrade button");
	}
	
	public WebElement getFooterSpacesButton(){
		return getElementByXpath("(//*[@title='Get Your Own Website With W3schools Spaces'])[1]", "Spaces button");
	}
	
	public WebElement getFooterSupportButton(){
		return getElementByXpath("(//*[@title='Support'])[1]", "Support button");
	}
	
	public WebElement getFooterNewsletterButton(){
		return getElementByXpath("(//*[@title='Join Our Newsletter'])[1]", "Join Our Newsletter button");
	}
	
	public WebElement getFooterShopButton(){
		return getElementByXpath("//footer/descendant::*[text()='W3SCHOOLS SHOP']", "W3Schools Shop button");
	}
	

}
