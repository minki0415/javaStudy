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
			System.out.println(result +"�� �Է�");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, stmt);
		}
	}
	
	/* step2
	 * 	- insert/update/delete �ÿ� ������ ǥ���� ���� ���⽺���� �ڵ��İ� ����ӵ� ����� ���� ���� ���
	 * 	���� 
	 * 		Statement�� SQL���� ���� ��
	 * 			����� ���� db�� sql���� �м� �� ���� �� db�� �°� ��ȯ�ؼ� ����
	 * 		PreparedStatement�� sql ���� �����
	 * 			ù ����� db�� sql ���� �м� �� ���� �� db�� �°� ��ȯ�ؼ� ���� �� ����
	 * 			�ι�° ������ʹ� �̹� �����ϴ� ��ȯ�� �ڿ����� ���� 
	 * 
	 * 	- ���� ���
	 * 		Statement ��ӹ޴� PreparedStatement API ���
	 * 			��ü ���� ������ ���� sql �������� ����
	 * 		 	executeUpdate()���� ���� ����
	 * 
	 */
	public void insertDept2(int deptno, String dname, String loc) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			
			//���� ���ܵ� ���� sql �������� ��ü ����
			pstmt = con.prepareStatement("insert into dept values(? ,? ,?)");
			
			//sql�� �� ����
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			//���� �ִ� insert sql ���� ����
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"�� �Է�");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, pstmt);
		}
	}
	
	/* step 3
	 * 1. DTO Ÿ���� parameter�� ����
	 */
	public void insertDept3(DeptDTO dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			
			//���� ���ܵ� ���� sql �������� ��ü ����
			pstmt = con.prepareStatement("insert into dept values(? ,? ,?)");
			
			//sql�� �� ����
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			//���� �ִ� insert sql ���� ����
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"�� �Է�");
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
			
			//���� ���ܵ� ���� sql �������� ��ü ����
			pstmt = con.prepareStatement("insert into dept values(? ,? ,?)");
			
			//sql�� �� ����
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			//���� �ִ� insert sql ���� ����
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"�� �Է�");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, pstmt);
		}
	}
	
	@Test
	public void insertTest() {
//		insertDept1(60,"�λ��", "����");
//		insertDept2(63,"������", "����");
//		insertDept3(new DeptDTO(65,"�λ��","����"));
		insertDept4(new DeptDTO(67,"�λ��","����"));
		
	}

}
