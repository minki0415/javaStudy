package model;

// Model class ���� 
public class Model {
	//controller�� ��û���� �Ѹ��� ������ db�κ��� �˻��ؼ�
	//CustomerDTO �����ؼ� ��ȯ
	
	// ��ȯŸ���� CustomerDTO�� getCustomer�޼ҵ� ����
	public static CustomerDTO getCustomer() {
        //          ��ȯŸ��       �޼ҵ�
		
		//CustomerDTO Ÿ�� ��ü c ����
		CustomerDTO c = new CustomerDTO();
		
		//setXxx() �޼ҵ�� id�� encore / pw�� 11 / grade = g ����
		c.setId("encore");
		c.setPw(11);
		c.setGrade('g');
		c.setJob("����");
		
		//��ȯ
		return c;
		
	}
	
	// ������ ��� ��ȯ
	public static CustomerDTO[] getCustomers() {
		
		CustomerDTO[] c = {new CustomerDTO("id1",11, 'g',"����"),  //@NoArgsConstructor 
						   new CustomerDTO("id2",22, 's',"��ȹ")};		
		
		return c;
	}
	
}