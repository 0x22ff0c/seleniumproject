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
	String testName = "";
	
	public static WebDriver getDriver(){
		
		return driver;
	
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

		System.out.println("Test method passed: "+ testName);
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Test method failed: "+ testName);
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {

		Method method = result.getMethod().getConstructorOrMethod().getMethod();
		Test test = method.getAnnotation(Test.class);
		testName = test.testName();
		
		System.out.println(String.format("\n==================== [Starting test: %s] ====================\n", testName));
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Method skipped"+ result.getName());
	
	}

}