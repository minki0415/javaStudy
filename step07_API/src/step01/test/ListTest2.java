/* Employee CRUD 로직
 * 
 * 1. ArrayList는 멤버 변수 선언? / 각 메소드별 로컬 변수 선언?
 * 	- 4개의 메소드가 공유하는 자원(데이터)
 * 	- 멤버 변수 !!!
 * 	- RDBMS 에서 select 한다 가정
 * 		- 데이터를 초기화 하는 로직 
 * 			static{}
	 * 	- 멤버 변수? 모든 메소드 고유되는 데이터
	 * 	- 로컬 변수? 선언된 메소드 내에서만 사용되는 데이터
 *  *** 선언된 변수가 가장 근접한 {}내에서만 사용됨
 *  
 *  
 * 2. 한명의 사원 검색시에 기준 데이터?
 * 3. "			갱신 기준 데이터? 어떤 데이터 수정 = 부서 번호
 * 4. 삭제 어떤 데이터 기준으로 삭제
 */
package step01.test;

import java.util.ArrayList;

import exception.IdInvalidateException;
import model.domain.Employee;

public class ListTest2 {
	//객체 생성해야만 사용 가능한 변수로 선언시에는 static {} 내부에선 호출 불가
	private static ArrayList<Employee> al = new ArrayList<>();
	
	//객체 생성 시점과 무관하게 ListTest2.class가 로딩시에 자동 실행
	static {
		al.add(new Employee("11", "smith", 20));  //0번째 저장
		al.add(new Employee("22", "master", 30)); //1번째 저장 
	}
	
	//create() - Employee 객체들 ArrayList 저장 
//	//1
//	public static void create() {
//		al.add(new Employee("33", "tester", 30));
//	}
//	//2
//	public static void create(String empno, String ename, int depetno, ....) {
//		al.add(new Employee(empno, ename, depetno));
//	}
	//3 - 객체를 제대로 활용하는 코드, 객체지향스럽다!!!
	/* 로직 구현시 고려 사항
	 * 경우의 수 1 - 없는 id 즉 정상 저장 가능
	 * 경우의 수 2 - 있는 id 즉 중복 사용자 정의(개발자들이 개발한 exception 클래스로 예외 상황 처리)
	 * 	IdInvalidateException.java  */
	
	//? 논리적으로 미 존재하는 사번인 경우에만 add 할수 있게 코드 재구성
	public static void create(Employee newEmp) throws IdInvalidateException{
		
		//3명이라 가정  - 중복된 id는 index 2 즉 3번째 존재
		for(Employee e : al) {
			if(e.getEmpno().equals( newEmp.getEmpno() )) { //AL에 이미 존재할 경우 예외 발생
				//메소드 자체가 종료
				throw new IdInvalidateException("사번이 중복되었습니다"); 				
			}
		}
		
		//이 라인이 실행되는 경우는 AL에 중복된 사번이 미 존재할 경우에만 실행
		al.add(newEmp); 				
	}
	
	
	//read() - empno 사번으로 한명의 사번 검색
	//객체 타입의 기본값은 null
	/* 로직
	 * ArrayList의 모든 객체들의 사번을 비교(조건식, 직원이 여러명..반복?) 	
	 * 	경우의 수1 -> 동일한 경우 Employee 객체 반환
	 *  경우의 수2 -> 검색 요청한 사번 정보 없음, null 반환
	 *  
	 *  String 클래스에 boolean equals(Object o){ String 객체값 비교해서 반환}
	 */
	public static Employee read(String empno){
	
//		Employee emp = null;  //로컬 변수들은 선언시 기본값으로 초기화 권장
		/* e.getEmpno().equals(empno)
		 * e - Employee
		 * e.getEmpno() - String
		 * 		public String getEmpno() {}
		 * e.getEmpno().equals(..) - boolean
		 * 		public boolean equals(Object anObject) {}
		 */
		for(Employee e : al) {
			if(e.getEmpno().equals(empno)) {  //if(true) or if(false)
				return e; //return 키워드는 메소드를 종료하는 기능 포함 
			}
		}
		return null;  //if 문장 모두다 false인 경우에도 반환은 필수이기 때문에 필요한 코드
	}
	
	//update() - 한명의 사원의 부서번호 갱신
	/* 필요 데이터 - 사번과 수정하고자 하는 갱신된 부서 번호
	 * 실행시 발생 가능한 경우의 수
	 * 	경우의 수1 - 없는 사원번호?
	 * 	경우의 수2 - 없는 부서번호?
	 * 
	 * 		- 사번도 없고, 부서 번호 없음
	 * 		- 사번은 있고, 부서 번호 없음
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
	
	
	//delete() - 존재하는 한명의 사원 삭제 
	//remove() - AL 내부에 사번에 해당하는 사원을 삭제
	/* 존재할 경우 해당 사원이 저장된 AL의 index 값으로 remove()
	 * index 필요
	 * forEach 반복문이 아닌 정통 반복문 사용
	 * 	- 정통 반복문은 index값을 실시간 확인 가능
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
		System.out.println("*** 1. 새로운 직원 입사 ***");
		
		//미 존재하는 사원 저장 시도/존재하는 사원 저장 시도
		try {
			
			create(new Employee("55", "playman", 60));
			System.out.println("정상 저장");
			
			create(new Employee("55", "playman", 60));
			
		}catch(IdInvalidateException e){
			System.out.println(e.getMessage());
		}

		
		System.out.println("*** 2. 모든 직원 검색 ***");
		System.out.println(al); //al.toString()
		
		System.out.println("*** 3. 한명의 사원 검색 ***");
		Employee e = read("11");
		
		if(e != null) {
			System.out.println(e);
		}else {
			System.out.println("해당 사번의 사원은 미 존재");
		}
		
		e = read("66");
		if(e != null) {
			System.out.println(e); 
		}else {
			System.out.println("해당 사번의 사원은 미 존재");
		}
		
		System.out.println("*** 4. 부서 번호 수정 ***");
		update("11", 100);
		System.out.println( read("11"));
		
		System.out.println("*** 5. 사원 삭제 후 검색 ***");
		
		boolean result = delete("22");
		if(result) {
			System.out.println("퇴사");
		}else {
			System.out.println("미존재 사원입니다");
		}
		
		result = delete("22");
		if(result) {
			System.out.println("퇴사");
		}else {
			System.out.println("미존재 사원입니다");
		}
	}

}