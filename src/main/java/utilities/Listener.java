package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import utilities.reports.ExtentManager;
import utilities.reports.ExtentTestManager;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Listener implements ITestListener {
	
	WebdriverManager driverManager = null;
	static WebDriver driver = null;
	String testName;
	String message;

	public static WebDriver getDriver(){
		return driver;
	}

	static String generatedDate = "";

	static String generatedTime = "";

	Date currentDate = new Date();

	private void generateDate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh-mm-ss-aa");
		generatedDate = dateFormat.format(currentDate);
	}

	private void generateTime(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh-mm-aa");
		generatedTime = dateFormat.format(currentDate);
	}

	public String getGeneratedDate(){
		return generatedDate;
	}

	public String getGeneratedTime(){
		return generatedTime;
	}

	@Override
	public void onFinish(ITestContext contextFinish) {
		driverManager.quitSession();
		
		LogUtility.logInfo("End of testing session.");

		ExtentManager.generateReport();
	}
	
	@Override
	public void onStart(ITestContext contextStart) {

		generateDate();

		generateTime();

		driverManager = new WebdriverManager();

		Config config = new Config();

		driverManager.driverManager(config.getBrowserValue());

		driverManager.navigateToWebsite(config.getWebsiteUrlValue());

		driver = driverManager.getDriver();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		LogUtility.logInfo(String.format("TEST RESULT %s: PASSED %n", testName));

	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		LogUtility.logError(String.format("TEST RESULT %s: FAILED %n", testName));
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		Method method = result.getMethod().getConstructorOrMethod().getMethod();
		Test test = method.getAnnotation(Test.class);
		testName = test.testName().toUpperCase();
		
		message = String.format("STARTING TEST: %s", testName);
		
		LogUtility.logInfo(message);
		ExtentTestManager.startTest(test.testName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		LogUtility.logInfo("Method skipped"+ result.getName());
	}
}