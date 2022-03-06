// 모든 DAO가 공통적으로 사용하는 코드들로만 구성된 최적의 구조
/*  Properties 객체 선언 위치?
 * 	멤버변수 선언!
 * 	이 객체의 용도
 * 		- properties의 정보를 보유
 * 		- static{} : driver 정보 활용
 * 		- getConnection() : url/id/pw 정보 활용
 * 
 */
package util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	static Properties dbInfo = new Properties();
	
	/* static{} - 단 한번 실행 100% 보장
	 * - 이름이 없기 때문에 호출 불가
	 * - 누구나 공유하는 자원을 한번만 초기화 하고자 하는 로직으로 개발
	 */
	static {
		try {
//			1단계
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2단계
			dbInfo.load(new FileReader("src/dbinfo.properties"));
			Class.forName(dbInfo.getProperty("jdbc.driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//절대 공유해서는 안되는 객체, 요청시 마다 새로 생성해서 제공
	//접속 성공 시 Connection 객체 반환/접속 실패 시  예외 발생
	/* 예외 처리는 문제가 생기면 반드시 호출한 곳에서도 상황 파악 필수
	 * try~catch로 에외처리보다 throws로 상황에 대한 알림으로 사용
	 * 
	 * 메소드 body{}
	 * 1. throw new Exception 생성 시 사용
	 * 2. 예외처리 없이 발생되는 예외를 호출한 곳으로 던지고자 할 경우 catch 블록 내부에 
	 * 		throw 예외변수 ; 로 처리하기도 함
	 */
	public static Connection getConnection() throws SQLException {
//		String url = "jdbc:mysql://mydb1.clt2qr0rdgwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimeZone=UTC";
		
		//다른 user 들과 공유 불가
//		return DriverManager.getConnection(url, "encore", "playdata");
		return DriverManager.getConnection(dbInfo.getProperty("jdbc.url"),dbInfo.getProperty("jdbc.id"), dbInfo.getProperty("jdbc.pw"));
	}
	
	
	//모든 DAO 클래스들의 모든 메소드가 반드시 실행해야하는 자원반환 로직 메소드 
	//select : ResultSet -> Statement -> Connection 순
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try {
			if(rset != null) {
				rset.close();
				rset = null;
			}
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if(con != null) {
				con.close();
				con = null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//insert/update/delete : Statement -> Connection 순
	public static void close(Connection con, Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if(con != null) {
				con.close();
				con = null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
