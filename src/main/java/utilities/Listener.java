package utilities;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listener implements ITestListener {
	
	WebdriverManager driverManager = null;
	static WebDriver driver = null;
	String testName;
	String message;
	
	public static WebDriver getDriver(){
		
		return driver;
	
	}

	@Override
	public void onFinish(ITestContext contextFinish) {
		
		driverManager.quitSession();
		
		LogUtility.logInfo("End of testing session.");
		
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

		LogUtility.logInfo("Test method passed: "+ testName);
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {

		LogUtility.logError("Test method failed: "+ testName);
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {

		Method method = result.getMethod().getConstructorOrMethod().getMethod();
		Test test = method.getAnnotation(Test.class);
		testName = test.testName();
		
		message = String.format("==================== [Starting test: %s] ====================%n", testName);
		
		LogUtility.logInfo(message);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		LogUtility.logInfo("Method skipped"+ result.getName());
	
	}

}