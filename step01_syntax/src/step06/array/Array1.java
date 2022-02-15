package step06.array;

public class Array1 {
	
	//int 값들로 배열 생성 및 반환, int[] -> 반환 타입
	public static int[] getIntArray() {
		int[] i = {1, 2, 3}; // i는 int배열 타입의 변수 
		return i;
		
	}
	
	//int 값들로 구성된 배열 받아서 출력
	//반복문 추가학습 
	public static void printArray(int[] v) {
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
	}
	
	//eclipse 단축기 : 변수, 메소드명 수정시 호출한 곳까지 동시에 변강하기 위한 단축기
	//alt + shift + r -> 수정 -> Enter
	public static void printArrayFor1(int[] v) {
		for(int i = 0; i < 3; i++) {
			System.out.println(v[i]);
		}
	}
	
	//length - 생성된 배열에 자동 추가되는 변수(배열 크기 값 보유)
	public static void printArrayFor2(int[] v) {
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	
	// 배열, List 객체들에게 사용되는 반복문
	public static void printArrayForEach(int[] v) {
		 for(int i : v) { //i는 배열의 각 요소의 데이터를 보유받게 되는 변수
			 System.out.println(i);
		 }
	}
	
	public static void printArrayWhile(int[] v) {
		int i = 0;
		while(i < 3) {
			System.out.println(v[i]);
			i++;
		}
				
	}
	
	public static void main(String[] args) {
		int[] v1 = getIntArray();
		printArray(v1);
		System.out.println("----for----");
		printArrayFor1(v1);
		System.out.println("----while----");
		printArrayWhile(v1);		
		System.out.println("----forEach----");
		printArrayForEach(v1);
		
	}

}
