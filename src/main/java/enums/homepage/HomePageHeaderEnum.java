package enums.homepage;

public enum HomePageHeaderEnum {

	HTML_AND_CSS_CATEGORY("HTML and CSS"),

	HTML_AND_CSS_CATEGORY_ITEMS(new String[]{"Learn HTML", "Learn CSS", "Learn RWD", "Learn Bootstrap", "Learn W3.CSS", "Learn Colors", 
		"Learn Icons", "Learn Graphics", "Learn SVG", "Learn Canvas", "Learn How To", "Learn Sass"}),
	
	JAVASCRIPT_CATEGORY("JavaScript"),
	
	JAVA_SCRIPT_CATEGORY_ITEMS(new String[]{"Learn JavaScript", "Learn jQuery", "Learn React", "Learn AngularJS", "Learn JSON",
			"Learn AJAX", "Learn AppML", "Learn W3.JS"}),
	
	PROGRAMMING_CATEGORY("Programming"),
	
	PROGRAMMING_CATEGORY_ITEMS(new String[]{"Learn Python", "Learn Java", "Learn C", "Learn C++", "Learn C#", "Learn R", 
			"Learn Kotlin", "Learn Go", "Learn Django", "Learn TypeScript"}),
	
	SERVER_SIDE_CATEGORY("Server Side"),
	
	SERVER_SIDE_CATEGORY_ITEMS(new String[]{"Learn SQL", "Learn MySQL", "Learn PHP", "Learn ASP", "Learn Node.js",
			"Learn Raspberry Pi", "Learn Git", "Learn MongoDB", "Learn AWS Cloud"}),
	
	WEB_BUILDING_CATEGORY("Web Building"),
	
	WEB_BUILDING_CATEGORY_ITEMS(new String[]{"Create a Website ", "Where To Start", "Web Templates", "Web Statistics", "Web Certificates",
			"Web Development", "Code Editor", "Test Your Typing Speed", "Play a Code Game", "Cyber Security", "Accessibility", "Join our Newsletter"}),
	
	DATA_ANALYTICS_CATEGORY("Data Analytics"),
	
	DATA_ANALYTICS_CATEGORY_ITEMS(new String[]{"Learn AI", "Learn Machine Learning", "Learn Data Science", "Learn NumPy", "Learn Pandas",
			"Learn SciPy", "Learn Matplotlib", "Learn Statistics", "Learn Excel", "Learn Google Sheets"}),
			
	XML_TUTORIALS_CATEGORY("XML Tutorials"),
	
	XML_TUTORIALS_CATEGORY_ITEMS(new String[]{"Learn XML", "Learn XML AJAX", "Learn XML DOM", "Learn XML DTD", "Learn XML Schema",
			"Learn XSLT", "Learn XPath", "Learn XQuery"});
	
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
