package enums.wheretostartpage;

public enum WhereToStartMainEnum {

	WHERE_TO_START("Where To Start"),
	
	HTML,
	
	GO_TO_HTML_TUTORIAL("Go To Our HTML Tutorial"),
	
	LEARN_HTML_BUTTON("Learn HTML"),
	
	LEARN_CSS_SECTION("Learn CSS section"),
	
	CSS,
	
	GO_TO_CSS_TUTORIAL("Go To Our CSS Tutorial"),
	
	LEARN_CSS_BUTTON("Learn CSS"),
	
	LEARN_JAVASCRIPT_SECTION("Learn JavaScript section"),
	
	JAVASCRIPT("JavaScript"),
	
	LEARN_JAVASCRIPT_BUTTON("Learn JavaScript"),
	
	WHATS_NEXT_SECTION("What's Next?"),
	
	NEXT_STEP("next step"),
	
	W3SCHOOLS_SPACES_SECTION("\"W3Schools Spaces\" section"),
	
	GET_STARTED_BUTTON("Get Started for Free"),
	
	HOW_IT_WORKS("How it works"),
	
	HELLO_DEVELOPER("Hello Developer!"),
	
	FRONT_END_DEVELOPERS("Front-End Developers"),
	
	TIP("Tip:"),
	
	BOOTSTRAP("Bootstrap"),
	
	SASS("SASS (CSS pre-processor)"),
	
	JQUERY("jQuery"),
	
	REACT("React"),
	
	GIT("Git"),
	
	WHAT_ABOUT_BACK_END_SECTION("What About Back-End?"),
	
	PHP,
	
	PYTHON("Python"),
	
	SQL,
	
	HOME_PAGE_LINK("Homepage");
	
	private WhereToStartMainEnum(){
		
	}
	
	private String nameOfElement;
	
	private WhereToStartMainEnum(String nameOfElement){
		
		this.nameOfElement = nameOfElement;
	}
	
	@Override
	public String toString(){
		
		return nameOfElement;
	}
	
}