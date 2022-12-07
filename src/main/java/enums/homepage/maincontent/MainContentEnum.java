package enums.homepage.maincontent;

public enum MainContentEnum {

	MAIN_CONTENT_SECTION("Main homepage content"),
	
	LEARN_TO_CODE_HEADER("Learn to Code"),
	
	LEARN_TO_CODE_SUBHEADER("With the world's largest web developer site."),
	
	SEARCH_FIELD("Search field"),
	
	SEARCH_FIELD_BUTTON("Search field button"),
	
	NOT_SURE_WHERE_TO_BEGIN_LINK("Not Sure Where To Begin?");
	
	private String elementName; 
	
	private MainContentEnum(String elementName){
		this.elementName = elementName;
	}
	
	@Override
	public String toString(){
		return elementName;
	}
	
}
