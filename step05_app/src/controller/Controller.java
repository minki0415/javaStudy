package controller;

import model.Model;
import view.EndView;


public class Controller {
	
	public static void resRes(int flag) {
		if(flag == 1) {
			EndView.print(Model.getStudent());
			
		}else if(flag == 2) {
			EndView.printAll(Model.getStudents());
			
		}else {
			EndView.printError("잘못된 요청입니다.");
			
		}
	}
	
}