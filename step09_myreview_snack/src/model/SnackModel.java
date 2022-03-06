package model;

import java.util.HashMap;

import model.dto.Snack;

public class SnackModel {
	
	private static HashMap<String, Snack> snacks = new HashMap<>();
	
	static {
		snacks.put("1", new Snack("Æ÷Ä«Ä¨", "³ó½É", 400, 800));
		snacks.put("2", new Snack("»õ¿ì±ø", "¿À¸®¿Â", 1200, 500));
		snacks.put("3", new Snack("»©»©·Î", "·Ôµ¥", 1800, 1200));
	}
	
	public static HashMap<String, Snack> snackAll(){
		return snacks;
	}
	
	public static Snack snackOne(String key) throws Exception {
		Snack a = snacks.get(key);
		if(a == null) {
			throw new Exception("Ç°ÀýµÈ »óÇ°ÀÔ´Ï´Ù.");
		}else {
			return a;
		}
	}
	
	public static boolean create(String key, Snack newsnack) {
		if(snacks.get(key) != null) {
			return false;
		}else {
			snacks.put(key, newsnack);	
			return true;
		}
	}
	
	public static Snack read(String key) {
		Snack s = snacks.get(key);
		if(s == null) {
			return null;
		}else {
			return s;
		}
	}
	
	public static boolean updatePrice(String key, int price) {
		if(snacks.get(key) != null) {
			snacks.get(key).setPrice(price);
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean delete(String key) {
		if (snacks.get(key) != null) {
			snacks.remove(key);
			return true;
					}	
			return false;
		
	}
	
}
