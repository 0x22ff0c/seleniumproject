package utilities.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.Listener;
import utilities.LogUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private ExtentManager(){}

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

    private static String generateReportFileName(){
        Listener listener = new Listener();
        return String.format("testreport_%s.html", listener.getGeneratedDate());
    }

    private static String setReportDestinationFolder(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }

    private static String setReportsFolderName(){
        Listener listener = new Listener();
        return String.format("reports_%s", listener.getGeneratedTime());
    }

    private static String setReportFilePath(){

        final String userDirectory = System.getProperty("user.dir");

        return String.format("%s/logs/%s/%s/%s", userDirectory, setReportDestinationFolder(), setReportsFolderName(),generateReportFileName());
    }

    private static void setSystemInformation(){
        extentReports.setSystemInfo("OS", getOperatingSystem());
        extentReports.setSystemInfo("Browser name", getBrowserName());
        extentReports.setSystemInfo("Browser version", getBrowserVersion());
    }

    public static synchronized ExtentReports generateReportFile(){
        ExtentSparkReporter reporter = new ExtentSparkReporter(setReportFilePath());

        extentReports.attachReporter(reporter);

        setSystemInformation();

        return extentReports;
    }

    public static void generateReport(){
        LogUtility.logInfo("Generating report file...");

        extentReports.flush();

        LogUtility.logInfo("Generated report file.");
    }
}