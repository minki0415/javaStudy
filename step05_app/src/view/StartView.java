package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("****학생 1 정보 요청****");
		Controller.resRes(1);
		
		System.out.println("****학생 1,2,3 정보 요청****");
		Controller.resRes(2);
		
		System.out.println("****잘못된 정보 요청****");
		Controller.resRes(3);
		
	}

}
