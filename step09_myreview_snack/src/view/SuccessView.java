package view;

import java.util.HashMap;

import model.dto.Snack;

public class SuccessView {
	
	public static void printSnackAll(HashMap<String, Snack> snacks) {
		System.out.println(snacks);
	}
	
	public static void printSnack(Snack snack) {
		System.out.println(snack); 
	}
	

}
