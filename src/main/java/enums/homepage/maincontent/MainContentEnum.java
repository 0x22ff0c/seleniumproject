package enums.homepage.maincontent;

public enum MainContentEnum {

	MAIN_CONTENT_SECTION("Main homepage content"),
	
	LEARN_TO_CODE_HEADER("Learn to Code"),
	
	LEARN_TO_CODE_SUB_HEADER("With the world's largest web developer site."),
	
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

	OTHER_TUTORIALS_SECTION("Other tutorials section"),

	PHP,
	
	JQUERY("jQuery"),
	
	JAVA("Java"),
	
	CPLUSPLUS("C++"),
	
	W3CSS("W3.CSS"),
	
	BOOTSTRAP("Bootstrap"),

	CODE_EDITOR_SECTION("Code Editor section"),

	FRONT_END_ACTIVE_BUTTON("Frontend active"),

	FRONT_END_INACTIVE_BUTTON("Frontend inactive"),

	FRONT_END_GIF("Frontend GIF"),

	FRONT_END_EDITOR_BUTTON("Frontend editor"),

	BACK_END_ACTIVE_BUTTON("Backend active"),

	BACK_END_INACTIVE_BUTTON("Backend inactive"),

	BACK_END_GIF("Backend GIF"),

	BACK_END_EDITOR_BUTTON("Backend editor"),

	W3SCHOOLS_SPACES("W3Schools Spaces"),

	W3SCHOOLS_SPACES_SCREENSHOT("W3Schools Spaces sample screenshot"),

	W3SCHOOLS_SPACES_HOW_IT_WORKS_IMAGE("W3Schools Spaces how it works image"),

	W3SCHOOLS_SPACES_GET_STARTED_NOW_BUTTON("W3Schools Spaces - Get Started Now"),

	MY_LEARNING_SECTION("My Learning section"),

	MY_LEARNING_HEADER("My Learning header");

	MainContentEnum(){}
	
	private String elementName; 
	
	MainContentEnum(String elementName){
		this.elementName = elementName;
	}
	
	@Override
	public String toString(){
		return elementName;
	}
	
}
