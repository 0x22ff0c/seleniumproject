package utilities.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.Listener;
import utilities.LogUtility;

public class ExtentManager {

    private static String getOperatingSystem(){
        Capabilities capabilities = ((RemoteWebDriver) Listener.getDriver()).getCapabilities();
        return capabilities.getPlatformName().toString();
    }

    private static String getBrowserName(){
        Capabilities capabilities = ((RemoteWebDriver) Listener.getDriver()).getCapabilities();
        return capabilities.getBrowserName();
    }

    private static String getBrowserVersion(){
        Capabilities capabilities = ((RemoteWebDriver) Listener.getDriver()).getCapabilities();
        return capabilities.getBrowserVersion();
    }

    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports generateReportFile(){
        final String userDirectory = System.getProperty("user.dir");

        ExtentSparkReporter reporter = new ExtentSparkReporter(userDirectory + "/reports/report.html");
        reporter.config().setReportName("Sample report name");

        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("OS", getOperatingSystem());
        extentReports.setSystemInfo("Browser name", getBrowserName());
        extentReports.setSystemInfo("Browser version", getBrowserVersion());

        return extentReports;
    }

    public static void generateReport(){
        LogUtility.logInfo("Generating report file...");

        extentReports.flush();

        LogUtility.logInfo("Generated report file.");
    }
}