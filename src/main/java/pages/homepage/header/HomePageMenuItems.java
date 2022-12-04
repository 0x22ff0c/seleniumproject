package pages.homepage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.homepage.HeaderEnum;

public class HomePageMenuItems extends HomePageHeader{

	public HomePageMenuItems(WebDriver driver) {
		super(driver);
	}
	
	@Override
	protected WebElement getHeaderCaretButton(String title){
		return getElementByXpath(String.format("//*[@title='%s']/descendant::*[contains(@class, 'caret-up') and contains(@style, 'inline')]", title), String.format("%s caret up", title));
	}
	
	private WebElement getHeaderMenuCloseButton(String idValue, String elementName){
		return getElementByXpath(String.format("//*[@id='%s']/descendant::*[text()='×']", idValue), String.format("%s close button", elementName));
	}
	
	private WebElement getMenuContainer(String idValue, String elementName){
		return getElementByXpath(String.format("//*[@id='%s' and contains(@style, 'display: block')]", idValue), String.format("%s menu container", elementName));
	}

	private String menuItemInContainer = "//*[@id='%s' and contains(@style, 'display: block')]/descendant::*[text()='%s']";
	
	private WebElement getHeaderInMenuContainer(String idValue, String elementName){
		return getElementByXpath(String.format(menuItemInContainer, idValue, elementName), String.format("%s header in menu container", elementName));
	}

	String categoryName = "";
	
	private WebElement getCategoryName(String idValue, String categoryName){
		
		String xpathExpression = menuItemInContainer;
		
		this.categoryName = categoryName;
		
		if(categoryName.equals("Data Analytics") || categoryName.equals("XML Tutorials")){
			
			xpathExpression = (String.format("(%s)[2]", menuItemInContainer));
			
		}
		
		return getElementByXpath(String.format(xpathExpression, idValue, categoryName), String.format("Category in menu: %s", categoryName));
	}
	
	public WebElement getCategoryItem(String categoryItem){
		
		String xpathExpression = "//*[text()='%s']/following-sibling::*[text()='%s']";
		
		if(categoryName.equals("Data Analytics") || categoryName.equals("XML Tutorials")){
		
			xpathExpression = String.format("(%s)[2]", xpathExpression);
			
		}
		
		return getElementByXpath(String.format(xpathExpression, categoryName, categoryItem), String.format("Category: %s | Category name: %s", categoryName, categoryItem));
	}
	
	private static final String TUTORIAL_NAV_ID = "nav_tutorials";
	private static final String REFERENCES_NAV_ID = "nav_references";
	private static final String EXERCISES_NAV_ID = "nav_exercises";
	
	
	//Tutorials menu
	
	@Override
	public WebElement getTutorialsCaretButton(){
		return getHeaderCaretButton(HeaderEnum.TUTORIALS_MENU_BUTTON.toString());
	}
	
	public WebElement getTutorialsMenuContainer(){
		return getMenuContainer(TUTORIAL_NAV_ID, HeaderEnum.TUTORIALS_MENU_BUTTON.toString());
	}
	
	public WebElement getTutorialsMenuHeader(){
		return getHeaderInMenuContainer(TUTORIAL_NAV_ID, HeaderEnum.TUTORIALS_MENU_BUTTON.toString());
	}
	
	public WebElement getTutorialsMenuCategoryName(String categoryName){
		return getCategoryName(TUTORIAL_NAV_ID, categoryName);
	}
 
	public WebElement getTutorialsCloseButton(){
		return getHeaderMenuCloseButton(TUTORIAL_NAV_ID, HeaderEnum.TUTORIALS_MENU_BUTTON.toString());
	}
	
	public void clickTutorialsCloseButton(){
		control.clickButton(getTutorialsCloseButton());
	}
	
	//References menu
	
	@Override
	public WebElement getReferencesCaretButton(){
		return getHeaderCaretButton(HeaderEnum.REFERENCE_MENU_BUTTON.toString());
	}
	
	public WebElement getReferencesMenuContainer(){
		return getMenuContainer(REFERENCES_NAV_ID, HeaderEnum.REFERENCE_MENU_BUTTON.toString());
	}
	
	public WebElement getReferencesMenuHeader(){
		return getHeaderInMenuContainer(REFERENCES_NAV_ID, HeaderEnum.REFERENCE_MENU_BUTTON.toString());
	}
	
	public WebElement getReferencesMenuCategoryName(String categoryName){
		return getCategoryName(REFERENCES_NAV_ID, categoryName);
	}
	
	public WebElement getReferencesCloseButton(){
		return getHeaderMenuCloseButton(REFERENCES_NAV_ID, HeaderEnum.REFERENCE_MENU_BUTTON.toString());
	}
	
	public void clickReferencesCloseButton(){
		control.clickButton(getReferencesCloseButton());
	}
	
	//Exercises menu
	
	@Override
	public WebElement getExercisesCaretButton(){
		return getHeaderCaretButton(HeaderEnum.EXERCISES_MENU_BUTTON.toString());
	}
	
	public WebElement getExercisesMenuButton(){
		return getMenuContainer(EXERCISES_NAV_ID, HeaderEnum.EXERCISES_MENU_BUTTON.toString());
	}
	
	private String exerciseButtonLocator = "//*[@id='%s']/descendant::*[contains(@class, '%s') and text()='%s']";
	
	public WebElement getExercisesYellowButtons(String buttonName){
		
		return getElementByXpath(String.format(exerciseButtonLocator, EXERCISES_NAV_ID, "yellow", buttonName), buttonName);
	}
	
	public WebElement getExerciseMenuButton(String buttonName){
		
		return getElementByXpath(String.format(exerciseButtonLocator, EXERCISES_NAV_ID, "button", buttonName), buttonName);
		
	}
	
	public WebElement getExercisesMenuHeader(){
		return getHeaderInMenuContainer(EXERCISES_NAV_ID, HeaderEnum.EXERCISES_MENU_BUTTON.toString());
	}
	
	public WebElement getExercisesCloseButton(){
		return getHeaderMenuCloseButton(EXERCISES_NAV_ID, HeaderEnum.EXERCISES_MENU_BUTTON.toString());
	}
	
	public void clickExercisesCloseButton(){
		control.clickButton(getExercisesCloseButton());
	}
	
}
