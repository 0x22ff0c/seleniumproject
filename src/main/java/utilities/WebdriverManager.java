package utilities;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebdriverManager {
	
	private WebDriver driver = null;

	public void navigateToWebsite(String url){
		
		driver.get(url);
	
	}

	public WebDriver getDriver(){
		return driver;
	}
	
	public void quitSession(){

		LogUtility.logInfo("Terminating the driver...");
		
		driver.quit();

		LogUtility.logInfo("Terminated the driver.");
		
	}

	private void getChromeDriver(){
		
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1920, 1080");
		driver = new ChromeDriver(options);

	}

	private void getFirefoxDriver(){

		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		options.addArguments("--width=1920");
		options.addArguments("--height=1080");
		driver = new FirefoxDriver(options);
		
	}
	
	public void manageWindow(){
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
	}
	
	public void driverManager(String browserToUse){
		
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

	}

}
