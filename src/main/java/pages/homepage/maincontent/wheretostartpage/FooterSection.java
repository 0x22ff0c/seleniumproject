package pages.homepage.maincontent.wheretostartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.homepage.HomePageFooter;

public class FooterSection extends HomePageFooter{

	public FooterSection(WebDriver driver) {
		super(driver);
		
	}
	
	//Delete method
	public void scrollToWhereToStartFooter(){
		control.scrollToElement(getElementByTagName("footer", "Where to start - footer section"));
	}
	
	public WebElement getFooterHomeButton(){
		return getElementByXpath("//footer/*[@title='Home']", "Home button");
	}
	
	//Delete method
	public WebElement getFooterQuizzesButton(){
		
		return getButtonElement("Quizzes");
		
	}
	
	//Delete method
	public WebElement getFooterExercisesButton(){
		
		return getButtonElement("Exercises");
		
	}
	
	//Delete method
	public WebElement getFooterCertificatesButton(){
		
		return getButtonElement("Courses and Certificates", "Certificates");
		
	}
	
	//Delete method
	public WebElement getFooterUpgradeButton(){
		
		return getButtonElement("Upgrade to Improve Your Learning Experiences", "Upgrade");
	}
	
	//Delete method
	public WebElement getFooterSpacesButton(){
		
		return getButtonElement("Get Your Own Website With W3schools Spaces", "Spaces");
		
	}
	
	//Delete method
	public WebElement getFooterSupportButton(){
		
		return getButtonElement("Support");
		
	}
	
	//Delete method
	public WebElement getFooterNewsletterButton(){
		
		return getButtonElement("Join Our Newsletter");
		
	}
	
	public WebElement getFooterShopButton(){

		return getElementByXpath("//footer/descendant::*[text()='W3SCHOOLS SHOP']", "W3Schools Shop button");
	}
	

}
