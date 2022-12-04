package enums.wheretostartpage;

public enum WhereToStartMainEnum {

	HTML,
	
	LEARN_HTML_BUTTON("Learn HTML"),
	
	LEARN_CSS_SECTION("Learn CSS section"),
	
	CSS,
	
	LEARN_CSS_BUTTON("Learn CSS"),
	
	LEARN_JAVASCRIPT_SECTION("Learn JavaScript"),
	
	JAVASCRIPT("JavaScript"),
	
	LEARN_JAVASCRIPT_BUTTON("Learn JavaScript");
	
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