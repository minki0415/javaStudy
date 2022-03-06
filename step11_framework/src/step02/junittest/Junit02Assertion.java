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
		
		//1. junit �̶�� �����Ϳ� ���� Ȯ�� ����
		assertEquals("Junit", "Junit");
		
		//...
		System.out.println("Junit�� ��쿡�� ����Ǵ� ���� ");
	}

	//@Test
	public void assertTest2() {
		
		//1. null�� ���� Ȯ�� ����
		assertNull("junit", "junit"); // �ι�° parameter�� ���� �ƴϸ� ���� �������� �� ���õ�
		System.out.println("null�� ��쿡�� ����Ǵ� ���� ");
	}
	
	//@Test
	public void assertTest3() {
		
		//1. null�� ���� Ȯ�� ����
		assertNull("null"); // "null"�� null �� �ٸ� 
		System.out.println("null�� ��쿡�� ����Ǵ� ���� ");
	}
	
	//@Test
	public void assertTest4() {
		
		assertTrue(false); //
		System.out.println("true�� ��쿡�� ����Ǵ� ���� ");
	}
	
	//parameter�� �ִ� �޼ҵ� ���� test�ϱ�
	//�� �޼ҵ� ȣ���ϴ� �ٸ� �����ڴ� test�ÿ� �ݵ�� 2��� ���� parameter�� �����ؾ��ϴ� ��Ȳ
//	@Test
	public void assertTest5(int v) {
//		if(v == 2) { // client�� ���Խ�Ű�� ������ ���� �¾�? Ʋ��?
//			//...���� ����
//		}
		assertTrue(v == 2); // �����ڵ鰣�� �ڵ� ����
		//...���� ����
		System.out.println("2�� ����, v = " + v);
		
	}
	
	@Test
	public void callTest() {
		assertTest5(2);
	}
	
	//���� test������ parameter ����
	//�پ��� int ���� ���� �õ�
//	@ParameterizedTest
//	@ValueSource(ints = {1,2,3})
	@ValueSource(ints = {2})	
	public void assertTest6(int v) {
		assertTrue(v == 2);
		System.out.println("2�� ����" + v);
	
	}
	
	/* CSV�� ��� �ʵ带 ��ǥ(, )�� ������ �ؽ�Ʈ ������ �� �ؽ�Ʈ �����̴�.
	 * Ȯ���ڴ� .csv �̸� MIME ������ text/csv�̴�. comma=separated variables ��� �Ѵ�.
	 * 
	 */
//	@ParameterizedTest
//	@CsvSource(value = {"1,��","2, ���缮"})
	public void assertTest7(int age, String name) {
		assertTrue(age == 2 && name.equals("���缮")); //age�� 2, �̸��� ���缮�̾���Ѵ�.
		
		System.out.println("���缮 �¾�");
	
	}
	
}
