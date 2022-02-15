package step01.basic;

public class L02Method {
	
	//생성자 용도 - 객체라는 것을 만들 때 필수로 사용되는 요소
	//개발자가 미구현시 컴파일 시점에 자동 생성
	//자바 기반 객체 지향의 기본
	L02Method(){}
	
	// 2개의 정수 받아서 하나의 정수 값 반환, sum()
	// 2개의 정수 받아서 (argument, parameter, 인수, 인자, 매개변수..)
	//하나의 정수 값 반환 int / return int값
	int sum(int v1, int v2) {
		return v1 + v2;
		
	}
	
	//result 변수는 반환로직으로 한 번만 사용될 것이기 때문에 불필요하다
	//시스템 자원은 코드 하나하나에서 다 처리 필수
	int sum2(int v1, int v2) {
		int result = v1 + v2;
		return result;
	}
	
	//java L02Method 실행 요청시 해당 클래스의 main 메소드를 jre에서 자동 호출 
	//main() 제외한 우리가 개발한 모든 메소드(기능)들은 직접 코드로 호출해야함
	public static void main(String[] args) {
		//단순 메소드 기능들을 호출해서 사용하기 위해 문법적으로 객체 생성
		//sum() 호출해서 반환받은 결과 값을 main()에서 콘솔창에 출력
		//객체 생성 - sum(), sum2() 보유한 클래스로부터 객체 생성
		//내가 만든 클래스는 자바의 타입으로 사용이 가능하다.
		//java에서의 타입 개수는 제한이 없음
		//클래스를 기반으로 하여 새로운 데이터가 생성되었다 -> 객체 생성
		//l : 생성된 객체를 참조하는 변수로 주소 값 보유, 참조변수(refernce 변수)
		L02Method l = new L02Method(); //new - 객체 생성 키워드, L02Method() 생성자
		System.out.println(l); // 출력 값 -> step01.basic.L02Method@30a3107a
		int r = l.sum(10, 20);
		System.out.println("결과 : " + r); // 출력 값 -> 결과 : 30
		
		
		// int i =3;
		// String s = "삼"
		// double d = 3.3;
	}
	
}
