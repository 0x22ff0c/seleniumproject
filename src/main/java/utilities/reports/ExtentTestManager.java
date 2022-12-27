package utilities.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {

    private ExtentTestManager(){}

    static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
    static ExtentReports extentReports = ExtentManager.generateReportFile();

    public static synchronized ExtentTest getTest(){
        return extentTestMap.get((int) Thread.currentThread().getId());
    }

    public static synchronized void startTest(String testName){
        ExtentTest test = extentReports.createTest(testName);
        extentTestMap.put((int) Thread.currentThread().getId(), test);
    }

}
