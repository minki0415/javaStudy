package view;

import controller.Controller;

//StartView 클래스 선언
public class StartView {
	
	/* client가 1로 요청시 고객 한명 요청으로 간주
	/* client가 2로 요청시 고객들 모든 정보 요청으로 간주 
	 */

	//Controller에서 받은 EndView의 print 메소드 실행, 값 출력
	
	public static void main(String[] args) {
			System.out.println("***고객 한명 정보 요청***");
			Controller.reqRes(1);
			
			System.out.println("***모든 고객 정보 요청***");
			Controller.reqRes(2);
			
			System.out.println("***잘못된 정보 요청***");
			Controller.reqRes(5);
	}

}
