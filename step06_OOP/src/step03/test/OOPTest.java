/* 1. Object�� ��� Ŭ������ ����Ÿ��
 * 2. ��� ��ü Ÿ�� �� ����
 * 3. ������ �������� ������ ��ü������ ���� Ÿ���� ������ ���� ����
 * 		= ����ȯ 
 * 4. Object ���� = "test"; OK
 * 
 * 
 */


package step03.test;

public class OOPTest {
	//Object ���� = "string";
	static Object m1() { //Object Ÿ������ ����ȯ ��, ������ ����, ����Ÿ������ ��ȯ�Ǽ� ��ȯ
		return "string";
	}
	
	//���ڿ� �ΰ�, People ��ü �� �پ��� Ÿ���� ��ü���� �ϳ��� �������� ���� 
	//�̻����� ������ Ÿ�� ���� : �迭
	//������� - String�� People���� �� �ٸ� ���� Ÿ��
	//���� �������� ��ü�� ���� Ÿ���� ���� �� �����ϱ� ���ؼ��� �迭 Ÿ���� ���� Ÿ��? Object[]
	/* public int intValue(){ 
	 * 		Integer��� ��ü�� ������ ���� int �⺻ Ÿ������ ��ȯ�ؼ� ��ȯ�ϴ� �޼ҵ�
	 * }
	 * 
	 * main�޼ҵ忡�� m2() ȣ��
	 * ù��° ��� : playdata���� p�� ���
	 * �ι�° ��� : intValue() ȣ�� �� ���
	 * 
	 */
	static Object[] m2() {
		Object[] o = {"string", "playdata", new Integer(3)};
		return o;
	}
	
	
	public static void main(String[] args) {
		System.out.println("----step02----");
		
		//ù��° ��� : playdata�� p�� ���
		Object[] v = m2();  //m2() ��ȯ Ÿ�� Object[]
		String v1 = (String) v[1]; // v[1] :��Object Ÿ�� , v1 : String Ÿ��
		System.out.println(v1.charAt(0));
		
		//�ι�° ��� : intValue() ȣ�� �� ���
		Integer v2 = (Integer) v[2];
		System.out.println(v2.intValue());
		
		
		System.out.println("----step01----");
		
		String s = (String) m1();  //? �� s�� �ݵ�� String Ÿ���̾�� ��
		//Object Ÿ���� �������� String �ڽĸ��� ��� ȣ�� �Ұ�
		//String���� �� ��ȯ �� String���� ��� ȣ��
		System.out.println(s.charAt(1)); //t�� ����ϱ�->charAt()���, charAt()�� String Ŭ������ ����
		
		//o ������ ��ӽ�Ų ����鿡�� access ������ ����
		//String���� ��� ȣ�� �Ұ�
		//Object o = m1();
		//System.out.println(o.charAt(1)); // charAt ��� �Ұ��� 
	}
}
