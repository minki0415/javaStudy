/* �н�����
 * 
 * 1. �ߺ� �ڵ� �и�
 * 2. ������ ������ ��ȯ
 * 3. ������ �ڵ�� ���� - �����丵
 * 4. DAO Ŭ������ ����
 * 
 * DBUtil.java : ��� DAO���� �����ϴ� �������θ� ����
 * JDBCTest3 -> DeptDAO �� ����
 */

package step02.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

public class DeptDAO {
	
	public static void main(String [] args) {
//		insert();
		select();
	}
	
	/* ���� ������
	 * parameter �� insert �ϴ� �����ʹ� ���������� �Է¹޴� �������� ������,
	 * 
	 * ���� 1 - �÷� �� ��, insert�ϰ��� �ϴ� ������ �� ��ŭ parameter ����
	 * ���� 2 - DTO �������� parameter ���� (����)
	 * 	��, pk �ϳ� ������ �ϳ��� �÷� �� �����ÿ��� �ΰ��� parameter �� ������ �� ����
	 * 
	 * ������� 
	 * *** ���� ���� �Ǵ� ������ ���忡 ���� ��� ��Ȳ�� client�� �����ؾ� ��
	 * 	   deptno�� �ߺ��Ǿ��ٴ� �޽����� �翬�� client�� �˾ƾ� �� ��Ȳ
	 * 	   DB ���� ����, ���� ���� ���� �߻� �ÿ��� �ŷڸ� �����ϴ� ���� ������ ��õ� ���� 
	 *	   
	 *	   ��� : DAO�� CRUD �޼ҵ�� ���ܸ� throws�� ����
	 *			 controller���� ���� �߻� �� fail view ȭ������ ���� ���� ó��
	 *
	 * 1. ���� ����
	 * 	- ���ο� ������ ���� 
	 * 2. ������ ����
	 * 	- ���� �߻�
	 * 			DB���� ����, IDPW ����, PK �ߺ� ...
	 */
	//Ư�� �����͸� �޼ҵ� ���ο��� �����ؼ� ����
	public static void insert() throws Exception {
		//try ��� �������� ����� ������ try �ܺο����� ��� �Ұ��� 
		Connection con = null;
		Statement stmt = null;
		
		try{
			
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			
			int rset = stmt.executeUpdate("insert into dept values(60, 'a', 'b')");
			
			System.out.println(rset+ " �� ���� ����");
			
		} catch (Exception e) {
			e.printStackTrace(); //�� ���� Ȯ���� ���� �ڵ�
			throw e; //catch ��� ������ ����
		} finally {
			DBUtil.close(con, stmt);
		}
		
	}
	
	
	public static void select() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try{
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rset = stmt.executeQuery("select * from dept");
			
			while(rset.next()) {
				System.out.println(rset.getInt("deptno") +"\t" + rset.getString("dname")+ "\t" + rset.getString("loc"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, stmt, rset);
		}
		
	}

}
