package pages;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Control;
import utilities.LogUtility;

import java.time.Duration;

public class BasePage {

	protected WebDriver driver;
	WebElement element = null;
	private String nameOfElement = "";
	protected Control control;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		control = new Control(driver, this);
	}

	public String getElementName(){
		return nameOfElement;
	}
	
	public void switchToDefaultContent(){
		LogUtility.logInfo("Switching back to default content...");
		
		driver.switchTo().defaultContent();
		
		LogUtility.logInfo("Switched back to default content.");
	}
		
	protected void switchToIframe(WebElement element){
		LogUtility.logInfo(String.format("Switching to frame: %s...", nameOfElement));
		
		driver.switchTo().frame(element);
		
		LogUtility.logInfo(String.format("Switched to frame: %s.", nameOfElement));
	}
	
	protected WebElement getElementById(String id, String nameOfElement){
		return getElement(By.id(id), nameOfElement);
	}

	protected WebElement getElementById(String id, Object nameOfElement){
		return getElementById(id, nameOfElement.toString());
	}

	protected  WebElement getElementByClass(String className, Object nameOfElment){
		return getElement(By.className(className), nameOfElment);
	}

	protected  WebElement getElementByTagName(String tagName, Object nameOfElement){
		return getElement(By.tagName(tagName), nameOfElement);
	}

	protected WebElement getElementByXpath(String xpath, String nameOfElement){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		
		return getElement(By.xpath(xpath), nameOfElement);
	}

	protected  WebElement getElementByXpath(String xpath, Object nameOfElement){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

		return getElement(By.xpath(xpath), nameOfElement);
	}
	
	protected int getElementByXpathCount(String xpath, String nameOfElement){
		this.nameOfElement = nameOfElement;
		
		return driver.findElements(By.xpath(xpath)).size();
	}

	protected int getElementByXpathCount(String xpathExpression, Object nameOfElement){
		this.nameOfElement = nameOfElement.toString();

		return driver.findElements(By.xpath(xpathExpression)).size();
	}

	private WebElement getElement(By byElement){
		element = null; 
		
		try {
			element = driver.findElement(byElement);
		} catch (NoSuchElementException noSuchElementException) {
			LogUtility.logError(ExceptionUtils.getStackTrace(noSuchElementException));
		}
		
		return element;
	}
	
	private WebElement getElement(By byElement, String nameOfElement){
		this.nameOfElement = nameOfElement;

		element = null;
		
		try {
			element = driver.findElement(byElement);
		} catch (NoSuchElementException noSuchElementException){
			LogUtility.logError(ExceptionUtils.getStackTrace(noSuchElementException));
		}
	
		return element;
	}

	private WebElement getElement(By byElement, Object nameOfElement){
		return getElement(byElement, nameOfElement.toString());
	}

	//region get Link element
	private String setNameOfTheLink(String nameOfTheLinkElement){ return nameOfTheLinkElement + " link";}

	private String setNameOfTheLink(Object nameOfTheLinkElement){
		return nameOfTheLinkElement + " link";
	}

	protected WebElement getElementByLinkText(String linkText){
		return getElement(By.linkText(linkText), setNameOfTheLink(linkText));
	}

	protected  WebElement getElementByLinkText(Object linkText){
		return getElement(By.linkText(linkText.toString()), setNameOfTheLink(linkText));
	}

	protected WebElement getElementByLinkText(String linkText, String nameOfElement){
		return getElement(By.linkText(linkText), setNameOfTheLink(nameOfElement));
	}

	protected  WebElement getElementByLinkText(String linkText, Object nameOfElement){
		return getElement(By.linkText(linkText), nameOfElement);
	}

	protected WebElement getLinkElementByXpath(String xpathExpression, Object nameOfElement){
		return getElementByXpath(xpathExpression, setNameOfTheLink(nameOfElement));
	}
	//endregion

	//region get Button element
	private String setNameOfTheButton(String nameOfTheButtonElement){
		return nameOfTheButtonElement + " button";
	}

	private String setNameOfTheButton(Object nameOfTheButtonElement){
		return nameOfTheButtonElement.toString() + " button";
	}

	public WebElement getButtonElement(String titleOfTheButton){
		return getElementByXpath(String.format("//*[@title='%s']", titleOfTheButton), setNameOfTheButton(titleOfTheButton));
	}

	public WebElement getButtonElement(Object titleOfTheButton){
		return getElementByXpath(String.format("//*[@title='%s']", titleOfTheButton), setNameOfTheButton(titleOfTheButton));
	}

	public WebElement getButtonElement(String titleOfTheButton, String actualNameOfTheButton){
		element = getButtonElement(titleOfTheButton);
		this.nameOfElement = setNameOfTheButton(actualNameOfTheButton);
		return element;
	}

	public WebElement getButtonElement(String titleOfTheButton, Object actualNameOfTheButton){
		element = getButtonElement(titleOfTheButton);
		this.nameOfElement = setNameOfTheButton(actualNameOfTheButton);
		return element;
	}

	public WebElement getButtonElementById(String idOfElement, String nameOfTheButton){
		return getElementById(idOfElement, setNameOfTheButton(nameOfTheButton));
	}

	public WebElement getButtonElementById(String idOfElement, Object nameOfTheButton){
		return getElementById(idOfElement, setNameOfTheButton(nameOfTheButton));
	}

	public WebElement getButtonElementByXpath(String xpathExpression, String nameOfTheButton){
		return getElementByXpath(xpathExpression, setNameOfTheButton(nameOfTheButton));
	}

	public WebElement getButtonElementByXpath(String xpathExpression, Object nameOfTheButton){
		return getElementByXpath(xpathExpression, setNameOfTheButton(nameOfTheButton));
	}

	public int getButtonElementCountByXpath(String xpathExpression, String nameOfTheButton){
		return getElementByXpathCount(xpathExpression, setNameOfTheButton(nameOfTheButton));
	}

	public int getButtonElementCountByXpath(String xpathExpression, Object nameOfTheButton){
		return getButtonElementCountByXpath(xpathExpression, nameOfElement);
	}

	//endregion

	protected String getTextOfElementUsingXpathLocator(String xpathExpression){

		String contentValue = "";

		try {
			element = getElement(By.xpath(xpathExpression));

			contentValue = element.getText().replace("\n", " ");

			if(contentValue.isEmpty()){
				contentValue = element.getAttribute("value").replace("\n", " ");
			}

		}catch (NullPointerException nullPointerException){
			LogUtility.logError(ExceptionUtils.getStackTrace(nullPointerException));
			LogUtility.logError("Element is null therefore the text is empty.");

		}

		return contentValue;
	}

	protected String getPlaceholderTextOfField(WebElement element){
		String placeholderText = "";
		
		if(element != null){
			placeholderText = element.getAttribute("placeholder");
		}else {
			LogUtility.logWarn("Unable to locate the element. Inner text is empty.");
		}
		
		return placeholderText;
	}
}