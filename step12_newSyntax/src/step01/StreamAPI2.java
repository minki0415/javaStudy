/* 학습내용
 * 
 * Optional API 학습
 * 1. list/map/set 처럼 데이터 보유 가능
 * 
 * 2. 필요성 
 * 		- 실행 시 발생가능한 예외 중에 NullPionterException 골치
 * 			- java.lang.RuntimeException
 * 			- try ~ catch 없이 즉 실행 시에만 발견
 * 		- NullPionterException 발생되지 않게 안정적인 사전처리 구현 가능하게 하는 기술
 * 
 */

package step01;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class StreamAPI2 {
	
	
	//non-Optional
//	@Test
	public void m1() {
		
		String v = null;
//		if(v != null) {
			System.out.println(v.length());	//NullPionterException 발생	
//		}
		System.out.println("정상실행"); //예외 발생으로 실행 불가
	}
	
	
	/* null 처리용 API
	 * 1. ofNullable() - Optional 객체 생성 메소드
	 * 		- parameter
	 * 			1) null : Optional.empty 출력
	 * 			2) 객체 : Optional[객체 타입] 출력
	 * 
	 * 2. isPresent() - Optional 객체 내에 저장된 객체 존재 여부 확인 메소드
	 * 		- empty 일 경우 : false 반환
	 * 		- not empty일 경우 : true 반환
	 * 
	 * 3. ifPresent() - if 조건식과 같은 기능 
	 * 		- empty : null 의미, NullPointException 발생안함 -> 로직 스킵
	 * 		- not empty : 정상 실행
	 * 		
	 */
	//Optional
//	@Test
	public void m2() {
		String v = null;
		
		Optional<String> opt = Optional.ofNullable(v);
		Optional<String> opt2 = Optional.ofNullable("String");
		
		System.out.println(opt); //출력 값 : Optional.empty
		System.out.println(opt2); //출력 값 : Optional[String]
		
		System.out.println(opt.isPresent()); //출력 값 : false , null이면 false
		System.out.println(opt2.isPresent()); //출력 값 : true, null이 아니면 true
		
		
		//null 여부와 무관하게 정상 실행되는 코드
		//data 변수가 null인 경우 {} 로직은 실행 skip
		opt.ifPresent((data) -> {
			System.out.println(v.length());		//출력 값 : 정상실행, null인데도 정상실행
		});	
		
		
		//Optional API  사용시에는 문제가 발생된다 하더라도 하단 로직 정상실행, 서버의 중지 없이 실행 유지
		System.out.println("정상실행"); 
	}
	
	/* 1. of() : null 불허
	 *		- null Optional 객체 생성시 NullPointException 발생
	 *		- of() 사용 시에는 ifPresent() 의미 없음
	 * 
	 */
//	@Test
	public void m3() {
		String v = null;
		
		//.of() 메소드는 null인 경우 NullpointException 발생
		Optional<String> opt = Optional.of("v");
		Optional<String> opt2 = Optional.of("string");
		
		System.out.println(opt);
		System.out.println(opt2);
		
		System.out.println(opt.isPresent());
		System.out.println(opt2.isPresent());
		
//		System.out.println(v.length()); //null
		
		System.out.println("정상실행");
	}
	
	
	/* orElse() 
	 * 		- null인 경우를 고려해서 실행하고자 하는 로직이 있을 경우 권장
	 * 		- null인 경우엔 orElse() 메소드 parameter 반환
	 * 		- null이 아닌 경우엔 Optional 객체가 보유한 객체의 내용 값이 출력
	 */
	@Test
	public void m4() {
		String v = null;
		
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println(opt.orElse("null인경우 실행"));		//출력 값 : null인 경우 실행
		
		Optional<String> opt2 = Optional.ofNullable("String**");
		System.out.println(opt2.orElse("null인경우 실행"));	//출력 값 : String**
		
//		System.out.println(v.length()); //null
		System.out.println("정상실행");
	}
}














