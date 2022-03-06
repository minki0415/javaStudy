/* �н�����
 * 
 * Optional API �н�
 * 1. list/map/set ó�� ������ ���� ����
 * 
 * 2. �ʿ伺 
 * 		- ���� �� �߻������� ���� �߿� NullPionterException ��ġ
 * 			- java.lang.RuntimeException
 * 			- try ~ catch ���� �� ���� �ÿ��� �߰�
 * 		- NullPionterException �߻����� �ʰ� �������� ����ó�� ���� �����ϰ� �ϴ� ���
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
			System.out.println(v.length());	//NullPionterException �߻�	
//		}
		System.out.println("�������"); //���� �߻����� ���� �Ұ�
	}
	
	
	/* null ó���� API
	 * 1. ofNullable() - Optional ��ü ���� �޼ҵ�
	 * 		- parameter
	 * 			1) null : Optional.empty ���
	 * 			2) ��ü : Optional[��ü Ÿ��] ���
	 * 
	 * 2. isPresent() - Optional ��ü ���� ����� ��ü ���� ���� Ȯ�� �޼ҵ�
	 * 		- empty �� ��� : false ��ȯ
	 * 		- not empty�� ��� : true ��ȯ
	 * 
	 * 3. ifPresent() - if ���ǽİ� ���� ��� 
	 * 		- empty : null �ǹ�, NullPointException �߻����� -> ���� ��ŵ
	 * 		- not empty : ���� ����
	 * 		
	 */
	//Optional
//	@Test
	public void m2() {
		String v = null;
		
		Optional<String> opt = Optional.ofNullable(v);
		Optional<String> opt2 = Optional.ofNullable("String");
		
		System.out.println(opt); //��� �� : Optional.empty
		System.out.println(opt2); //��� �� : Optional[String]
		
		System.out.println(opt.isPresent()); //��� �� : false , null�̸� false
		System.out.println(opt2.isPresent()); //��� �� : true, null�� �ƴϸ� true
		
		
		//null ���ο� �����ϰ� ���� ����Ǵ� �ڵ�
		//data ������ null�� ��� {} ������ ���� skip
		opt.ifPresent((data) -> {
			System.out.println(v.length());		//��� �� : �������, null�ε��� �������
		});	
		
		
		//Optional API  ���ÿ��� ������ �߻��ȴ� �ϴ��� �ϴ� ���� �������, ������ ���� ���� ���� ����
		System.out.println("�������"); 
	}
	
	/* 1. of() : null ����
	 *		- null Optional ��ü ������ NullPointException �߻�
	 *		- of() ��� �ÿ��� ifPresent() �ǹ� ����
	 * 
	 */
//	@Test
	public void m3() {
		String v = null;
		
		//.of() �޼ҵ�� null�� ��� NullpointException �߻�
		Optional<String> opt = Optional.of("v");
		Optional<String> opt2 = Optional.of("string");
		
		System.out.println(opt);
		System.out.println(opt2);
		
		System.out.println(opt.isPresent());
		System.out.println(opt2.isPresent());
		
//		System.out.println(v.length()); //null
		
		System.out.println("�������");
	}
	
	
	/* orElse() 
	 * 		- null�� ��츦 ����ؼ� �����ϰ��� �ϴ� ������ ���� ��� ����
	 * 		- null�� ��쿣 orElse() �޼ҵ� parameter ��ȯ
	 * 		- null�� �ƴ� ��쿣 Optional ��ü�� ������ ��ü�� ���� ���� ���
	 */
	@Test
	public void m4() {
		String v = null;
		
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println(opt.orElse("null�ΰ�� ����"));		//��� �� : null�� ��� ����
		
		Optional<String> opt2 = Optional.ofNullable("String**");
		System.out.println(opt2.orElse("null�ΰ�� ����"));	//��� �� : String**
		
//		System.out.println(v.length()); //null
		System.out.println("�������");
	}
}














