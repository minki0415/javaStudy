package step02.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class People {
	private String name;
	private int age;
	
	
	public static void main(String [] args) {
		
		//�ټ��� ���� �߿� name ���� ���� �ʱ�ȭ �ϸ鼭 ��ü �����ϴ� ����
		/* 
		 * People.builder() : PeopleBuilder ��ü ��ȯ
		 * PeopleBuilder
		 * 		- People ��ü �������ִ� ��ü
		 * 		- ���� ���õ� �޼ҵ带 �ڵ� �����ؼ� ����
		 * 		- �����ؼ� ������ �ʱ�ȭ(�� ����) ������ ��� 
		 * 
		 * 
		 * name("���缮") : name ������ ���������� �� ����+�Ǵ� �޼ҵ�
		 * build() : ���� �ش� ��ü �������ִ� �޼ҵ� 
		 */
		People p = People.builder().name("���缮").build();
		System.out.println(p.name + " " + p.age);
		System.out.println(p); //p.toString()
	
		
		//�⺻������ Ȱ�� ������ ���� 
//		People p = new People();
//		p.setName("���缮");
//		p.setAge(45);
//		
//		//parameter�� �ִ� ������ ȣ���ؼ� ���缮, 45��� ������ ����
//		//�������� �� ��½ÿ� toString() �ڵ�ȣ�� �� toString() ��ȯ ���� ���
//		People p2 = new People("���缮", 45);
//		System.out.println(p2); // ��� �� -> step01.People@123a439b
//		System.out.println(p2.toString()); // ��� �� -> step01.People@123a439b
//		System.out.println(p2);

		
	}
	
}
