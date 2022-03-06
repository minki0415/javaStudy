package step01.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.junit.Test;

import model.domain.DeptDTO;
import util.DBUtil;

public class JDBCTest3 {
	
//	public void insertDept(DeptDTO dto){}
	public void insertDept(int deptno, String dname, String loc) {
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			
			int result = stmt.executeUpdate("insert into dept values(" + deptno + ", '" + dname + "','" + loc +"')");
			System.out.println(result +"행 입력");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, stmt);
		}
	}
	
	/* step2
	 * 	- insert/update/delete 시에 데이터 표현에 따른 번잡스러운 코드방식과 실행속도 향상을 위한 개발 방식
	 * 	참고 
	 * 		Statement로 SQL문장 실행 시
	 * 			실행시 마다 db가 sql문장 분석 및 검증 후 db에 맞게 변환해서 실행
	 * 		PreparedStatement로 sql 문장 실행시
	 * 			첫 실행시 db가 sql 문장 분석 및 검증 후 db에 맞게 변환해서 보관 및 실행
	 * 			두번째 실행부터는 이미 존재하는 변환된 자원으로 실행 
	 * 
	 * 	- 개발 방법
	 * 		Statement 상속받는 PreparedStatement API 사용
	 * 			객체 생성 시점에 고정 sql 문장으로 생성
	 * 		 	executeUpdate()전에 값만 대입
	 * 
	 */
	public void insertDept2(int deptno, String dname, String loc) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			
			//값만 제외된 고정 sql 문장으로 객체 생성
			pstmt = con.prepareStatement("insert into dept values(? ,? ,?)");
			
			//sql에 값 대입
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			//값이 있는 insert sql 문장 실행
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"행 입력");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, pstmt);
		}
	}
	
	/* step 3
	 * 1. DTO 타입을 parameter로 적용
	 */
	public void insertDept3(DeptDTO dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			
			//값만 제외된 고정 sql 문장으로 객체 생성
			pstmt = con.prepareStatement("insert into dept values(? ,? ,?)");
			
			//sql에 값 대입
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			//값이 있는 insert sql 문장 실행
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"행 입력");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, pstmt);
		}
	}
	
	public void insertDept4(DeptDTO dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			
			//값만 제외된 고정 sql 문장으로 객체 생성
			pstmt = con.prepareStatement("insert into dept values(? ,? ,?)");
			
			//sql에 값 대입
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			//값이 있는 insert sql 문장 실행
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"행 입력");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, pstmt);
		}
	}
	
	@Test
	public void insertTest() {
//		insertDept1(60,"인사과", "강남");
//		insertDept2(63,"영업과", "동작");
//		insertDept3(new DeptDTO(65,"인사과","서초"));
		insertDept4(new DeptDTO(67,"인사과","서초"));
		
	}

}
