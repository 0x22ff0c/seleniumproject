package utilities;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {
	
	private WebDriver driver = null;
	private static final String FILE_SEPARATOR = System.getProperty("file.separator");
	private static final String PARENT_FILE_PATH = System.getProperty("user.dir") + FILE_SEPARATOR + "driver" + FILE_SEPARATOR;

	public void navigateToWebsite(String url){
		
		driver.navigate().to(url);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public WebDriver getDriver(){
		return driver;
	}
	
	public void quitSession(){
		
		driver.quit();
		
		System.out.println("End of testing session.");
		
	}
	
	private static String setDriverPath(String driverToUse){
		
		return PARENT_FILE_PATH + FILE_SEPARATOR + driverToUse;
		
	}
	
	private void getChromeDriver(){
		
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", setDriverPath("chromedriver"));
		System.setProperty("webdriver.chrome.silentOutput", "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);

	}
	
	private void getFirefoxDriver(){
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
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
