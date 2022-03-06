package controller;

import java.util.HashMap;

import model.SnackModel;
import model.dto.Snack;
import view.FailView;
import view.SuccessView;

public class SnackController {
	
	public static void snackAll() {
		HashMap<String, Snack> snack = SnackModel.snackAll();
		SuccessView.printSnackAll(snack);
	}
	
	
	public static void create(String key, Snack s) {
		if(SnackModel.create(key, s)) {
			SuccessView.printSnackAll(SnackModel.snackAll());
		}else {
			FailView.messageView("�߸��� �Է��Դϴ�.");
		}
		
	}
	
	public static void read(String key) {
		if(SnackModel.read(key) != null) {
			try {
				SuccessView.printSnack(SnackModel.snackOne(key));
			} catch (Exception e) {
				e.printStackTrace();
				FailView.messageView("������ �дµ� �����߽��ϴ�.");
			}
		}
	}
	
	
	public static void updatePrice(String key, int price) {
		if(SnackModel.updatePrice(key, price)){
			SuccessView.printSnackAll(SnackModel.snackAll());
		}else {
			FailView.messageView("���� ������Ʈ�� �����߽��ϴ�.");
		}
	}
	
	public static void delete(String key) {
		if(SnackModel.delete(key)) {
			SuccessView.printSnackAll(SnackModel.snackAll());
		}else {
			FailView.messageView("���� ������ �����߽��ϴ�.");
		}
		
		
	}
		
}
