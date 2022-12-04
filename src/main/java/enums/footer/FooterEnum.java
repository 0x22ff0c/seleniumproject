package enums.footer;

public enum FooterEnum {

	FOOTER_SECTION("Current page footer section"),
	
	QUIZZES_BUTTON("Quizzes"),
	
	EXERCISES_BUTTON("Exercises"),
	
	CERTIFICATES_BUTTON("Courses and Certificates"),
	
	UPGRADE_BUTTON("Upgrade to Improve Your Learning Experiences"),
	
	SPACES_BUTTON("Spaces"),
	
	SUPPORT_BUTTON("Support"),
	
	NEWSLETTER_BUTTON("Join Our Newsletter"),
	
	FORUM,
	
	ABOUT,
	
	FACEBOOK_ICON_LINK("W3Schools on Facebook"),
	
	INSTAGRAM_ICON_LINK("W3Schools on Instagram"),
	
	LINKEDIN_ICON_LINK("W3Schools on LinkedIn"),
	
	DISCORD_ICON_LINK("Join the W3schools community on Discord"),
	
	FACEBOOK_LIKE_BUTTON("Like W3Schools on Facebook"),
	
	TERMS_OF_USE_LINK("terms of use"),
	
	COOKIE_AND_PRIVACY_POLICY_LINK("cookie and privacy policy"),
	
	COPYRIGHT_LINK("Copyright 1999-2022");
	
	private FooterEnum(){
		
	}
	
	private String nameOfElement;
	
	private FooterEnum(String nameOfElement){
		
		this.nameOfElement = nameOfElement;
	}
	
	@Override
	public String toString(){
		return nameOfElement;
	}
	
}
