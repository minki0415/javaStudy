package view;

import org.junit.Before;
import org.junit.Test;

import controller.SnackController;
import model.dto.Snack;

public class StartView {
	
	public void allSnack() {
		System.out.println("****과자목록****");
		SnackController.snackAll();
	}

	public void createSnack() {
		System.out.println("****신규 과자 생성****");
		SnackController.create("4",new Snack("콘칩","농심", 1500, 800));
		SnackController.create("5",new Snack("버터링","해태", 2500, 1700));
	}
	
	public void readSnack() {
		System.out.println("***2번 과자 정보***");
		SnackController.read("2");		
	}
	
	public void updateSnackPrice() {
		System.out.println("***과자 가격 업데이트***");
		SnackController.updatePrice("3", 700);
	}
	@Test
	public void deleteSnack() {
		System.out.println("***일부 상품 품절되었습니다.***");
		SnackController.delete("3");
	}
			
}
