/* �н�����
 * class ���ο� �����ؾ߸� �ϴ� ��ҵ�
 * 
 * 1. ���� ���� �� ȣ��
 *  - ������
 *  - Ÿ�� ������;
 *  - Ÿ�� ������ = ��;
 *  
 * 2. ������ ���� �� ȣ��
 *  - Ŭ������� ����, (){}
 *  - �뵵 : ��ü ����
 *  	- new ��� ��ü ���� Ű���� 
 *  	- ��ü���� ����
 *  		new ������([��]);
 *  	- Ŭ������ ������ �޼ҵ� ȣ���� ù �ܰ�� ��ü ���� �� ���� ������ �޼ҵ� ȣ��
 *  
 * 3. �޼ҵ� ���� �� ȣ��
 *  - ��ü �����ÿ� ȣ��Ǵ� �����ڿ� �ٸ�
 *  - ��ȯ Ÿ�� �޼ҵ��( [arguments] ){ [logic] }
 *  
 *  ========
 *  ����ϴ� �� �⸣�� ����
 *  1. name�� age ���� �� �����Ͱ� ���� ����, ��밡���ϰ� �ý��ۿ� �޸𸮸� �����ϴ� ����?
 *  	 = ��ü ���� ����
 */


package step01.basic;

public class L03Review {
	String name;
	int age;
	
	L03Review(){} // �̱����� ������ ������ �ڵ� �߰� 
	
	// ������ �̸� ��ȯ�ϴ� getName()
	String getName() {
		return "������";
	}
	
	public static void main(String[] args) {
		L03Review l = new L03Review(); // ��ü����, �޸� ����
		System.out.println(l.name); // ��� �� -> null
		l.name = "���缮";
		System.out.println(l.name); // ��� �� -> ���缮
		
		String n = l.getName();
		System.out.println(n);
	}

}
