package enums.homepage.maincontent;

public enum MainContentEnum {

	MAIN_CONTENT_SECTION("Main homepage content"),
	
	LEARN_TO_CODE_HEADER("Learn to Code"),
	
	LEARN_TO_CODE_SUBHEADER("With the world's largest web developer site."),
	
	SEARCH_FIELD("Search field"),
	
	SEARCH_FIELD_BUTTON("Search field"),
	
	NOT_SURE_WHERE_TO_BEGIN_LINK("Not Sure Where To Begin?"),
	
	HTML,
	
	LEARN_HTML("Learn HTML"),
	
	VIDEO_TUTORIAL("Video Tutorial"),
	
	HTML_REFERENCE("HTML Reference"),
	
	HTML_SAMPLE_CODE_SECTION("HTML Sample code"),
	
	HTML_TRY_IT_YOURSELF_BUTTON("HTML Try It Yourself"),

	HTML_ADD_CERTIFICATION_ID("Add HTML Certification"),

	GET_CERTIFIED("Get Certified"),
	
	CSS,
	
	LEARN_CSS("Learn CSS"),
	
	CSS_REFERENCE("CSS Reference"),

	CSS_ADD_CERTIFICATION_ID("Add CSS Certification"),

	CSS_SAMPLE_CODE_SECTION("CSS Sample code"),
	
	CSS_TRY_IT_YOURSELF_BUTTON("CSS Try It Yourself"),
	
	JAVASCRIPT("JavaScript"),
	
	LEARN_JAVASCRIPT("Learn JavaScript"),
	
	JAVASCRIPT_REFERENCE("JavaScript Reference"),

	JAVASCRIPT_ADD_CERTIFICATION_ID("Add JavaScript Certification"),

	JAVASCRIPT_SAMPLE_CODE_SECTION("JavaScript Sample code"),
	
	JAVASCRIPT_TRY_IT_YOURSELF_BUTTON("JavaScript Try It Yourself"),
	
	PYTHON("Python"),
	
	LEARN_PYTHON("Learn Python"),
	
	PYTHON_REFERENCE("Python Reference"),

	PYTHON_ADD_CERTIFICATION_ID("Add Python Certification"),

	PYTHON_SAMPLE_CODE_SECTION("Python Sample code"),
	
	PYTHON_TRY_IT_YOURSELF_BUTTON("Python Try It Yourself"),
	
	SQL,
	
	LEARN_SQL("Learn SQL"),
	
	SQL_REFERENCE("SQL Reference"),

	SQL_ADD_CERTIFICATION_ID("Add SQL Certification"),

	SQL_SAMPLE_CODE_SECTION("SQL Sample code"),
	
	SQL_TRY_IT_YOURSELF_BUTTON("SQL Try It Yourself"),
	
	PHP,
	
	JQUERY("jQuery"),
	
	JAVA("Java"),
	
	CPLUSPLUS("C++"),
	
	W3CSS("W3.CSS"),
	
	BOOTSTRAP("Bootstrap");
	
	private MainContentEnum(){
		
	}
	
	private String elementName; 
	
	private MainContentEnum(String elementName){
		this.elementName = elementName;
	}
	
	@Override
	public String toString(){
		return elementName;
	}
	
}
