package step01;

public class Parent extends Object{
	String name;  //����Ÿ��
	int age;  //�⺻Ÿ��
	
	public Parent(){
		super(); //Object ��ü���� �Ϸ�
		System.out.println("�θ�");
	}
	
	void printAll() {
		System.out.println(name);  //name.toString()
		System.out.println(age);
	}

}
