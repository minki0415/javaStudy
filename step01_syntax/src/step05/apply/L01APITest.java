/* �н�����
 * 
 * 1. API ����
 * 	- Application Programming Interface
 * 	- �̹� �����Ǿ� �־� ��밡���ϰ� �������ִ� �ڵ��
 * 		Ŭ����/����/������/�޼ҵ�
 * 	- library ��� ��
 * 
 * 2. tip ���� ǥ��
 * 	1) src - source
 *  2) lib - library
 *  3) bin - binary
 * 
 * 3. API Ȱ�� ����
 * 	1) ����/������/�޼ҵ� ȣ�� ����
 * 	2) ȣ�� ����
 * 		(1) ��ü ���� ���Ŀ� ȣ��
 * 			- instance ������ instance �޼ҵ�
 * 		(2) ��ü �������� ȣ��
 * 			- static ������ static �޼ҵ�
 * 
 *	3) �ܺ� package ��� ����
 *		- import package��.class��;
 *		- java.lang package�� �����ϰ� import ���� ����
 *		
 */
package step05.apply;

public class L01APITest {
	
	public static void main(String[] args) {
		// java.lang.Math Ŭ������ �޼ҵ� Ȱ��
		// -3 �� �ְ� ���밪(abs) ��ȯ int �ְ� int ��ȯ �޾� ���
		System.out.println(Math.abs(-3)); //��� �� -> 3
		
		//? �� ���ڿ����� �� �ϳ��� ���
		//��Ʈ - ���ڿ� �ϳ��ϳ��� ��ȣ �ο�, 0���� ��ȣ �ο�
		//'��' �� 0��° ����
		/* API ������ ����
		 * ���ڿ�(String ��ü) �����ʹ� �����ϴ� ����
		 * ���� �޾Ƽ�(argument) �ش� ���� ��ġ ���� ���� �ϳ�(char)�� ����
		 * -> ��ȯ
		 * 
		 * char?(int index){
		 * 		���ڿ� ��ü���� index ���� �ش� char ���� �� ��ȯ
		 * }
		 * 
		 * *����� �� ����� ����
		 * - ȣ�� �� class�����θ� ȣ�� ���� ��, index�� ������ ���� �� �ִ� �����Ͱ� ����
		 * - �������� ���� �߻�
		 * - �̷����� ������ �ȵȴ�. 
		 * 
		 *  static charAt(int index){
		 * 		���ڿ� ��ü���� index ���� �ش� char ���� �� ��ȯ
		 * }
		 * System.out.println(String.charAt(0));
		 * 
		 * ���� �ε��� �ϰ� static���� ������ �ϰ� �ʹٸ� �ذ�å?
		 *  static char charAt(String data, int index){
		 * 		parameter�� ���� ���ڿ� ��ü���� index ���� �ش� char ���� �� ��ȯ
		 * }
		 * System.out.println(String.charAt(0)); 
		 */
		String data = "����� �����ڻ� ��ġ �˻� ���";
		System.out.println(data.charAt(0)); // ��� �� -> ��
		
		/* java.lang.Integer ��� class�� �޼ҵ� ���
		 * "3" -> 3 ���� �����ؼ� ���
		 * static int parseInt(String v){}
		 */
		System.out.println(Integer.parseInt("3")); //��� �� -> 3
		
		/* int�� ��ȯ �Ұ� ����
		 * ���Ŀ� Exception ��, ó�� ������ ����� ���� ����� �н� �ʼ� 
		 */
		System.out.println(Integer.parseInt("��")); //int�� ��ȯ �Ұ� ����
		
	}

}
