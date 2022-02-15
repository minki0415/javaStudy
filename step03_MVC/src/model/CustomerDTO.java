package model;

import lombok.AllArgsConstructor;
import lombok.Getter; //getXxx() �޼ҵ� �ڵ�����
import lombok.Setter; //setXxx() �޼ҵ� �ڵ�����
import lombok.ToString;
import lombok.NoArgsConstructor;  // ������ �ڵ� ����, �Ķ���Ͱ� ���� �⺻ ������ �ڵ� ����

// lombok ������̼�
@NoArgsConstructor //�⺻������(�Ķ���Ͱ� ���� ������) �ڵ�����
@AllArgsConstructor   //Ŭ������ �����ϴ� ��� �ʵ忡 ���� ������ �ڵ����� 
@Getter
@Setter
@ToString

// CustomerDTO class ����
public class CustomerDTO {
	
	//���� ���� 
	//Getter, Setter�θ� ������ �� �ֵ��� private���� ����
	private String id; 
	private int pw;
	private char grade; //g(gold), s(silver) �� ������ OK �����ϴٰ� ����
	private String job;
	
	//grade ���� ��ȿ�� ���� ���� ������ ���ǽ� ����(��ȿ�� ����)
	//��ȿ�� �����͸� ���� �����ϰ� �ϴ� rule
	//���� Ÿ�Ը� �´ٰ� �ؼ� ���� ������ ��Ȳ�� ����
	//������ �ܺο��� ȣ�� �Ұ����ϰ� ���� ���� ��ȿ�� �ڵ�� ���� �Ŀ��� ����
	//���� ���� : ������ �ܺο��� ����(private) / ��ȿ�� �ڵ�� ���� �޼ҵ�� ���� ���� ���(public)
	public void setGrade(char grade) {
		if(grade == 'g' || grade == 's' ) {
			this.grade = grade;
		}else {
			System.out.println("��ȿ�� ���");
		}
	}
}
