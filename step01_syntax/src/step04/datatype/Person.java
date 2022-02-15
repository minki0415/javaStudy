//사람 정보를 보유 및 수정 즉, 사람 데이터 기능 전담 클래스
//this 

package step04.datatype;

public class Person {
	String name;
	int age;
	
	public Person() {}

	public String getName() {
		return name;
	}
	
	/* this 
	 * - 로컬 변수와 멤버 변수 명이 동일 한 경우 멤버 변수를 지정하게 되는 키워드 
	 * - 자기 자신의 객체를 참조하는 특별한 키워드
	 */
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
