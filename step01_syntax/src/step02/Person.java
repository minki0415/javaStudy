//��� ������ ���� �� ���� ��, ��� ������ ��� ���� Ŭ����
//this 

package step02;

import lombok.Builder;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor // builder�� �⺻������ ���ÿ� ��� �Ұ��� 
@Builder
public class Person {
	private String name;
	private int age;	
}
