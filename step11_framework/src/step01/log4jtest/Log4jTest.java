package step01.log4jtest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//Logger ��ü�� singleton���� ���ߵǾ� ����
	//Log4jTest ����� ��� ���
	static Logger logger = Logger.getLogger("step01.log4jtest.Log4jTest");
	
	public static void login(String id) {
		if(id.equals("playdata")) {
			logger.trace("trace");
			logger.debug("debug");
			logger.info("info");
			logger.warn("warn");
			logger.error("error");
		}else {
			System.out.println("id ��ȿ ----------------------------------");
		}
	}
	
	public static void logout(String id) {
		//..����, �ð�üũ���� � ����
		
	}

	public static void main(String[] args) {
		login("playdata");

	}

}
