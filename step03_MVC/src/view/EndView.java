package view;

//�ʿ��� Ŭ���� import
import model.CustomerDTO;

//EndView class ����
public class EndView {
	
	//CustomerDTO ��ü c�� ����ִ� ���� ����ϴ� �޼ҵ� ����
	public static void print(CustomerDTO c) {
		System.out.println(c.getId()+" "+ c.getGrade());
		
	}
	
	//��� �� ���� ���
	//forEach / println() �������� �� ��½� toString() �ڵ� ȣ��
	public static void printAll(CustomerDTO[] all) {
		for(CustomerDTO v : all) {
			System.out.println(v); // v.toStringa
		}
		
	}
	
	public static void printMsg(String msg) {
		System.out.println(msg);
	}

}
