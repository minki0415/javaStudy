/* oracle 접속 db연동 코드를 mysql db 접속 코드로 변환 
 * 
 *  1. driver를 build path에 추가하는 것은 강사와 함께 진행
 *  2. 로딩 ~ select ~ 자원반환 코드 일부 수정
 *  3. database 이름은 play data
 *  4. insert.update.delete 추가 구현 방식 학습
 */

package step01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest2 {
	
	public static void main(String [] args) {
		insert();
	}
	
	//특정 데이터를 메소드 내부에서 구성해서 저장
	public static void insert() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://mydb1.clt2qr0rdgwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimeZone=UTC";
			Connection con = DriverManager.getConnection(url, "encore", "playdata");
			Statement stmt = con.createStatement();
			
			int rset = stmt.executeUpdate("insert into dept values(60, 'a', 'b')");
			
			System.out.println(rset+ " 행 저장 성공");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void select() {
		try{
			//driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("--"); // driver 로딩 확인용 코드
			
			// 접속
			String url = "jdbc:mysql://mydb1.clt2qr0rdgwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimeZone=UTC";
			//String url = "jdbc:mysql://엔드포인트url:3306/playdata?serverTimeZone=UTC";
			
			//oracle 접속 객체
			Connection con = DriverManager.getConnection(url, "encore", "playdata");
			
			//oracle과 소통하는 문장 실행 객체
			Statement stmt = con.createStatement();
			
			// sql 문장 실행
			ResultSet rset = stmt.executeQuery("select * from dept");
			
			//실행 결과 활용
			while(rset.next()) {
				System.out.println(rset.getInt("deptno") +"\t" + rset.getString("dname")+ "\t" + rset.getString("loc"));
			}
			//자원 반환 - ResultSet -> Statement -> Connection 순으로 자원 반환
			rset.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
