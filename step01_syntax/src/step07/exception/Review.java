package step07.exception;

class C{
	static {
		System.out.println("C class 로딩");
	}
}


public class Review {
	
	//문제 2 : 해당 코드의 출력 값은?
	//정답 2 : C class 로딩
	public static void q2() {
		try {
			Class.forName("step07.exception.C");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//문제 3 : '3보다 작습니다.' 를 출력하기 위해 --에 들어갈 숫자(0이상)를 입력하세요
	//정답 3 : 0, 1, 2
	/* 메인함수의 try~catch 코드 참고
	 * try {
			q3(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	 */
	
	public static void q3(int v) throws Exception{
		if(v < 3) {
			throw new Exception("3보다 작습니다.");
		}
		System.out.println("3보다 작은 수를 입력하세요.");
	}
	
	
	//문제 4 : 예외가 발생과 무관하게 출력할 수 있는 코드를 추가하세요.
	//정답 4 : finally{
	//            System.out.println("예외 발생과 무관");
	//        }
	public static void q4() {
		try { 			
			Class.forName("step07.exception.C==");  
		}catch(ClassNotFoundException e) { 
			System.out.println("B 로딩 시 문제 발생");
		}//finally {
			//System.out.println("예외 발생과 무관");
		//}
		
	}
	
	
	//문제 5 : 반복문 내 코드를 수정하여 'java.lang.ArrayIndexOutOfBoundsException' 오류 발생시키기
	public static void q5(){
		int arr[] = new int[4];
		
		for(int  i=0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}	
	}
		

	public static void main(String[] args) {
		
		//문제 1 : 실행예외 수정하기
		//정답 1 : 0 -> 0이아닌 자연수로 바꾼다.
		System.out.println(10/1);
		
		q2();
		
		try {
			q3(0);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		q4();
		
		q5();
	}

}
