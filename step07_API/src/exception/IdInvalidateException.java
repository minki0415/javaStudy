package exception;

public class IdInvalidateException extends Exception{
	
	public IdInvalidateException() {}
	
	//Ư�� �޼����� ��Ȳ�� ������ ���� �������� �ǹ�
	public IdInvalidateException(String m) {  
		super(m);
	}
	
}