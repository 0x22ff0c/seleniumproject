package enums.homepage;

public enum HomePageHeaderEnum {

	HTML_AND_CSS_CATEGORY("HTML and CSS"),

	HTML_AND_CSS_CATEGORY_ITEMS(new String[]{"Learn HTML", "Learn CSS", "Learn RWD", "Learn Bootstrap", "Learn W3.CSS", "Learn Colors", 
		"Learn Icons", "Learn Graphics", "Learn SVG", "Learn Canvas", "Learn How To", "Learn Sass"}),
	
	JAVASCRIPT_CATEGORY("JavaScript"),
	
	JAVA_SCRIPT_CATEGORY_ITEMS(new String[]{"Learn JavaScript", "Learn jQuery", "Learn React", "Learn AngularJS", "Learn JSON",
			"Learn AJAX", "Learn AppML", "Learn W3.JS"}),
	
	PROGRAMMING_CATEGORY("Programming"),
	
	SERVER_SIDE_CATEGORY("Server Side"),
	
	WEB_BUILDING_CATEGORY("Web Building"),
	
	DATA_ANALYTICS_CATEGORY("Data Analytics"),
	
	XML_TUTORIALS_CATEGORY("XML Tutorials");
	
	private String categoryName;
	
	private String[] categoryItems;
	
	private HomePageHeaderEnum(final String[] categoryItems){
		
		this.categoryItems = categoryItems;
		
	}
	
	public String[] getCategoryItems(){
		return categoryItems;
	}
	
	private HomePageHeaderEnum(final String categoryName){
		
		this.categoryName = categoryName;
		
	}
	
	public String getCateogryName(){
		return categoryName;
	}
	
	@Override
	public String toString(){
		return this.getCateogryName();
	}
	
}
