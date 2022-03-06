/* �����Ϳ�(domain)
 * - Data Transfer Object(DTO) / Value Object(VO)
 * - �⺻ ���� : �������/�⺻������/������/getter/setter/toString() ������
 * 		������ ���� �޼ҵ� : 
 * 			- ��ü�� ������ ��(������ ��� ��������� �� ��) ����� �޼ҵ�
 * 			- public boolean equals(Object o){}
 * 				: java.lang.Object�� �޼ҵ� ��� 
 * 					- ������ ��ü�� �ּ� �� ��
 * 					- == (����� ������)
 * 					  ����Ÿ�� �񱳽� : �����ڰ� ��ü�� �ּ� �� �� ������
 * 					  �⺻Ÿ�� �񱳽� : �� ��
 * 
 * - ������ rule 
 * 		��ȯŸ�� �޼ҵ��(argument) : 100% ����
 * 
 */

package step05.oop;

class Person{
	private String name;
	private int age;
	
	//�⺻������
	public Person() {}
	
	//�Ķ���Ͱ� �ִ� ������
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	//Person ��ü���� ���밪(�����Ͱ�) �� �޼ҵ�� ������
	/* Person Ÿ�� ���� Ȯ��
	 * person Ÿ���� �ƴϴ� : false
	 * 	person Ÿ���̴�
	 * 		name(String)�� age(int) �� ��
	 * 		-> name(String)�� age(int)�� ���� : true
	 * 		-> name�� ������ age�� �ٸ��� : false 
	 * 		-> name�� �ٸ��� age�� ���� : false
	 * 
	 * 		name�� String �� equals()
	 * 		age == ����� ������
	 * 
	 * && : ���ǽ� 1 && ���ǽ�2
	 * 	- �ΰ��� ���ǽ� ��� true�� ��쿡�� true
	 *  - ���ǽ�1 false�� ��� ���ǽ�2 ���� ����
	 *  - ���� ������
	 *  - and ������
	 */
	public boolean equals(Object o) {
		if(o instanceof Person) {
//			if(name.equals(((Person)o).name) && age == ((Person)o).age) {
			
			Person p = (Person) o;
			if(name.equals(p.name) && age == p.age) {
				return true;
			}
			
		}else {
			return false;			
		}
		
		return false;
	}
}
/* Object o = new A(); / =new B(); = new C(); 
 * 
 * A a = new A(); / = new B(); / = new C();
 * B b = new B();
 * C c = new C();
 * 
 * A a = new C(); //Object -> A -> C ��ü ������ ����
 * ����
 * 	a ���� Ÿ�� ? AŸ��
 * a ������ Ȱ�� ������ ��ü - C > A > Object
 * 
 */


class A{}
class B extends A{}
class C extends A{}


public class OverrideTest {
		
	public static void m1() {
		//String �� ��
		String s1 = "a";             // ��ü����
		String s2 = new String("a"); //���ο� ��ü ����
		String s3 = "a";             //�̹� new ���� ������ ���ڿ� ��ü�� ������ ������ ������ ������ ��� ����
		String s4 = new String("a"); //���ο� ��ü ����
		
		System.out.println(s1 == s2);  //�ּҰ� �� : false
		//String Ŭ������ �������� �޼ҵ� ȣ��, �� String Ÿ�Ե� ��ü���� ���밪 ��
		System.out.println(s1.equals(s2));  //��ü�� ������ ���밪 �� : true
		System.out.println(s1 == s3);  //�ּҰ� �� : true
		System.out.println(s1.equals(s4));  //��ü�� ������ ���밪 �� : true		
	}
	
	/* instanceof
	 * - ��ü Ÿ�Ժ� ������
	 * - ��Ӱ��踦 �������� ����
	 * 		����Ÿ�� ������ ������ ��ü���� ����Ÿ���� ��ӹ޴� ��� Ŭ���� Ÿ�԰� �� ����
	 * 
	 * - ����
	 * 		�������� instanceof ��Ÿ��
	 */
	public static void m2() {
		A a1 = new B(); // B > A
		A a2 = new C();
		
		System.out.println(a1 instanceof A); // true
		System.out.println(a1 instanceof B); // true
		System.out.println(a1 instanceof C); // false
		System.out.println(a1 instanceof Object); // true
		
		B b1 = new B(); //B ��ü ��������� ���� A ��ü, ������ Object ����
		System.out.println(b1 instanceof Object); //true
		System.out.println(b1 instanceof A); //true
		System.out.println(b1 instanceof B); //true
		
		//�������� ���� ���迡�� instanceof ������ ��� �Ұ�
//		System.out.println(b1 instanceof C); //��������, C�ϰ�� �������� ���� ���� ������ 
	}
	
	

	public static void main(String[] args) {
//		m2();
		
		//?  Person ��ü�� �����ؼ� �������� equals()�� ��ü�� ���밪 ��
		Person p1 = new Person("p1", 10);
		Person p2 = new Person("p2", 20);
		Person p3 = new Person("p2", 20);
		Person p4 = new Person("p2", 10);
		
		System.out.println(p1.equals(p2)); //false
		System.out.println(p2.equals(p3)); //true
		System.out.println(p2.equals(p4)); //false
		System.out.println(p1.equals(p4)); //false
		System.out.println(p1.equals("an")); //false
		
	}
}
