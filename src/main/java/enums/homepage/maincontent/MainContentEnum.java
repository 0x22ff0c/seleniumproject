package enums.homepage.maincontent;

public enum MainContentEnum {

	MAIN_CONTENT_SECTION("Main homepage content"),
	
	LEARN_TO_CODE_HEADER("Learn to Code"),
	
	LEARN_TO_CODE_SUB_HEADER("With the world's largest web developer site."),
	
	SEARCH_FIELD("Search field"),
	
	SEARCH_FIELD_BUTTON("Search field"),
	
	NOT_SURE_WHERE_TO_BEGIN_LINK("Not Sure Where To Begin?"),

	//region Learn HTML section
	HTML,
	
	LEARN_HTML("Learn HTML"),
	
	VIDEO_TUTORIAL("Video Tutorial"),
	
	HTML_REFERENCE("HTML Reference"),
	
	HTML_SAMPLE_CODE_SECTION("HTML Sample code"),
	
	HTML_TRY_IT_YOURSELF_BUTTON("HTML Try It Yourself"),

	HTML_ADD_CERTIFICATION_ID("Add HTML Certification"),

	GET_CERTIFIED("Get Certified"),
	//endregion

	//region Learn CSS section
	CSS,
	
	LEARN_CSS("Learn CSS"),
	
	CSS_REFERENCE("CSS Reference"),

	CSS_ADD_CERTIFICATION_ID("Add CSS Certification"),

	CSS_SAMPLE_CODE_SECTION("CSS Sample code"),
	
	CSS_TRY_IT_YOURSELF_BUTTON("CSS Try It Yourself"),
	//endregion

	//region Learn JavaScript section
	JAVASCRIPT("JavaScript"),
	
	LEARN_JAVASCRIPT("Learn JavaScript"),
	
	JAVASCRIPT_REFERENCE("JavaScript Reference"),

	JAVASCRIPT_ADD_CERTIFICATION_ID("Add JavaScript Certification"),

	JAVASCRIPT_SAMPLE_CODE_SECTION("JavaScript Sample code"),
	
	JAVASCRIPT_TRY_IT_YOURSELF_BUTTON("JavaScript Try It Yourself"),
	//endregion

	//region Learn Python section
	PYTHON("Python"),
	
	LEARN_PYTHON("Learn Python"),
	
	PYTHON_REFERENCE("Python Reference"),

	PYTHON_ADD_CERTIFICATION_ID("Add Python Certification"),

	PYTHON_SAMPLE_CODE_SECTION("Python Sample code"),
	
	PYTHON_TRY_IT_YOURSELF_BUTTON("Python Try It Yourself"),
	//endregion

	//region Learn SQL section
	SQL,
	
	LEARN_SQL("Learn SQL"),
	
	SQL_REFERENCE("SQL Reference"),

	SQL_ADD_CERTIFICATION_ID("Add SQL Certification"),

	SQL_SAMPLE_CODE_SECTION("SQL Sample code"),
	
	SQL_TRY_IT_YOURSELF_BUTTON("SQL Try It Yourself"),
	//endregion

	//region Other Tutorials section
	OTHER_TUTORIALS_SECTION("Other tutorials section"),

	PHP,
	
	JQUERY("jQuery"),
	
	JAVA("Java"),
	
	CPLUSPLUS("C++"),
	
	W3CSS("W3.CSS"),
	
	BOOTSTRAP("Bootstrap"),
	//endregion

	//region Code Editor section
	CODE_EDITOR_SECTION("Code Editor section"),

	FRONT_END_ACTIVE_BUTTON("Frontend active"),

	FRONT_END_INACTIVE_BUTTON("Frontend inactive"),

	FRONT_END_GIF("Frontend GIF"),

	FRONT_END_EDITOR_BUTTON("Frontend editor"),

	BACK_END_ACTIVE_BUTTON("Backend active"),

	BACK_END_INACTIVE_BUTTON("Backend inactive"),

	BACK_END_GIF("Backend GIF"),

	BACK_END_EDITOR_BUTTON("Backend editor"),
	//endregion

	//region W3Schools Spaces section
	W3SCHOOLS_SPACES("W3Schools Spaces"),

	W3SCHOOLS_SPACES_SCREENSHOT("W3Schools Spaces sample screenshot"),

	W3SCHOOLS_SPACES_HOW_IT_WORKS_IMAGE("W3Schools Spaces how it works image"),

	W3SCHOOLS_SPACES_GET_STARTED_NOW_BUTTON("W3Schools Spaces - Get Started Now"),
	//endregion

	//region My Learning section
	MY_LEARNING_SECTION("My Learning section"),

	MY_LEARNING_HEADER("My Learning header"),

	MY_LEARNING_SAMPLE_SCREENSHOT("My Learning sample screenshot"),

	MY_LEARNING_SIGN_UP_FOR_FREE_BUTTON("Sign Up for Free"),
	//endregion

	//region Become a PRO user section
	BECOME_A_PRO_USER_SECTION("Become a PRO User section"),

	BECOME_A_PRO_USER_HEADER("Become a PRO User header"),

	BECOME_A_PRO_USER_1ST_CHECKBOX("Become Pro User - 1st checkbox"),

	BECOME_A_PRO_USER_2ND_CHECKBOX("Become Pro User - 2nd checkbox"),

	BECOME_A_PRO_USER_2ND_CHECKBOX_LINK("Become Pro User - Spaces"),

	BECOME_A_PRO_USER_3RD_CHECKBOX("Become Pro User - 3rd checkbox"),

	BECOME_A_PRO_USER_3RD_CHECKBOX_HTML_VIDEO_LINK("Become Pro User - HTML Video Tutorial"),

	BECOME_A_PRO_USER_3RD_CHECKBOX_LEARN_MORE_LINK("Learn More"),
	//endregion

	//region Color picker section
	COLOR_PICKER_SECTION("Color Picker section"),

	COLOR_PICKER_HEADER("Color Picker header"),

	COLOR_PICKER_IMAGE("Color picker image"),
	//endregion

	//region Code Game section
	CODE_GAME_SECTION("Code Game section"),

	CODE_GAME_HEADER("Code Game header"),

	CODE_GAME_IMAGE_OF_LYNX("Image of Lynx"),

	CODE_GAME_PLAY_GAME_BUTTON("Play Game"),
	//endregion

	//region Exercises and Quizzes section
	EXERCISES_AND_QUIZZES_SECTION("Exercises and Quizzes section"),

	EXERCISES_AND_QUIZZES_HEADER("Exercises and Quizzes header"),

	EXERCISES_BUTTON("Exercises"),

	QUIZZES_BUTTON("Quizzes"),
	//endregion

	//region Web Templates section
	WEB_TEMPLATES_SECTION("Web Templates section"),

	WEB_TEMPLATES_HEADER("Web Templates header"),

	WEB_TEMPLATES_SAMPLE_IMAGES("Web Templates sample images"),

	BROWSE_TEMPLATES_BUTTON("Browse Templates"),
	//endregion

	//region Certification section
	CERTIFICATION_SECTION("Certification section"),

	KICKSTART_YOUR_CAREER_HEADER("Kickstart your career header"),

	CERTIFICATION_GET_STARTED_BUTTON("Get started"),

	CERTIFICATION_ARROW("Arrow pointing to certification badge"),

	CERTIFICATION_BADGE("Certification badge"),
	//endregion

	HOW_TO_SECTION("How To Section");

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
