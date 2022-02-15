package model;

//public class Model {
//	
//	public static StudentDTO getStudent() {
//		
//		StudentDTO s = new StudentDTO();
//		
//		s.setId(1);
//		s.setMajor("������а�");
//		s.setLecture("�����ͺм�");
//		s.setGrade('A');
//		
//		return s;
//	}
//
//	
//	public static StudentDTO[] getStudents() {
//		
//		StudentDTO[] s = {new StudentDTO(1, "�������","�����ͺм�",'A'),
//						  new StudentDTO(2, "�濵��","�濵�а���",'C'),
//						  new StudentDTO(3, "��ǻ�Ͱ���", "�ڷᱸ��",'F')};
//		return s;
//
//	}
//}


public class Model {
	
	public static StudentDTO getStudent() {
		
		return StudentDTO.builder().id(1).major("������а�").lecture("�����ͺм�").grade('A').build();
		
	}

	
	public static StudentDTO[] getStudents() {
		
		StudentDTO s1 = StudentDTO.builder().id(1).major("������а�").lecture("�����ͺм�").grade('A').build();
		StudentDTO s2 = StudentDTO.builder().id(2).major("�濵�а�").lecture("�濵�а���").grade('C').build();
		StudentDTO s3 = StudentDTO.builder().id(3).major("��ǻ�Ͱ��а�").lecture("�ڷᱸ��").grade('F').build();
		
		StudentDTO[] s = {s1, s2, s3};
		
		return s;

	}
	
}
