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
			FailView.messageView("잘못된 입력입니다.");
		}
		
	}
	
	public static void read(String key) {
		if(SnackModel.read(key) != null) {
			try {
				SuccessView.printSnack(SnackModel.snackOne(key));
			} catch (Exception e) {
				e.printStackTrace();
				FailView.messageView("정보를 읽는데 실패했습니다.");
			}
		}
	}
	
	
	public static void updatePrice(String key, int price) {
		if(SnackModel.updatePrice(key, price)){
			SuccessView.printSnackAll(SnackModel.snackAll());
		}else {
			FailView.messageView("가격 업데이트에 실패했습니다.");
		}
	}
	
	public static void delete(String key) {
		if(SnackModel.delete(key)) {
			SuccessView.printSnackAll(SnackModel.snackAll());
		}else {
			FailView.messageView("정보 삭제에 실패했습니다.");
		}
		
		
	}
		
}
