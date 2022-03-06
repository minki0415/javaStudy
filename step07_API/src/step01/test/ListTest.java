/* list �ڷᱸ�� API
 * 1. �迭�� ���
 * 2. index�� ����
 * 3. �迭���� ������
 * 		- class�� ����� ����
 * 		- �����͵��� �޼ҵ�� Ȱ��
 * 		- �迭�� �� �� ������ ũ�Ⱑ ���� �Ұ�
 * 		- list�� �������� �޸� ũ�� ����
 * 4. Ư¡
 * 		- ��ü Ÿ�Ե鸸 ���尡��
 * 		- ���� 3�̶�� ���� ���� �����ϰ� ���� ��� �ذ�å
 * 		- �⺻������ ��üó�� ǥ�� �����ϰ� ���ִ� 8���� ����� Ŭ������ ����
 * 		- int : Integer(Ŭ����, ����Ÿ��) / byte : Byte(Ŭ����, ����Ÿ��) ��
 * 		-  wrapper class�� ����(8����)
 * 			- �⺻ Ÿ���� ��üó�� ��� �����ϰ� support���ִ� Ŭ����
 * 
 * 5. �ֿ� API
 * 		1) ����/Ȱ��(��ȯ)/����
 * 			- add(Object)/get(int)/remove(int)
 * 		2) ����� ������ ���� Ȯ��
 * 			- size()
 * 
 * 6. �ٸ� ���������� list
 * 		- �ӵ�
 * 			������ ������ �޸� ����, ������ ���� �� ������ ������ ������ re index
 * 			-> ����ӵ� ���鿡���� �迭���� �����.
 * 
 * 		- �ټ��� �����͵��� �ǽð� ���� �����ÿ��� �迭���� ����
 * 			-> �����ϴ� �����Ͱ� �迭 �߰��� ���ԵǾ� �ִٸ� ����õ
 * 			-> �����ϴ� �����͵��� ������ �κп� ����Ǿ� �ִٸ� ����
 */

package step01.test;
import java.util .ArrayList;

import model.domain.CustomerDTO;

public class ListTest {
	
	//���� ���� - ��ü Ÿ���� ��� ������ ��δ� ����
	public static void m() {
		//������ ���� ������ �޸� ����
		ArrayList al = new ArrayList(); // 10���� �޸� ������ ������ ��ü ����
		
		//�����͸� 2�� ���� - Strign, Integer Ÿ���� ���� ������ ����, �� Object Ÿ��
		//public boolean add(Object o){parameter�� ���Ե� �����͸� Array List�� ����)
		al.add("���ڿ�"); // 0��°�� ����
		al.add(new Integer(3)); //al.add(3); -> ������ �� al.add(new Integer(3) ���� �ڵ� ����
		al.add("���ڿ�2");
		al.add(new Integer(3));
		
		//����� ������ ���� Ȯ�� - �޸� ���� Ȯ�� �ƴ� 
		System.out.println(al.size());
		
		//��� ������ �ܼ� ���
		System.out.println(al);
		
		//index 2������ ���ڿ�2 ������ size ȣ��()
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		
	}
	
	//����(add) Ȱ��(get)
	/* public boolean add(Object o){}
	 * public Object remove(int index){}
	 * public ? get(?){�ش� index�� ����Ǿ� �ִ� ������ ��ȯ}
	 * -> public Object get(int index){}
	 */
	public static void m2() {
		ArrayList al = new ArrayList(); //ArrayList() -> �޸� ���� default ���� 10��
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		System.out.println(al.get(2));
		al.remove(2); //�ش� index �����ϸ餵�� �ڿ� ����Ǿ� �ִ� �����͵� index ������
		System.out.println(al.get(2));
	}
	
	public static void m3() {
		//�ʱ� �����Ǵ� �޸� ���� + ����ġ �޸� ����
		ArrayList al = new ArrayList(5); //5���� �޸� ���� �ǹ� / () 10���� �޸� ���� �ǹ� / ���� �޸� 
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		System.out.println(al.size());  //5  
		
		//5�� �̻��� �޸𸮸� �ʿ�� �� ��� 6��° ������ ����� �޸𸮸� '5����' ����
		al.add("6");
		System.out.println(al.size());  //6
		al.add("7");
		al.add("8");
		System.out.println(al.size());  //8
	}
	
	
	//Ÿ���� ������ �� �ִ� jdk1.5���� ���õ� ���׸� ����
	//���� ���߽ÿ��� �ڷᱸ�� API�� ������ �����ÿ� ��κ� ������ ������ ���� 
	//Ÿ�� ���� ����� ���׸� ������ ����
	//-> Ÿ���� ��Ȯ������, ����ȯ ���� API�� ��� ���� 
	public static void m4() {
		//String�� ���� ������ ���� �迭 ���� ����
		//String[] Ÿ������ ���� ��, �޸� ũ������ ����
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		String s = al.get(0);
		System.out.println(s.charAt(0));
	}
	
	//���� ��� ������ ������ ȭ�鿡 ����ϱ� ����
	//DB�� ���� select -> CustomerDTO ��ü ���� -> ArrayList�� ���� -> ��ȯ
	public static ArrayList<CustomerDTO> getCustomers(){
		
		ArrayList<CustomerDTO> all = new ArrayList<CustomerDTO>();
		
		all.add(new CustomerDTO("u1", 11)); //0��° ����
		all.add(new CustomerDTO("u2", 22)); //1��° ����
		
		return all;
	}
	
	public static ArrayList nonGetCustomers(){
		
		ArrayList all = new ArrayList();//10�� �޸� ����
		
		all.add(new CustomerDTO("u1", 11));  //0��° ����
		all.add(new CustomerDTO("u2", 22));  //1��° ����
		
		return all;
	}

	
	public static void main(String[] args) {
		
		System.out.println("*** non-���׸� ***");
		ArrayList a = nonGetCustomers();
		/* a.get(1)
		 * 	a - ArrayList
		 * 	a.get(1) - Object
		 *  a.get(1).getId() - ���� �� Object Ŭ�������� getId() �޼ҵ� �� ���� ����
		 *  �ذ�å 
		 */
		
		System.out.println( ( (CustomerDTO)a.get(1) )  .getId() ); //u2
		
		
		System.out.println("*** ���׸� ��� ***");
		ArrayList<CustomerDTO> all = getCustomers();
		//? u2�� ������ּ���
		/* all.get(1)
		 * 	all.get(1)
		 * 		all - ArrayList>CustomerDTO>
		 * 		all.get(1) - CustomerDTO(id�� pw �ΰ��� �����͸� �����ϰ� �ִ� ��ü)
		 * 		all.get(1).getId() - String
		 *  
		 */
		
		System.out.println(all.get(1).getId());
		
		//m4();
	
	}

}
