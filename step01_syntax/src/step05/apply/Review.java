package step05.apply;

public class Review {
	
	//static ���� ����
	static String data2 = "lmnop";
	
	
	public static void main(String[] args) {
		
		//���� �� 
		Review r = new Review();
	
		//java.lang.Math Ŭ������ �޼ҵ� Ȱ�� 
		//13�� 7 �߿��� ū �� ���
		System.out.println(Math.max(13, 7));
		
		//java.lang.Integer Ŭ������ �޼ҵ� Ȱ��
		//���ڿ����� d ����ϱ�
		String data1 = "abc de";
		System.out.println(data1.charAt(4));
		
		//static ���� ���� �� o ����ϱ�
		System.out.println(data2.charAt(3));
		
		//3���� ������� static ���� ����ϱ�
		System.out.println("Ŭ������.�޼ҵ�� :"+ Review.data2);
		System.out.println("�޼ҵ�� :"+ data2);
		System.out.println("����������.�޼ҵ�� :"+ r.data2);
			
		}
				
}

