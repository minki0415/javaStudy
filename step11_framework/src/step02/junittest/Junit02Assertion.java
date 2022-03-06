package step02.junittest;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Junit02Assertion {
	
	//@Test
	public void assertTest() {
		
		//1. junit 이라는 데이터에 대한 확인 로직
		assertEquals("Junit", "Junit");
		
		//...
		System.out.println("Junit인 경우에만 실행되는 라인 ");
	}

	//@Test
	public void assertTest2() {
		
		//1. null에 대한 확인 로직
		assertNull("junit", "junit"); // 두번째 parameter가 널이 아니면 다음 로직들이 다 무시됨
		System.out.println("null인 경우에만 실행되는 라인 ");
	}
	
	//@Test
	public void assertTest3() {
		
		//1. null에 대한 확인 로직
		assertNull("null"); // "null"과 null 은 다름 
		System.out.println("null인 경우에만 실행되는 라인 ");
	}
	
	//@Test
	public void assertTest4() {
		
		assertTrue(false); //
		System.out.println("true인 경우에만 실행되는 라인 ");
	}
	
	//parameter가 있는 메소드 단위 test하기
	//이 메소드 호출하는 다른 개발자는 test시에 반드시 2라는 값만 parameter로 유입해야하는 상황
//	@Test
	public void assertTest5(int v) {
//		if(v == 2) { // client가 유입시키는 데이터 값이 맞아? 틀려?
//			//...서비스 로직
//		}
		assertTrue(v == 2); // 개발자들간의 코드 검증
		//...서비스 로직
		System.out.println("2가 맞음, v = " + v);
		
	}
	
	@Test
	public void callTest() {
		assertTest5(2);
	}
	
	//단위 test만으로 parameter 적용
	//다양한 int 값들 적용 시도
//	@ParameterizedTest
//	@ValueSource(ints = {1,2,3})
	@ValueSource(ints = {2})	
	public void assertTest6(int v) {
		assertTrue(v == 2);
		System.out.println("2가 맞음" + v);
	
	}
	
	/* CSV는 몇가지 필드를 쉼표(, )로 구분한 텍스트 데이터 및 텍스트 파일이다.
	 * 확장자는 .csv 이며 MIME 형식은 text/csv이다. comma=separated variables 라고도 한다.
	 * 
	 */
//	@ParameterizedTest
//	@CsvSource(value = {"1,유","2, 유재석"})
	public void assertTest7(int age, String name) {
		assertTrue(age == 2 && name.equals("유재석")); //age는 2, 이름은 유재석이어야한다.
		
		System.out.println("유재석 맞아");
	
	}
	
}
