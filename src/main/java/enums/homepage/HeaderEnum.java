package enums.homepage;

public enum HeaderEnum {

	HOME_PAGE_HEADER("Home page header menu"),
	
	TUTORIALS_MENU_BUTTON("Tutorials"),
	
	REFERENCE_MENU_BUTTON("References"),
	
	EXERCISES_MENU_BUTTON("Exercises"),
	
	VIDEO_TUTORIALS_BUTTON("Video Tutorials");
		
	private String elementName;
	
	private HeaderEnum(String elementName){
		
		this.elementName = elementName;
		
	}
	
	@Override
	public String toString(){
		return elementName;
	}
	
}