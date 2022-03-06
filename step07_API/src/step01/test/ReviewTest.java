/* ArrayList�� ���� ������ �����͵� Ÿ��
 *	- ��ü Ÿ�� ��� �� ���
 *	- java.lang.Object ���� Ÿ�Ե� �� ���尡��
 * 	- java.util.ArrayList�� ����(��ü, class)Ÿ��
 * 	- ArrayList�� ArrayList ���� ���� 
 * 
 * ����
 *	- �μ����� ArrayList�� ����
 *		: �μ��� 10����� 10���� ArrayList
 *	- ��� ������ ������ ArrayList �� ����
 *		: �ϳ��� ArrayList�� 10���� �μ��� ArrayList ����
 */

package step01.test;

import java.util.ArrayList;

import model.domain.Employee;

public class ReviewTest {
	
	/* Employee ��ü 3���� ������ ArrayList�� ArrayList�� ����
	 * 
	 */
	static void m1() {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		ArrayList<ArrayList<Employee>> all = new ArrayList<ArrayList<Employee>>();
		
		emps.add(new Employee("11", "emp01", 10)); //0��° ����
		emps.add(new Employee("22", "emp02", 20)); //1��° ����
		emps.add(new Employee("33", "emp03", 10));
		
		all.add(emps);
		
		//? 1��° ����� ���� ���� ���
		ArrayList<Employee> v1 = all.get(0);
		Employee v2 = v1.get(1); //empno, ename, deptno
		System.out.println(v2);
		
		v2.setDeptno(200);
		System.out.println(all.get(0).get(1).getDeptno());
			
	}
	
	static void m2() {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		ArrayList<ArrayList<Employee>> all = new ArrayList<ArrayList<Employee>>();
		
		emps.add(new Employee("11", "emp01", 10)); //0��° ����
		emps.add(new Employee("22", "emp02", 20)); //1��° ����
		emps.add(new Employee("33", "emp03", 10));
		
		all.add(emps);
		
		all.get(0).get(1).setDeptno(200);
		System.out.println(all.get(0).get(1).getDeptno());
		
		//? emp03 -> smith�� ��ȯ
		all.get(0).get(2).setEname("smith");
		System.out.println(all.get(0).get(2).getEname());

	}

	public static void main(String[] args) {
		m2();
//		m1();
		
		/* System : class
		 * out : 
		 * 	- ���� or �޼ҵ� -> ����
		 * 	- � Ŭ���� ���� ����? System ���� static���� ����� ����
		 * 
		 * println():
		 * 	- � Ŭ������ �ִ� �޼ҵ��ϱ��?
		 * 	- out.prinln() : outŸ�� ������ PrintStream Ŭ�������� �����ϴ� �޼ҵ�
		 */
		System.out.println();
		
	}

}
