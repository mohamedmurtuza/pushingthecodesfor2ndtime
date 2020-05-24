package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J {

	private static Logger log = LogManager.getLogger(Log4J.class.getName());

	public static void main(String[] args) {

		log.info("Hello");
		log.error("I am in error");

	}

}
