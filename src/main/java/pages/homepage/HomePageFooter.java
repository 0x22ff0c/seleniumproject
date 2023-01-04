package pages.homepage;

import enums.footer.FooterEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.Calendar;

public class HomePageFooter extends BasePage{

	public HomePageFooter(WebDriver driver){
		super(driver);
	}

	public void scrollToFooterSection(){
		control.scrollToElement(getElementByTagName("footer", FooterEnum.FOOTER_SECTION));
	}

	public WebElement getQuizzesButton(){
		return getButtonElement(FooterEnum.QUIZZES_BUTTON);
	}

	public WebElement getExercisesButton(){
		return getButtonElement(FooterEnum.EXERCISES_BUTTON);
	}

	public WebElement getCertificatesButton(){
		return getButtonElement("Courses and Certificates", FooterEnum.CERTIFICATES_BUTTON);
	}

	public WebElement getUpgradeButton(){
		return getButtonElement("Upgrade to Improve Your Learning Experiences", FooterEnum.UPGRADE_BUTTON);
	}

	public WebElement getSpacesButton(){
		return getButtonElementByXpath("(//*[@title='Get Your Own Website With W3schools Spaces'])[3]", FooterEnum.SPACES_BUTTON);
	}

	public WebElement getSupportButton(){
		return getButtonElement(FooterEnum.SUPPORT_BUTTON);
	}

	public WebElement getNewsLetterButton(){
		return getButtonElement(FooterEnum.NEWSLETTER_BUTTON);
	}
	
	public WebElement getForumLink(){
		return getElementByLinkText(FooterEnum.FORUM.name());
	}
	
	public WebElement getAboutLink(){
		return getElementByLinkText(FooterEnum.ABOUT.name());
	}

	private WebElement getIconLink(Object nameOfTheLink){
		return getLinkElementByXpath(String.format("//i/parent::*[@title='%s']", nameOfTheLink), nameOfTheLink);
	}
	
	public WebElement getFacebookIconLink(){
		return getIconLink(FooterEnum.FACEBOOK_ICON_LINK);
	}
	
	public WebElement getInstagramIconLink(){
		return getIconLink(FooterEnum.INSTAGRAM_ICON_LINK);
	}
	
	public WebElement getLinkedInLink(){
		return getIconLink(FooterEnum.LINKEDIN_ICON_LINK);
	}
	
	public WebElement getDiscordLink(){
		return getIconLink(FooterEnum.DISCORD_ICON_LINK);
	}
	
	public WebElement getLinkOnFacebookButton(){
		return getButtonElement("Like W3Schools on Facebook", FooterEnum.FACEBOOK_LIKE_BUTTON);
	}
	
	public String getFooterText(){
		return getTextOfElementUsingXpathLocator("(//footer/descendant::p)[5]");
	}
	
	public WebElement getTermsOfUseLink(){
		return getElementByLinkText(FooterEnum.TERMS_OF_USE_LINK);
	}
	
	public WebElement getCookieAndPrivacyPolicyLink(){
		return getElementByLinkText(FooterEnum.COOKIE_AND_PRIVACY_POLICY_LINK);
	}

	public String getYear(){
		Calendar calendar = Calendar.getInstance();
		return  String.valueOf(calendar.get(Calendar.YEAR));
	}

	public WebElement getCopyrightLink(){
		return getElementByLinkText("Copyright 1999-" + getYear() , FooterEnum.COPYRIGHT_LINK);
	}
}