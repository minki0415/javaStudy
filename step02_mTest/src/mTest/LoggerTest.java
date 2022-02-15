package mTest;

import org.apache.log4j.Logger;

public class LoggerTest {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(LoggerTest.class);
		System.out.println(log);

	}

}
