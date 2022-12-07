package enums.homepage.header;

public enum HeaderEnum {

	HOME_PAGE_HEADER("Home page header menu"),
	
	TUTORIALS_MENU_BUTTON("Tutorials"),
	
	REFERENCE_MENU_BUTTON("References"),
	
	EXERCISES_MENU_BUTTON("Exercises"),
	
	VIDEO_TUTORIALS_BUTTON("Video Tutorials"),
		
	TOGGLE_DARK_CODE("Toggle Dark Code"),
	
	TRANSLATE_BUTTON("Translate"),
	
	SEARCH_BUTTON("Search"),
	
	UPGRADE_BUTTON("Upgrade"),
	
	CERTIFIED_BUTTON("Certified"),
	
	FREE_WEBSITE_BUTTON("Free Website"),
	
	LOGIN_BUTTON("Login"),
	
	HOME_LOGO("Home logo");
	
	private String elementName;
	
	private HeaderEnum(String elementName){
		
		this.elementName = elementName;
		
	}
	
	@Override
	public String toString(){
		return elementName;
	}
	
}