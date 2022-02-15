package step02;

public class People {
	// 변수 - 실제 사용 가능하게 메모리에 생성되는 시점? 객체 생성 시
	//객체 자체를 생성하는 변수를 멤버 변수
	String name;  //선언
	int age;   //선언
	
	//생성자
	People(){}
	
	//메소드 - 사용하는 관점에서 개발
	String getName() {
		return name;     //호출
	}
	
	//로컬변수
	void setName(String newName) { 		//선언
		name = newName;			//멤버변수 호출 = 로컬변수 호출
	}
	
	int getAge() {
		return age; 	 //호출
	}
	
	void setAge(int newAge) {	//선언
		age = newAge;		//멤버변수 호출 = 로컬변수 호출
	}
	
	
	public static void main(String[] args) {	//선언
		//객체 생성 - name.age 메모리 생성 하면서 People 영역으로 관리
		//단 주소 값으로 데이터 활용, 실 주소 값이 아닌 p1 변수명으로 코드 상에서 사용
		People p1 = new People();	//선언
		System.out.println(p1.name);
		
		//변수 호출로 값  대입 확인 
		p1.name = "유재석";
		System.out.println(p1.name);
		
		//메소드 호출로 값 수정 및 확인
		p1.setName("백종원");
		System.out.println(p1.name);
		
	}
}
