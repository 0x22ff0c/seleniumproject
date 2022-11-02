package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverManager {
	
	private WebDriver driver = null;
	private static final String FILE_SEPARATOR = System.getProperty("file.separator");
	private static final String PARENT_FILE_PATH = System.getProperty("user.dir") + FILE_SEPARATOR + "driver" + FILE_SEPARATOR;
	
	
	public WebdriverManager(String browserToUse) {
		driverManager(browserToUse);
	}
	
	private String setDriverPath(String driverToUse){
		
		return PARENT_FILE_PATH + FILE_SEPARATOR + driverToUse;
		
	}
	
	private WebDriver getChromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", setDriverPath("chromedriver"));
		
		driver = new ChromeDriver();

		return driver;
	}
	
	private WebDriver getFirefoxDriver(){
		
		System.setProperty("webdriver.gecko.driver", setDriverPath("geckodriver"));
		
		driver = new FirefoxDriver();
		
		return driver;
		
	}
	
	private void driverManager(String browserToUse){
		
		switch (browserToUse) {
		
		case "Chrome":
			getChromeDriver();
			break;
			
		case "Firefox":
			getFirefoxDriver();
			break;
			
		default:
			getChromeDriver();
			break;
			
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
	}

}
