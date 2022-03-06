/* ArrayList에 저장 가능한 데이터들 타입
 *	- 객체 타입 모두 다 허용
 *	- java.lang.Object 하위 타입들 다 저장가능
 * 	- java.util.ArrayList도 참조(객체, class)타입
 * 	- ArrayList에 ArrayList 저장 가능 
 * 
 * 예시
 *	- 부서별로 ArrayList에 저장
 *		: 부서가 10개라면 10개의 ArrayList
 *	- 모든 직원들 정보도 ArrayList 로 관리
 *		: 하나의 ArrayList에 10개의 부서별 ArrayList 저장
 */

package step01.test;

import java.util.ArrayList;

import model.domain.Employee;

public class ReviewTest {
	
	/* Employee 객체 3개를 저장한 ArrayList를 ArrayList에 저장
	 * 
	 */
	static void m1() {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		ArrayList<ArrayList<Employee>> all = new ArrayList<ArrayList<Employee>>();
		
		emps.add(new Employee("11", "emp01", 10)); //0번째 저장
		emps.add(new Employee("22", "emp02", 20)); //1번째 저장
		emps.add(new Employee("33", "emp03", 10));
		
		all.add(emps);
		
		//? 1번째 저장된 직원 정보 출력
		ArrayList<Employee> v1 = all.get(0);
		Employee v2 = v1.get(1); //empno, ename, deptno
		System.out.println(v2);
		
		v2.setDeptno(200);
		System.out.println(all.get(0).get(1).getDeptno());
			
	}
	
	static void m2() {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		ArrayList<ArrayList<Employee>> all = new ArrayList<ArrayList<Employee>>();
		
		emps.add(new Employee("11", "emp01", 10)); //0번째 저장
		emps.add(new Employee("22", "emp02", 20)); //1번째 저장
		emps.add(new Employee("33", "emp03", 10));
		
		all.add(emps);
		
		all.get(0).get(1).setDeptno(200);
		System.out.println(all.get(0).get(1).getDeptno());
		
		//? emp03 -> smith로 변환
		all.get(0).get(2).setEname("smith");
		System.out.println(all.get(0).get(2).getEname());

	}

	public static void main(String[] args) {
		m2();
//		m1();
		
		/* System : class
		 * out : 
		 * 	- 변수 or 메소드 -> 변수
		 * 	- 어떤 클래스 내에 존재? System 내에 static으로 선언된 변수
		 * 
		 * println():
		 * 	- 어떤 클래스에 있는 메소드일까요?
		 * 	- out.prinln() : out타입 변수인 PrintStream 클래스에서 제공하는 메소드
		 */
		System.out.println();
		
	}

}
