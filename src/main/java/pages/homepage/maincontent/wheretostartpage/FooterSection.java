package pages.homepage.maincontent.wheretostartpage;

import enums.wheretostartpage.WhereToStartMainEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.homepage.HomePageFooter;

public class FooterSection extends HomePageFooter{

	public FooterSection(WebDriver driver) {
		super(driver);
	}

	public WebElement getFooterHomeButton(){
		return getButtonElementByXpath("//footer/*[@title='Home']", WhereToStartMainEnum.FOOTER_HOME_BUTTON);
	}

	@Override
	public WebElement getSpacesButton(){
		return getButtonElement("Get Your Own Website With W3schools Spaces", "Spaces");
	}
	
	public WebElement getFooterShopButton(){
		return getButtonElementByXpath("//footer/descendant::*[text()='W3SCHOOLS SHOP']", "W3Schools Shop");
	}
}