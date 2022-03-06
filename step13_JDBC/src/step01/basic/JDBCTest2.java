/* oracle ���� db���� �ڵ带 mysql db ���� �ڵ�� ��ȯ 
 * 
 *  1. driver�� build path�� �߰��ϴ� ���� ����� �Բ� ����
 *  2. �ε� ~ select ~ �ڿ���ȯ �ڵ� �Ϻ� ����
 *  3. database �̸��� play data
 *  4. insert.update.delete �߰� ���� ��� �н�
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
	
	//Ư�� �����͸� �޼ҵ� ���ο��� �����ؼ� ����
	public static void insert() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://mydb1.clt2qr0rdgwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimeZone=UTC";
			Connection con = DriverManager.getConnection(url, "encore", "playdata");
			Statement stmt = con.createStatement();
			
			int rset = stmt.executeUpdate("insert into dept values(60, 'a', 'b')");
			
			System.out.println(rset+ " �� ���� ����");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void select() {
		try{
			//driver �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("--"); // driver �ε� Ȯ�ο� �ڵ�
			
			// ����
			String url = "jdbc:mysql://mydb1.clt2qr0rdgwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimeZone=UTC";
			//String url = "jdbc:mysql://��������Ʈurl:3306/playdata?serverTimeZone=UTC";
			
			//oracle ���� ��ü
			Connection con = DriverManager.getConnection(url, "encore", "playdata");
			
			//oracle�� �����ϴ� ���� ���� ��ü
			Statement stmt = con.createStatement();
			
			// sql ���� ����
			ResultSet rset = stmt.executeQuery("select * from dept");
			
			//���� ��� Ȱ��
			while(rset.next()) {
				System.out.println(rset.getInt("deptno") +"\t" + rset.getString("dname")+ "\t" + rset.getString("loc"));
			}
			//�ڿ� ��ȯ - ResultSet -> Statement -> Connection ������ �ڿ� ��ȯ
			rset.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
