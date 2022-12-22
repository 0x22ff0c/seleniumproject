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

		WebDriver driver = Listener.getDriver();

		homePageFooter = new HomePageFooter(driver);
		
		homePageFooter.scrollToFooterSection();
		
	}
	
	@Test(testName = "Verify Home page footer buttons", priority = 1)
	private void verifyFooterButtons(){
		
		baseTest = new BaseTest(homePageFooter);
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getQuizzesButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getExercisesButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getCertificatesButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getUpgradeButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getSpacesButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getSupportButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getNewsLetterButton());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getLinkOnFacebookButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify Home page footer links", priority = 2)
	private void verifyFooterLinks(){
		
		baseTest = new BaseTest(homePageFooter);
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getForumLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getAboutLink());
		
		baseTest.assertAll();
	
	}
	
	@Test(testName = "Verify Home page footer icon links", priority = 3)
	private void verifyFooterIconLinks(){
		
		baseTest = new BaseTest(homePageFooter);
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getFacebookIconLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getInstagramIconLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getLinkedInLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getDiscordLink());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify footer texts", priority = 4)
	private void verifyFooterTexts(){
		
		baseTest = new BaseTest(homePageFooter);
		
		baseTest.verifyTextIsTheSame(homePageFooter.getFooterText(),"W3Schools is optimized for learning, testing, and training. Examples might be simplified to improve reading and basic understanding. Tutorials, references, and examples are constantly reviewed to avoid errors, but we cannot warrant full correctness of all content. While using this site, you agree to have read and accepted our terms of use, cookie and privacy policy. "
				+ "Copyright 1999-2022 by Refsnes Data. All Rights Reserved.");
	
		baseTest.verifyElementIsDisplayed(homePageFooter.getTermsOfUseLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getCookieAndPrivacyPolicyLink());
		
		baseTest.verifyElementIsDisplayed(homePageFooter.getCopyrightLink());
		
		baseTest.assertAll();
	}

}