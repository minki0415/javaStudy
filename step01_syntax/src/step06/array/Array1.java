package step06.array;

public class Array1 {
	
	//int ����� �迭 ���� �� ��ȯ, int[] -> ��ȯ Ÿ��
	public static int[] getIntArray() {
		int[] i = {1, 2, 3}; // i�� int�迭 Ÿ���� ���� 
		return i;
		
	}
	
	//int ����� ������ �迭 �޾Ƽ� ���
	//�ݺ��� �߰��н� 
	public static void printArray(int[] v) {
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
	}
	
	//eclipse ����� : ����, �޼ҵ�� ������ ȣ���� ������ ���ÿ� �����ϱ� ���� �����
	//alt + shift + r -> ���� -> Enter
	public static void printArrayFor1(int[] v) {
		for(int i = 0; i < 3; i++) {
			System.out.println(v[i]);
		}
	}
	
	//length - ������ �迭�� �ڵ� �߰��Ǵ� ����(�迭 ũ�� �� ����)
	public static void printArrayFor2(int[] v) {
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	
	// �迭, List ��ü�鿡�� ���Ǵ� �ݺ���
	public static void printArrayForEach(int[] v) {
		 for(int i : v) { //i�� �迭�� �� ����� �����͸� �����ް� �Ǵ� ����
			 System.out.println(i);
		 }
	}
	
	public static void printArrayWhile(int[] v) {
		int i = 0;
		while(i < 3) {
			System.out.println(v[i]);
			i++;
		}
				
	}
	
	public static void main(String[] args) {
		int[] v1 = getIntArray();
		printArray(v1);
		System.out.println("----for----");
		printArrayFor1(v1);
		System.out.println("----while----");
		printArrayWhile(v1);		
		System.out.println("----forEach----");
		printArrayForEach(v1);
		
	}

}
