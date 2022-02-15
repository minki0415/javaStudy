//����ó�� ���� �н�
package step07.exception;

class B{
	static {
		System.out.println("B class �ε�");
	}
}

public class Exception2 {

	public static void m1() {
		System.out.println("���� �߻� ������ ���� ����");
	}	
	
	//��Ÿ�� ����
	public static void m2() {
		System.out.println("���� �߻� ������ ������ ���� ����");
		System.out.println(10/0);
		
		System.out.println("try~catch ���� ���� ������ ���ܹ߻� �� ���� �Ұ�");
	}
	
	//������ ���� : try~catch ���� �ʼ�
	public static void m3() {
		try { //���� �� ���� �߻� ���ɼ� �ִ� �ڵ� ���
			
			System.out.println("�ε� ��");
			Class.forName("step07.exception.B==="); //�����߻� ���ɼ� �ִ� ���� 
			System.out.println("�ε� ��"); //���� �߻��� ���� ����
			
		}catch(ClassNotFoundException e) { //���࿹�� �߻��� ó���ϴ� ���
			System.out.println("B �ε� �� ���� �߻�");
		}finally { 
			//�߰��� �ʼ� ������ �����ϴ� ��� : �ý��� �ڿ� ��ȯ �������� ��� 
			System.out.println("���� �߻� ���ο� �����ϰ� 99% ���� ���� ���");
		}
		
		System.out.println("�� ������ ����Ǵ� ����");
	}
	
	//���� �߻��ؼ� ���� ȣ���� ������ throws �غ���
	//m4(0 ȣ���� ������ ���� ó��
	//java.lang.Exception Ŭ������ Ȱ��
	//���� - ���� playdata�� �ƴϸ� ���� �߻� 
	//! - ����������, !true -> false. !false -> true
	/* throws : body���� �߻��� �� �ִ� ���ܸ� ȣ���� ������ ������ ���� ���𱸿� ���̴� Ű����
	 * throw : �޼ҵ� body���� ���� ��Ȳ�� ���ܸ� �����ؼ� ������ Ű����
	 */
	public static void m4(String v) throws Exception{
		//playdata�� �ƴ� ��츸 true�� �Ǵ� ���ǽ�
		//if ������ true�� ���, if ��� ��, ���ܰ�ü ������ ���� �������� �޼ҵ尡 �ڵ� ����ȴ�.
		if(!v.equals("playdata")) {
			//Exception message ��� ������ �ʱ�ȭ�ϴ� ������
			throw new Exception("playdata�� �ƴ� ���� ���� �ɰ�");
		}
		
		System.out.println("playdata�� ��쿡�� ����Ǵ� ������");
		
	}
	
	public static void main(String[] args) {
//		m1();
//		m2(); //�߻��� ���� Ȯ��
//		m3();
		try {
			m4("playdata2");
		} catch (Exception e) {
			//System.out.println(e.getMessage());//���� ��ü �����ڿ� ������ parameter�� ��ȯ�ϴ� �޼ҵ�
			e.printStackTrace(); // �߻��� ���� �ҽ����� �����丮 ���
		}
		
	}
	
}
