package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtility {

	private LogUtility(){
		throw new IllegalStateException("Utility class");
	}
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	public static void logInfo(String message){
		LOGGER.info(message);
	}
	
}
