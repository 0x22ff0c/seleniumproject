package enums.wheretostartpage;

public enum WhereToStartMainEnum {

	HTML,
	
	LEARN_HTML_BUTTON("Learn HTML"),
	
	LEARN_CSS_SECTION("Learn CSS section"),
	
	CSS,
	
	LEARN_CSS_BUTTON("Learn CSS"),
	
	LEARN_JAVASCRIPT_SECTION("Learn JavaScript section"),
	
	JAVASCRIPT("JavaScript"),
	
	LEARN_JAVASCRIPT_BUTTON("Learn JavaScript"),
	
	WHATS_NEXT_SECTION("What's Next?"),
	
	NEXT_STEP("next step"),
	
	W3SCHOOLS_SPACES_SECTION("\"W3Schools Spaces\" section"),
	
	GET_STARTED_BUTTON("Get Started for Free"),
	
	HOW_IT_WORKS("How it works");
	
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