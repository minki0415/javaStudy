package step01.nonbuilder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class People {
	private String name;
	private int age;
	
	//�⺻ ������ - argument�� ���� ������ �ǹ�
	//�����ڰ� ���� ��� �����Ϸ��� �������ִ� ������
	public People() {}
	
	//������ - ��ü ������ ����ڰ� �����ϰ��� �ϴ� ������ ��ü ����
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	} 
	
	//��ӽÿ� �߰� �н�
	/* java�� ��� Ŭ������ �ֻ��� root ���� -> java.lang.Object
	 * - ������ �޼ҵ�� ��� Ŭ������ ��ӹ޾� �����ϰ� �ִ� ��Ȳ
	 * - toString() �޼ҵ常 ���
	 * 		- Object�� toString() ��� : ������ ��ü��� @��ġ���� ���ڿ��� ��ȯ
	 * - �޼ҵ� ������(overriding, override) : �ڽ� Ŭ�������� �޼ҵ� ���(body)�� ���� 
	 * 
	 */
	
	//toString() �޼ҵ� ������ 
	public String toString() {
		return name +  "-" + age;
	}
	
	
	public static void main(String [] args) {
		//�⺻������ Ȱ�� ������ ���� 
		People p = new People();
		p.setName("���缮");
		p.setAge(45);
		
		//parameter�� �ִ� ������ ȣ���ؼ� ���缮, 45��� ������ ����
		//�������� �� ��½ÿ� toString() �ڵ�ȣ�� �� toString() ��ȯ ���� ���
		People p2 = new People("���缮", 45);
		System.out.println(p2); // ��� �� -> step01.People@123a439b
		System.out.println(p2.toString()); // ��� �� -> step01.People@123a439b
		System.out.println(p2);

		
	}
	
}
