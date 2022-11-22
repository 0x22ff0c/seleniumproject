package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class HomePageFooter extends BasePage{

	public HomePageFooter(WebDriver driver){
		super(driver);
	}
	
	
	public WebElement getFooter(){
		return getElementByTagName("footer", "Main page footer");
	}
	
	public void scrollToFooterSection(){
		control.scrollToElement(getElementByXpath("//footer", "footer"));
	}

	public WebElement getQuizzesButton(){
		
		return getButtonElement("Quizzes");
		
	}
	
	public WebElement getExcercisesButton(){
		
		return getButtonElement("Exercises");
		
	}
	
	public WebElement getCertificatesButton(){
		
		return getButtonElement("Courses and Certificates");
	}
	
	public WebElement getUpgradeButton(){
		
		return getButtonElement("Upgrade to Improve Your Learning Experiences");
		
	}
	
	public WebElement getSpacesButton(){
		return getElementByXpath("(//*[@title='Get Your Own Website With W3schools Spaces'])[3]", "Spaces button");
	}
	
	public WebElement getSupportButton(){
		
		return getButtonElement("Support");
		
	}
	
	public WebElement getNewsLetterButton(){
		
		return getButtonElement("Join Our Newsletter");
		
	}
	
	public WebElement getForumLink(){
		return getElementByLinkText("FORUM");
	}
	
	public WebElement getAboutLink(){
		return getElementByLinkText("ABOUT");
	}
	
	private WebElement getIconLink(String linkName){
		return getElementByXpath(String.format("//i/parent::*[@title='%s']", linkName), linkName + " link");
	}
	
	public WebElement getFacebookIconLink(){
		return getIconLink("W3Schools on Facebook");
	}
	
	public WebElement getInstagramIconLink(){
		return getIconLink("W3Schools on Instagram");
	}
	
	public WebElement getLinkedInLink(){
		return getIconLink("W3Schools on LinkedIn");
	}
	
	public WebElement getDiscordLink(){
		return getIconLink("Join the W3schools community on Discord");
	}
	
	public WebElement getLinkOnFacebookButton(){
		return getElementByXpath("//*[@title='Like W3Schools on Facebook']", "Facebook button");
	}
	
	public String getFooterText(){
		
		return getTextOfElement(By.xpath("(//footer/descendant::p)[5]"));
	}
	
	public WebElement getTermsOfUseLink(){
		return getElementByLinkText("terms of use");
	}
	
	public WebElement getCookieAndPrivacyPolicyLink(){
		return getElementByLinkText("cookie and privacy policy");
	}
	
	public WebElement getCopyrightLink(){
		return getElementByLinkText("Copyright 1999-2022", "Copyright");
	}
	
}
