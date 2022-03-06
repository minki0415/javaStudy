package view;

import org.junit.Before;
import org.junit.Test;

import controller.SnackController;
import model.dto.Snack;

public class StartView {
	
	public void allSnack() {
		System.out.println("****���ڸ��****");
		SnackController.snackAll();
	}

	public void createSnack() {
		System.out.println("****�ű� ���� ����****");
		SnackController.create("4",new Snack("��Ĩ","���", 1500, 800));
		SnackController.create("5",new Snack("���͸�","����", 2500, 1700));
	}
	
	public void readSnack() {
		System.out.println("***2�� ���� ����***");
		SnackController.read("2");		
	}
	
	public void updateSnackPrice() {
		System.out.println("***���� ���� ������Ʈ***");
		SnackController.updatePrice("3", 700);
	}
	@Test
	public void deleteSnack() {
		System.out.println("***�Ϻ� ��ǰ ǰ���Ǿ����ϴ�.***");
		SnackController.delete("3");
	}
			
}
