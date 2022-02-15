package model;

//public class Model {
//	
//	public static StudentDTO getStudent() {
//		
//		StudentDTO s = new StudentDTO();
//		
//		s.setId(1);
//		s.setMajor("산업공학과");
//		s.setLecture("데이터분석");
//		s.setGrade('A');
//		
//		return s;
//	}
//
//	
//	public static StudentDTO[] getStudents() {
//		
//		StudentDTO[] s = {new StudentDTO(1, "산업공학","데이터분석",'A'),
//						  new StudentDTO(2, "경영학","경영학개론",'C'),
//						  new StudentDTO(3, "컴퓨터공학", "자료구조",'F')};
//		return s;
//
//	}
//}


public class Model {
	
	public static StudentDTO getStudent() {
		
		return StudentDTO.builder().id(1).major("산업공학과").lecture("데이터분석").grade('A').build();
		
	}

	
	public static StudentDTO[] getStudents() {
		
		StudentDTO s1 = StudentDTO.builder().id(1).major("산업공학과").lecture("데이터분석").grade('A').build();
		StudentDTO s2 = StudentDTO.builder().id(2).major("경영학과").lecture("경영학개론").grade('C').build();
		StudentDTO s3 = StudentDTO.builder().id(3).major("컴퓨터공학과").lecture("자료구조").grade('F').build();
		
		StudentDTO[] s = {s1, s2, s3};
		
		return s;

	}
	
}
