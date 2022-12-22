package pages.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.footer.FooterEnum;
import pages.BasePage;

public class HomePageFooter extends BasePage{

	public HomePageFooter(WebDriver driver){
		super(driver);
	}
	
	//Remove
	public WebElement getFooter(){
		return getElementByTagName("footer", FooterEnum.FOOTER_SECTION.toString());
	}
	
	//Retain
	public void scrollToFooterSection(){
		control.scrollToElement(getElementByTagName("footer", FooterEnum.FOOTER_SECTION.toString()));
	}

	//Retain
	public WebElement getQuizzesButton(){
		return getButtonElement(FooterEnum.QUIZZES_BUTTON.toString());
	}
	
	//Retain
	public WebElement getExcercisesButton(){
		return getButtonElement(FooterEnum.EXERCISES_BUTTON.toString());
	}
	
	//Add "Certificates" for the button name
	public WebElement getCertificatesButton(){
		return getButtonElement(FooterEnum.EXERCISES_BUTTON.toString());
	}
	
	//Add "Upgrade" for the button name
	public WebElement getUpgradeButton(){
		return getButtonElement(FooterEnum.UPGRADE_BUTTON.toString());
	}
	
	//Change to getButtonElement that accepts By object
	public WebElement getSpacesButton(){
		return getElementByXpath("(//*[@title='Get Your Own Website With W3schools Spaces'])[3]", FooterEnum.SPACES_BUTTON.toString());
	}
	
	//Retain
	public WebElement getSupportButton(){
		return getButtonElement(FooterEnum.SUPPORT_BUTTON.toString());
	}
	
	//Retain
	public WebElement getNewsLetterButton(){
		return getButtonElement(FooterEnum.NEWSLETTER_BUTTON.toString());
	}
	
	public WebElement getForumLink(){
		return getElementByLinkText(FooterEnum.FORUM.name());
	}
	
	public WebElement getAboutLink(){
		return getElementByLinkText(FooterEnum.ABOUT.name());
	}
	
	private WebElement getIconLink(String linkName){
		return getElementByXpath(String.format("//i/parent::*[@title='%s']", linkName), linkName + " link");
	}
	
	public WebElement getFacebookIconLink(){
		return getIconLink(FooterEnum.FACEBOOK_ICON_LINK.toString());
	}
	
	public WebElement getInstagramIconLink(){
		return getIconLink(FooterEnum.INSTAGRAM_ICON_LINK.toString());
	}
	
	public WebElement getLinkedInLink(){
		return getIconLink(FooterEnum.LINKEDIN_ICON_LINK.toString());
	}
	
	public WebElement getDiscordLink(){
		return getIconLink(FooterEnum.DISCORD_ICON_LINK.toString());
	}
	
	public WebElement getLinkOnFacebookButton(){
		return getButtonElement("Like W3Schools on Facebook", FooterEnum.FACEBOOK_LIKE_BUTTON.toString());
	}
	
	public String getFooterText(){
		return getTextOfElementUsingXpathLocator("(//footer/descendant::p)[5]");
	}
	
	public WebElement getTermsOfUseLink(){
		return getElementByLinkText(FooterEnum.TERMS_OF_USE_LINK.toString());
	}
	
	public WebElement getCookieAndPrivacyPolicyLink(){
		return getElementByLinkText(FooterEnum.COOKIE_AND_PRIVACY_POLICY_LINK.toString());
	}
	
	public WebElement getCopyrightLink(){
		return getElementByLinkText(FooterEnum.COPYRIGHT_LINK.toString(), "Copyright");
	}
}