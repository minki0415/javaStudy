package view;

import model.StudentDTO;

public class EndView {
	
	public static void print(StudentDTO s) {
		System.out.println(s.getId() + " " + s.getMajor()+" "+ s.getLecture() +" " +" "+s.getGrade()  );
	}

	
	public static void printAll(StudentDTO[] all) {
		
		for(int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		
	}
	
	
	public static void printError(String msg) {
		System.out.println(msg);
	}
	
}
