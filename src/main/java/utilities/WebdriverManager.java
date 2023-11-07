package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebdriverManager {
	
	private WebDriver driver = null;
	private final Config config = new Config();

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

	private WebDriver getChromeDriverInstance(){

		driver = null;

		String executionMode = config.getTestExecutionMode();

		if(executionMode.equals("headless")){

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920, 1080");
			driver = new ChromeDriver(options);

		}else if(executionMode.equals("window")){

			driver = new ChromeDriver();
			manageWindow();

		}

		return driver;
	}

	private void getChromeDriver(){

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

		driver = getChromeDriverInstance();
	}

	private WebDriver getFirefoxDriverInstance() {
		driver = null;

		String executionMode = config.getTestExecutionMode();

		if(executionMode.equals("headless")) {

			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--width=1920");
			options.addArguments("--height=1080");
			driver = new FirefoxDriver(options);

		}else if(executionMode.equals("window")){

			driver = new FirefoxDriver();
			manageWindow();

		}

		return driver;
	}

	private void getFirefoxDriver(){

		driver = getFirefoxDriverInstance();
	}
	
	private void manageWindow(){
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(config.getLoadTimeOutInSecondsValue()));
	}
	
	public void driverManager(String browserToUse){

		if(browserToUse.equals("Chrome")){
			getChromeDriver();
		}

		if(browserToUse.equals("Firefox")) {
			getFirefoxDriver();
		}
	}
}