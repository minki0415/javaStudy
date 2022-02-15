package model;

// Model class 생성 
public class Model {
	//controller의 요청으로 한명의 정보를 db로부터 검색해서
	//CustomerDTO 생성해서 반환
	
	// 반환타입이 CustomerDTO인 getCustomer메소드 선언
	public static CustomerDTO getCustomer() {
        //          반환타입       메소드
		
		//CustomerDTO 타입 객체 c 생성
		CustomerDTO c = new CustomerDTO();
		
		//setXxx() 메소드로 id는 encore / pw는 11 / grade = g 설정
		c.setId("encore");
		c.setPw(11);
		c.setGrade('g');
		c.setJob("개발");
		
		//반환
		return c;
		
	}
	
	// 고객들을 모두 반환
	public static CustomerDTO[] getCustomers() {
		
		CustomerDTO[] c = {new CustomerDTO("id1",11, 'g',"개발"),  //@NoArgsConstructor 
						   new CustomerDTO("id2",22, 's',"기획")};		
		
		return c;
	}
	
}