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
		return getButtonElementByXpath("(//*[@title='Get Your Own Website With W3schools Spaces'])[2]", WhereToStartMainEnum.FOOTER_SPACES_BUTTON);
	}
	
	public WebElement getFooterShopButton(){
		return getButtonElementByXpath("//footer/descendant::*[text()='W3SCHOOLS SHOP']", WhereToStartMainEnum.FOOTER_W3SCHOOLS_SHOP_BUTTON);
	}
}