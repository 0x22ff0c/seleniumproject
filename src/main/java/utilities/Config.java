package utilities;

import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    Properties properties = new Properties();

    private void loadPropertiesFile(){
        try(InputStream inputStream = new FileInputStream("./config.properties")){

            properties.load(inputStream);

        }catch (IOException exception){
            LogUtility.logError(ExceptionUtils.getStackTrace(exception));
        }
    }

    public String getBrowserValue(){
        loadPropertiesFile();
        return properties.getProperty("browser");
    }

    public String getWebsiteUrlValue(){
        loadPropertiesFile();
        return properties.getProperty("websiteurl");
    }
}
