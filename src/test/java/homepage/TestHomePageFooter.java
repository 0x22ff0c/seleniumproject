package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.HomePageFooter;
import tests.BaseTest;
import utilities.Control;
import utilities.Listener;

public class TestHomePageFooter {

	HomePageFooter homePageFooter;
	
	Control control;
	
	BaseTest baseTest;
	
	@BeforeClass
	private void setup(){
		
		baseTest = new BaseTest();
	
		WebDriver driver = Listener.getDriver();
		
		homePageFooter = new HomePageFooter(driver, baseTest);
		
		control = new Control(driver, baseTest);
		
		control.scrollToElement(homePageFooter.getFooter());
		
	}
	
	@Test(testName = "Verify Home page footer buttons", priority = 3)
	private void verifyFooterButtons(){
		
		baseTest.setSoftAssertion(Listener.getAssertion());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getQuizzesButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getExcercisesButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getCertificatesButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getUpgradeButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getSpacesButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getSupportButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getNewsLetterButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getLinkOnFacebookButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify Home page footer links", priority = 4)
	private void verifyFooterLinks(){
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getForumLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getAboutLink());
		
		baseTest.assertAll();
	
	}
	
	@Test(testName = "Verify Home page footer icon links", priority = 5)
	private void verifyFooterIconLinks(){
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getFacebookIconLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getInstagramIconLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getLinkedInLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getDiscordLink());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify footer texts", priority = 6)
	private void verifyFooterTexts(){
		
		baseTest.verifyTextIsTheSame(homePageFooter.getFooterText(),"W3Schools is optimized for learning, testing, and training. Examples might be simplified to improve reading and basic understanding. Tutorials, references, and examples are constantly reviewed to avoid errors, but we cannot warrant full correctness of all content. While using this site, you agree to have read and accepted our terms of use, cookie and privacy policy.\n"
				+ "Copyright 1999-2022 by Refsnes Data. All Rights Reserved.");
	
		baseTest.verifyElementIsDisplayed(homePageFooter.getTermsOfUseLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getCookieAndPrivacyPolicyLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getCopyrightLink());
		
		baseTest.assertAll();
	}
}