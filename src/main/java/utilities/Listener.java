package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	WebdriverManager driverManager = null;
	static WebDriver driver = null;
	static SoftAssertion softAssertion = null;
	
	public static WebDriver getDriver(){
		
		return driver;
	
	}
	
	public static SoftAssertion getAssertion(){
		return softAssertion;
	}

	@Override
	public void onFinish(ITestContext contextFinish) {
		
		driverManager.quitSession();
		
		System.out.println("End of testing session.");
		
	}
	
	@Override
	public void onStart(ITestContext contextStart) {
		
		driverManager = new WebdriverManager();
		
		driverManager.driverManager("Chrome");
		
		driverManager.manageWindow();
		
		driverManager.navigateToWebsite("https://www.w3schools.com/");

		driver = driverManager.getDriver();
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 
		System.out.println("Test method passed: "+ result.getName());
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Test method failed: "+ result.getName());
		
	}
	

	
	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("\n====================================");
		System.out.println("Starting test: " + result.getName());
		
		softAssertion = new SoftAssertion();
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Method skipped"+ result.getName());
	
	}

}