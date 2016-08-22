package first;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;

public class MainClass {

	// Slf4j Logger.
	private static final org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(MainClass.class);

	public static void main(String[] args) {

		// Log4j Properties Configure.
		PropertyConfigurator.configure("log4j.properties");
		
		ThirdClass thirdClass = new ThirdClass();
		// Call Method Of Third Class.
		try {
			thirdClass.callMethodOfSecondClass();
		} catch (CustomException e) {
			// Debug With Slf4j.
			slf4jLogger.debug("Arithmetic Exception ", e);
		}
	}

}
