package utilities;

import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public Config(){
        loadPropertiesFile();
    }

    Properties properties = new Properties();

    private void loadPropertiesFile(){
        try(InputStream inputStream = new FileInputStream("./config.properties")){

            properties.load(inputStream);

        }catch (IOException exception){
            LogUtility.logError(ExceptionUtils.getStackTrace(exception));
        }
    }

    public String getBrowserValue(){
        return properties.getProperty("browser");
    }

    public String getWebsiteUrlValue(){
        return properties.getProperty("websiteurl");
    }

    public String getTestExecutionMode(){
        return properties.getProperty("testexecutionmode");
    }

    public int getLoadTimeOutInSecondsValue(){
        return Integer.parseInt(properties.getProperty("loadtimeoutinseconds"));
    }

    public String getChromedriverPath(){
        return properties.getProperty("chromedriverpath");
    }
}
