package step01;

public class Child extends Parent{
	String job;
	
	public Child() {
		//Object ��ü -> Parent ��ü ���� �Ϸ�
		//name,age �޸� ���� 
		super(); //������ ù���ο� �ʼ��� �ڵ�, ���� �� �����Ϸ��� �ڵ� �߰�����
		System.out.println("�ڽ�");
	}//���� ����, job �޸� ���� 
	
	@Override
	void printAll() {
		super.printAll(); //�θ�(super) Ŭ������ �ش� �޼ҵ� ���� 100% �״�� �����ϴ� ���� ����
		System.out.println(job);
	}
	
	@Override //�������� �� ���� �ֳ����̼�
	public String toString() {
		return name + "-" + age + "-" + job;
	}
	
	public static void main(String[] args) {
		/* ������ ��ü
		 * Object -> Parent -> Child
		 * c��� ������ � Ÿ��? Child
		 */
		Child c = new Child();
		System.out.println(c); //step01.Child@7de26db8
		
		c.name = "���缮";
		c.age = 20;
		c.job = "���� ������� ������";
		
		System.out.println(c.name);
		System.out.println(c); // ���缮-20-���� ������� ������
	}

}
