/* �н� ����
 * 1. static Ű���� �н�
 * 2. static Ű���� Ȱ�� ���� �� Ư¡
 * 		1)��� ������ ����   
 * 			- static Ÿ�� ����;
 * 			- byte code �� L04Static.class ���� �ڵ尡 �޸𸮿� �ε��ɶ� 
 * 			  static �������� method �Ǵ� class �޸𸮿� ��밡���ϰ� ���� �޸� ����
 * 			  ���� ��ü ������ �����ϰ� ��� ������ �����͵� ǥ���� ����
 * 
 * 			- ȣ�� ����
 * 				1. class��.������ = �ܺ� Ŭ������ ���� ȣ��� ���Ǵ� ����
 * 				2. ������ = ������ Ŭ���� ���� static ���� ȣ�� ����
 * 				3. ������ ��ü�� ���� ����.������ = ������ �����Ǵ� ��� ��ü�� ����
 * 
 *	 		- �������� ����?
 * 				- �����Ǵ� ��ü�� �����Ͱ� ���ϼ� �����ؾ� �� ��� �� pw ó�� �ߺ� �� ���� ������
 * 			  	  �����͵��� ������������ static ���� ����
 * 				- �ټ��� �����ϴ� �������� ���� ���� ���� static���� ó��
 * 
 * 				class Customer{ 
 * 			    	String id;   //�����Ǵ� ��� ��ü�� ���������� �����ϴ� instance ����
 * 			      	static String pw;//�����Ǵ� ��� ��ü�� �����ϴ� static ���� 
 * 					...
 *    			}			
 * 
 * 		2) �޼ҵ忡 ����     
 * 			- static ����Ÿ�� �޼ҵ��(){}
 *  		- ȣ�� ���
 *  			1. �ܺ� class���� ȣ���
 *  				Ŭ������.�޼ҵ��();  
 *  			2. ������ class���� ȣ���
 *  				Ŭ������.�޼ҵ��();  
 *  				�޼ҵ��();  
 *  				����������.�޼ҵ��();
 *    
 *  	3) static{}
 *  		- byte code�� �޸𸮿� �ε��ÿ� �ڵ� ����
 *  		- main() ���� �켱 ���� ����
 *  		- �ټ� user���� ����ϴ� �����ڿ� �ѹ��� ����(�ʱ�ȭ)�ÿ� ����
 *  
 *  
 * 3. jvm �޸�	
 * 		1. class �Ǵ� method 
 * 			- byte code�� ����Ǵ� ����
 * 			- static���� ����� ���� ���� ����
 * 		2. stack - ���� ������ ���� ����
 * 		3. heap - ��ü�鸸 ����  */

package step01.basic;

public class L04Static {
	//step02 - static ���� Ư¡
	//��� �������� ��ü ���� ������ �ڵ����� �⺻ ������ �ʱ�ȭ
	//�Ǽ� = 0.0, ���� = 0, boolean = false, char = '\u0000' ���� ���ٴ� ���ǹ�
	//��� ���� Ÿ�� = null
	int i;
	static int i2;
	
	L04Static(){
		i++;   // i = i+1; ������ ���� �� i�������� 1 ���ϰ� �ٽ� i�� ����
		i2++;  // i2 = i2+1
	}
	
	void m1() {
		System.out.println("�Ϲ� �޼ҵ� = instance �޼ҵ�");
	}
	
	static void m2() {
		System.out.println("static �޼ҵ�");
	}
	
	static {
		System.out.println("static ��� 1--------");
	}
	
	public static void main(String[] args) {		
		L04Static l = new L04Static();
		System.out.println(l.i + " " + l.i2); // 1 1
		
		L04Static l2 = new L04Static();
		System.out.println(l2.i + " " + i2); //1 2
		
		l.m1();
		L04Static.m2();		
	}
	
	static {
		System.out.println("static ��� 2=======");
	}
	
	
	
	//step01 - ������� ���� ���� �� ȣ�� ���� ����
//	int i = 10;   //instance ���� : ��ü �� instance �ʼ�
//	static int i2 = 20;	//static ����, non-instance ����
//	
//	public static void main(String[] args) {
//		System.out.println(i2);
//		System.out.println(L04Static.i2);
//		
//		L04Static l = new L04Static();
//		System.out.println(l.i);
//	}

}