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
		
		return getButtonElement("Quizzes");
		
	}
	
	public WebElement getFooterExercisesButton(){
		
		return getButtonElement("Exercises");
		
	}
	
	public WebElement getFooterCertificatesButton(){
		
		return getButtonElement("Courses and Certificates"); //actual button name: Certificates
		
	}
	
	public WebElement getFooterUpgradeButton(){
		
		return getButtonElement("Upgrade to Improve Your Learning Experiences"); //actual button name: Upgrade
	}
	
	public WebElement getFooterSpacesButton(){
		
		return getButtonElement("Get Your Own Website With W3schools Spaces"); //actual button name: Spaces
		
	}
	
	public WebElement getFooterSupportButton(){
		
		return getButtonElement("Support");
		
	}
	
	public WebElement getFooterNewsletterButton(){
		
		return getButtonElement("Join Our Newsletter");
		
	}
	
	public WebElement getFooterShopButton(){

		return getElementByXpath("//footer/descendant::*[text()='W3SCHOOLS SHOP']", "W3Schools Shop button");
	}
	

}
