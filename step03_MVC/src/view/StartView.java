package view;

import controller.Controller;

//StartView Ŭ���� ����
public class StartView {
	
	/* client�� 1�� ��û�� �� �Ѹ� ��û���� ����
	/* client�� 2�� ��û�� ���� ��� ���� ��û���� ���� 
	 */

	//Controller���� ���� EndView�� print �޼ҵ� ����, �� ���
	
	public static void main(String[] args) {
			System.out.println("***�� �Ѹ� ���� ��û***");
			Controller.reqRes(1);
			
			System.out.println("***��� �� ���� ��û***");
			Controller.reqRes(2);
			
			System.out.println("***�߸��� ���� ��û***");
			Controller.reqRes(5);
	}

}
