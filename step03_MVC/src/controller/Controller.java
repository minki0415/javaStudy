package controller;

//필요한 클래스 import
import model.CustomerDTO;
import model.Model;
import view.EndView;

//Controller 클래스 선언
public class Controller {
	
	//CustomerDTO에서 생성된 객체에 Model에서 고객정보 불러와서 Endview 에서 print
	//1 요청 - 한명 고객 정보 제공 | 2 요청 - 모든 고객 정보 제공 | 1또는 2가 아니라면 잘못된 요청
	/* 조건 - 1인가? 2인가? 1또는 2가 아닌가?
	 * 정수 비교 연산자(동등비교 연산자) : ==
	 */
	public static void reqRes(int flag) {
		if(flag == 1) {
			EndView.print(Model.getCustomer());			
		}else if(flag == 2) {
			/* EndView.printAll(Model.getCustomers()); 실행순서
			 * Model.getCustomers()
			 * -> Encview.printAll()
			 * 	-> ;
			 */
			EndView.printAll(Model.getCustomers());
		}else {
			EndView.printMsg("잘못된 요청입니다. 확인하십시오.");
		}
		
	}
}
