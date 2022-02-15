package step05.apply;

public class Review {
	
	//static 변수 선언
	static String data2 = "lmnop";
	
	
	public static void main(String[] args) {
		
		//생성 자 
		Review r = new Review();
	
		//java.lang.Math 클래스의 메소드 활용 
		//13과 7 중에서 큰 값 출력
		System.out.println(Math.max(13, 7));
		
		//java.lang.Integer 클래스의 메소드 활용
		//문자열에서 d 출력하기
		String data1 = "abc de";
		System.out.println(data1.charAt(4));
		
		//static 변수 선언 후 o 출력하기
		System.out.println(data2.charAt(3));
		
		//3가지 방법으로 static 변수 출력하기
		System.out.println("클래스명.메소드명 :"+ Review.data2);
		System.out.println("메소드명 :"+ data2);
		System.out.println("참조변수명.메소드명 :"+ r.data2);
			
		}
				
}

