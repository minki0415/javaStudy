/* ClassNotFoundException
 * ArrayIndexOutOfBoundsException
 * 
 * 1. �ǽ�
 * 		����/������ ��Ȳ ����
 * 
 * 2. �迭 ����
 * 		������ ok / ����� ArrayIndexOutOfBoundsException �߻�
 * 		���࿹�� �߻��� �� �����ؼ� ��, try~catch��� ����ó�� ���� ���� ���� �����ؼ� �������
 * 		���� �߻� �ÿ��� �ý��� stop
 * 
 * 3. class �ε� ����
 * 		����ó�� ������ ���� ��쿡 ��Ÿ �������� Ȯ�� ���� ������ ���� �߻� 
 * 		ClassNotFoundException
 * 		����ó�� ���� ������ �ʼ�, �Ŀ� �����ؼ� ���� �߻� ���� Ȯ��
 * 		���� �߻��ߴ��� ���α׷� ������ ������ ���� ����
 * 
 */

package step07.exception;

class A{
	static {
		System.out.println("byte code�� �޸𸮿� �ε��� �ڵ� ����Ǵ� ���");
	}
}

public class Exception1 {
	

	public static void main(String[] args) {
		
		System.out.println(10/2);
/*
 * ArithmeticException : ���� ����
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at step07.exception.Exception1.main(Exception1.java:32)

 */
		
		int [] i = {1, 2};  //index 0��°, 1��° ����, length ���� �ڵ� ���� (length = 2)
		System.out.println(i[5]);  //�������� �ʴ� �޸� ���� �����͸� ���
//		System.out.println(i[1]);  // index 5 -> 1, ��������
		System.out.println(100);
		
		//�����ϴ� �Ϲ� byte code ��, class���� �޸𸮿� �ε��ϴ� API
		/* forName() ������ ����
		 * 1. ��� : parameter ���ڿ��� ���ԵǴ� Ŭ������ �޸𸮿� �ε�
		 * 
		 * 2. �߻� ������ ����� ��
		 * 		1) ���� �ε�
		 * 			- ���� �����ϴ� Ŭ������ �ְ�, ��Ÿ ���� �ڵ�
		 * 		2) ������ �ε� 
		 * 			- class�� �������� ���� ����
		 * 			- class�� ������ ��Ÿ �߻�
		 * 
		 * 3. ���
		 * 		- Ȥ�� ������ �ε��� �ڵ� �󿡼� �߻� ������ ����ؼ�
		 * 			�޼ҵ� ���𱸿��� ���
		 * 	
		 * public static Class forName(String className)
                        throws ClassNotFoundException		 
		 */
//		try {
//			Class.forName("step07.exception.A");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}

	
}
/* ��������
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
 * Index 5 out of bounds for length 2 
 * at step07.exception.Exception1.main(Exception1.java:7)
 * 
 */
