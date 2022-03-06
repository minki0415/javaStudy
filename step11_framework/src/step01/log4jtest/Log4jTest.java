package step01.log4jtest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//Logger 객체가 singleton으로 개발되어 있음
	//Log4jTest 실행시 기록 등록
	static Logger logger = Logger.getLogger("step01.log4jtest.Log4jTest");
	
	public static void login(String id) {
		if(id.equals("playdata")) {
			logger.trace("trace");
			logger.debug("debug");
			logger.info("info");
			logger.warn("warn");
			logger.error("error");
		}else {
			System.out.println("id 무효 ----------------------------------");
		}
	}
	
	public static void logout(String id) {
		//..언제, 시간체크로직 등도 구현
		
	}

	public static void main(String[] args) {
		login("playdata");

	}

}
