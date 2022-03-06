package step02;

class Parent extends Object {
	
	String name;
	int age;  
	
	Parent(){
		super();
	}
	
	
	void printAll() {
		System.out.println(name);  
		System.out.println(age);
	}
}

public class Child extends Parent{
	String job;
	
	public Child() {
		super();
	}
	
	void printAll() {
		super.printAll();
//		System.out.println(job.toString());
		System.out.println(job);
	}

	public static void main(String[] args) {
		/* ��ü ���� �� �������� � Ŭ�������� ������? Parent Ŭ���� ����
		 * p.��������� �޼ҵ� ���� ���� �� ? �ڽ� Ŭ���� ���� ����
		 * �� printAll() ���� ��������ε� �����ǵ� �ڽ� �޼ҵ� ȣ��
		 * 
		 * ��� : �������� �θ� Ŭ������ ���� ������ ������, ��������� �ڽ� Ŭ���� ���� ����
		 */
		Parent p = new Child(); // ������ ��� ���� ���� ������ ����
		
		p.name = "�̻�";
		p.age = 90;
//		p.printAll(); //�����ǵ� �ڽ� �޼ҵ� ȣ��
		
		//�ڽĸ��� ��� ������ �θ�Ÿ�� ������ ȣ�� �õ�
		//p.job = "IT"; -> ���� �߻�
		
		//�ذ�å : ����ȯ ���� - �θ�Ÿ���� �ڽ�Ÿ������ ��ȯ
		//����ȯ ���� : ����Ÿ�� ����Ÿ�Ժ��� = (����Ÿ��) ����Ÿ�Ժ���;
		
		/* p�� ������ Child ��ü�� ���� ��, �ּҰ�
		 * ���ο� c��� Child ������ p�� �����ϴ� ������ ��ü�� ����
		 * ��, ���ԵǴ� ������ Parent Ÿ���� ��Ӱ����� ����Ÿ������ ��ȯ�Ǿ� ����
		 * �ϳ��� ��ü�� p�� c�� ���� ����
		 * 
		 * ��� : ��ü�� new �ڵ� ���� �ڵ� �����Ǵ� Ÿ���� String/�迭
		 */
		
		Child c = (Child) p;
		
		c.job = "IT";
		c.printAll();
		
		System.out.println("------------");
		p.printAll();
	
		c.name = "�����";
		System.out.println(p.name);
		p.name = "�̿���";
		System.out.println(c.name);
		
		System.out.println("===============");
		System.out.println();
	}

}
