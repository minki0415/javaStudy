package view;

//필요한 클래스 import
import model.CustomerDTO;

//EndView class 선언
public class EndView {
	
	//CustomerDTO 객체 c에 들어있는 정보 출력하는 메소드 선언
	public static void print(CustomerDTO c) {
		System.out.println(c.getId()+" "+ c.getGrade());
		
	}
	
	//모든 고객 정보 출력
	//forEach / println() 참조변수 값 출력시 toString() 자동 호출
	public static void printAll(CustomerDTO[] all) {
		for(CustomerDTO v : all) {
			System.out.println(v); // v.toStringa
		}
		
	}
	
	public static void printMsg(String msg) {
		System.out.println(msg);
	}

}
