/* Employee CRUD ����
 * 
 * 1. ArrayList�� ��� ���� ����? / �� �޼ҵ庰 ���� ���� ����?
 * 	- 4���� �޼ҵ尡 �����ϴ� �ڿ�(������)
 * 	- ��� ���� !!!
 * 	- RDBMS ���� select �Ѵ� ����
 * 		- �����͸� �ʱ�ȭ �ϴ� ���� 
 * 			static{}
	 * 	- ��� ����? ��� �޼ҵ� �����Ǵ� ������
	 * 	- ���� ����? ����� �޼ҵ� �������� ���Ǵ� ������
 *  *** ����� ������ ���� ������ {}�������� ����
 *  
 *  
 * 2. �Ѹ��� ��� �˻��ÿ� ���� ������?
 * 3. "			���� ���� ������? � ������ ���� = �μ� ��ȣ
 * 4. ���� � ������ �������� ����
 */
package step01.test;

import java.util.ArrayList;

import exception.IdInvalidateException;
import model.domain.Employee;

public class ListTest2 {
	//��ü �����ؾ߸� ��� ������ ������ ����ÿ��� static {} ���ο��� ȣ�� �Ұ�
	private static ArrayList<Employee> al = new ArrayList<>();
	
	//��ü ���� ������ �����ϰ� ListTest2.class�� �ε��ÿ� �ڵ� ����
	static {
		al.add(new Employee("11", "smith", 20));  //0��° ����
		al.add(new Employee("22", "master", 30)); //1��° ���� 
	}
	
	//create() - Employee ��ü�� ArrayList ���� 
//	//1
//	public static void create() {
//		al.add(new Employee("33", "tester", 30));
//	}
//	//2
//	public static void create(String empno, String ename, int depetno, ....) {
//		al.add(new Employee(empno, ename, depetno));
//	}
	//3 - ��ü�� ����� Ȱ���ϴ� �ڵ�, ��ü���⽺����!!!
	/* ���� ������ ��� ����
	 * ����� �� 1 - ���� id �� ���� ���� ����
	 * ����� �� 2 - �ִ� id �� �ߺ� ����� ����(�����ڵ��� ������ exception Ŭ������ ���� ��Ȳ ó��)
	 * 	IdInvalidateException.java  */
	
	//? �������� �� �����ϴ� ����� ��쿡�� add �Ҽ� �ְ� �ڵ� �籸��
	public static void create(Employee newEmp) throws IdInvalidateException{
		
		//3���̶� ����  - �ߺ��� id�� index 2 �� 3��° ����
		for(Employee e : al) {
			if(e.getEmpno().equals( newEmp.getEmpno() )) { //AL�� �̹� ������ ��� ���� �߻�
				//�޼ҵ� ��ü�� ����
				throw new IdInvalidateException("����� �ߺ��Ǿ����ϴ�"); 				
			}
		}
		
		//�� ������ ����Ǵ� ���� AL�� �ߺ��� ����� �� ������ ��쿡�� ����
		al.add(newEmp); 				
	}
	
	
	//read() - empno ������� �Ѹ��� ��� �˻�
	//��ü Ÿ���� �⺻���� null
	/* ����
	 * ArrayList�� ��� ��ü���� ����� ��(���ǽ�, ������ ������..�ݺ�?) 	
	 * 	����� ��1 -> ������ ��� Employee ��ü ��ȯ
	 *  ����� ��2 -> �˻� ��û�� ��� ���� ����, null ��ȯ
	 *  
	 *  String Ŭ������ boolean equals(Object o){ String ��ü�� ���ؼ� ��ȯ}
	 */
	public static Employee read(String empno){
	
//		Employee emp = null;  //���� �������� ����� �⺻������ �ʱ�ȭ ����
		/* e.getEmpno().equals(empno)
		 * e - Employee
		 * e.getEmpno() - String
		 * 		public String getEmpno() {}
		 * e.getEmpno().equals(..) - boolean
		 * 		public boolean equals(Object anObject) {}
		 */
		for(Employee e : al) {
			if(e.getEmpno().equals(empno)) {  //if(true) or if(false)
				return e; //return Ű����� �޼ҵ带 �����ϴ� ��� ���� 
			}
		}
		return null;  //if ���� ��δ� false�� ��쿡�� ��ȯ�� �ʼ��̱� ������ �ʿ��� �ڵ�
	}
	
	//update() - �Ѹ��� ����� �μ���ȣ ����
	/* �ʿ� ������ - ����� �����ϰ��� �ϴ� ���ŵ� �μ� ��ȣ
	 * ����� �߻� ������ ����� ��
	 * 	����� ��1 - ���� �����ȣ?
	 * 	����� ��2 - ���� �μ���ȣ?
	 * 
	 * 		- ����� ����, �μ� ��ȣ ����
	 * 		- ����� �ְ�, �μ� ��ȣ ����
	 *  ...
	 */
	public static boolean update(String empno, int newDept){
		for(Employee e : al) {
			if(e.getEmpno().equals(empno)) {  
				e.setDeptno(newDept);
				return true;
			}
		}
		return false;  
	}
	
	
	//delete() - �����ϴ� �Ѹ��� ��� ���� 
	//remove() - AL ���ο� ����� �ش��ϴ� ����� ����
	/* ������ ��� �ش� ����� ����� AL�� index ������ remove()
	 * index �ʿ�
	 * forEach �ݺ����� �ƴ� ���� �ݺ��� ���
	 * 	- ���� �ݺ����� index���� �ǽð� Ȯ�� ����
	 */
	public static boolean delete(String empno){
		for(int index = 0; index < al.size(); index++) {
			
			if(al.get(index).getEmpno().equals(empno)) {	
				al.remove(index);
				return true;
			}
		}
		
		return false;  		
	}
	
	public static void main(String[] args) {
		System.out.println("*** 1. ���ο� ���� �Ի� ***");
		
		//�� �����ϴ� ��� ���� �õ�/�����ϴ� ��� ���� �õ�
		try {
			
			create(new Employee("55", "playman", 60));
			System.out.println("���� ����");
			
			create(new Employee("55", "playman", 60));
			
		}catch(IdInvalidateException e){
			System.out.println(e.getMessage());
		}

		
		System.out.println("*** 2. ��� ���� �˻� ***");
		System.out.println(al); //al.toString()
		
		System.out.println("*** 3. �Ѹ��� ��� �˻� ***");
		Employee e = read("11");
		
		if(e != null) {
			System.out.println(e);
		}else {
			System.out.println("�ش� ����� ����� �� ����");
		}
		
		e = read("66");
		if(e != null) {
			System.out.println(e); 
		}else {
			System.out.println("�ش� ����� ����� �� ����");
		}
		
		System.out.println("*** 4. �μ� ��ȣ ���� ***");
		update("11", 100);
		System.out.println( read("11"));
		
		System.out.println("*** 5. ��� ���� �� �˻� ***");
		
		boolean result = delete("22");
		if(result) {
			System.out.println("���");
		}else {
			System.out.println("������ ����Դϴ�");
		}
		
		result = delete("22");
		if(result) {
			System.out.println("���");
		}else {
			System.out.println("������ ����Դϴ�");
		}
	}

}