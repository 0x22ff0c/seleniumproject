package enums.homepage.header;

public enum ReferenceHeaderEnum {

	HTML,
	
	HTML_CATEGORY_ITEMS(new String[]{"HTML Tag Reference", "HTML Browser Support", "HTML Event Reference", "HTML Color Reference", "HTML Attribute Reference"
			,"HTML Canvas Reference", "HTML SVG Reference", "Google Maps Reference"}),
	
	CSS,
	
	CSS_CATEGORY_ITEMS(new String[]{"CSS Reference", "CSS Browser Support", "CSS Selector Reference", "Bootstrap 3 Reference", "Bootstrap 4 Reference"
			,"W3.CSS Reference", "Icon Reference", "Sass Reference"}),
	
	JAVASCRIPT("JavaScript"),
	
	JAVASCRIPT_CATEGORY_ITEMS(new String[]{"JavaScript Reference", "HTML DOM Reference", "jQuery Reference", "AngularJS Reference", "AppML Reference"
			,"W3.JS Reference"}),
	
	PROGRAMMING("Programming"),
	
	PROGRAMMING_CATEGORY_ITEMS(new String[]{"Python Reference", "Java Reference"}),
	
	SERVER_SIDE("Server Side"),
	
	SERVER_SIDE_CATEGORY_ITEMS(new String[]{"SQL Reference", "MySQL Reference", "PHP Reference", "ASP Reference"}),
	
	XML,
	
	XML_CATEGORY_ITEMS(new String[]{"XML DOM Reference", "XML Http Reference", "XSLT Reference", "XML Schema Reference"}), 
	
	CHARACTER_SETS("Character Sets"),
	
	CHARACTER_SETS_ITEMS(new String[]{"HTML Character Sets", "HTML ASCII", "HTML ANSI", "HTML Windows-1252", "HTML ISO-8859-1"
			,"HTML Symbols", "HTML UTF-8"});
	
	private String[] categoryItems;

	private ReferenceHeaderEnum(String[] categoryItems){
		this.categoryItems = categoryItems;
	}

	public String[] getCategoryItems(){
		return categoryItems;
	}
	
	private String categoryName;
	
	private ReferenceHeaderEnum(String categoryName){
		this.categoryName = categoryName;
	}
	
	private ReferenceHeaderEnum(){
		
	}
	
	@Override
	public String toString(){
		return categoryName;
	}
	
}
