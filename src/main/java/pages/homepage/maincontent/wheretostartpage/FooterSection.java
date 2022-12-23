package pages.homepage.maincontent.wheretostartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.homepage.HomePageFooter;

public class FooterSection extends HomePageFooter{

	public FooterSection(WebDriver driver) {
		super(driver);
	}

	public WebElement getFooterHomeButton(){
		return getElementByXpath("//footer/*[@title='Home']", "Home button");
	}

	@Override
	public WebElement getSpacesButton(){
		return getButtonElement("Get Your Own Website With W3schools Spaces", "Spaces");
	}
	
	public WebElement getFooterShopButton(){
		return getElementByXpath("//footer/descendant::*[text()='W3SCHOOLS SHOP']", "W3Schools Shop button");
	}
}