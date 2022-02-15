package model;

import lombok.AllArgsConstructor;
import lombok.Getter; //getXxx() 메소드 자동생성
import lombok.Setter; //setXxx() 메소드 자동생성
import lombok.ToString;
import lombok.NoArgsConstructor;  // 생성자 자동 생성, 파라미터가 없는 기본 생성자 자동 생성

// lombok 어노테이션
@NoArgsConstructor //기본생성자(파라미터가 없는 생성자) 자동생성
@AllArgsConstructor   //클래스에 존재하는 모든 필드에 대한 생성자 자동생성 
@Getter
@Setter
@ToString

// CustomerDTO class 생성
public class CustomerDTO {
	
	//변수 선언 
	//Getter, Setter로만 변경할 수 있도록 private으로 설정
	private String id; 
	private int pw;
	private char grade; //g(gold), s(silver) 두 레벨만 OK 가능하다고 가정
	private String job;
	
	//grade 값에 유효한 값만 저장 가능한 조건식 적용(유효성 적용)
	//유효한 데이터만 저장 가능하게 하는 rule
	//절대 타입만 맞다고 해서 대입 가능한 상황은 금지
	//변수를 외부에서 호출 불가능하게 막아 놓고 유효성 코드로 검증 후에만 대입
	//개발 관점 : 변수를 외부에서 차단(private) / 유효성 코드로 검증 메소드는 제한 없이 허용(public)
	public void setGrade(char grade) {
		if(grade == 'g' || grade == 's' ) {
			this.grade = grade;
		}else {
			System.out.println("무효한 등급");
		}
	}
}
