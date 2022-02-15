//사람 정보를 보유 및 수정 즉, 사람 데이터 기능 전담 클래스
//this 

package step02;

import lombok.Builder;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor // builder와 기본생성자 동시에 사용 불가능 
@Builder
public class Person {
	private String name;
	private int age;	
}
