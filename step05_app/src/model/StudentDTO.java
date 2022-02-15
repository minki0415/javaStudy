package model;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//
//
//public class StudentDTO {
//
//	private int id;
//	private String major;
//	private String lecture;
//	private char grade; // A,B,C,D,F
//	
//	public void setGrade(char grade) {
//		if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'|| grade == 'F') {
//			this.grade = grade;
//		}else {
//			System.out.println("잘못된 등급");
//		}
//	}
//	
//}


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO {

	private int id;
	private String major;
	private String lecture;
	private char grade; // A,B,C,D,F
	
	public void setGrade(char grade) {
		
		if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'|| grade == 'F') {
			this.grade = grade;
		}else {
			System.out.println("잘못된 등급");
		}
		
	}

	
}