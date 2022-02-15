/* ClassNotFoundException
 * ArrayIndexOutOfBoundsException
 * 
 * 1. 실습
 * 		정상/비정상 상황 연출
 * 
 * 2. 배열 문제
 * 		컴파일 ok / 실행시 ArrayIndexOutOfBoundsException 발생
 * 		실행예외 발생시 값 수정해서 즉, try~catch라는 예외처리 문장 없이 값만 수정해서 정상실행
 * 		문제 발생 시에는 시스템 stop
 * 
 * 3. class 로딩 문제
 * 		예외처리 문법이 없는 경우에 오타 여부조차 확인 없이 무조건 예외 발생 
 * 		ClassNotFoundException
 * 		예외처리 문장 무조건 필수, 후에 실행해서 문제 발생 여부 확인
 * 		문제 발생했더라도 프로그램 나머지 로직이 정상 실행
 * 
 */

package step07.exception;

class A{
	static {
		System.out.println("byte code가 메모리에 로딩시 자동 실행되는 블록");
	}
}

public class Exception1 {
	

	public static void main(String[] args) {
		
		System.out.println(10/2);
/*
 * ArithmeticException : 실행 예외
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at step07.exception.Exception1.main(Exception1.java:32)

 */
		
		int [] i = {1, 2};  //index 0번째, 1번째 저장, length 변수 자동 생성 (length = 2)
		System.out.println(i[5]);  //존재하지 않는 메모리 값의 데이터를 출력
//		System.out.println(i[1]);  // index 5 -> 1, 오류수정
		System.out.println(100);
		
		//존재하는 일반 byte code 즉, class들을 메모리에 로딩하는 API
		/* forName() 개발자 관점
		 * 1. 기능 : parameter 문자열로 유입되는 클래스를 메모리에 로딩
		 * 
		 * 2. 발생 가능한 경우의 수
		 * 		1) 정상 로딩
		 * 			- 실제 존재하는 클래스가 있고, 오타 없이 코딩
		 * 		2) 비정상 로딩 
		 * 			- class가 존재하지 않을 수도
		 * 			- class가 있지만 오타 발생
		 * 
		 * 3. 결론
		 * 		- 혹여 비정상 로딩을 코드 상에서 발생 여지도 고려해서
		 * 			메소드 선언구에서 언급
		 * 	
		 * public static Class forName(String className)
                        throws ClassNotFoundException		 
		 */
//		try {
//			Class.forName("step07.exception.A");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}

	
}
/* 오류내용
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
 * Index 5 out of bounds for length 2 
 * at step07.exception.Exception1.main(Exception1.java:7)
 * 
 */
