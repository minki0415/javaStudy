//domain �ܾ�� ������ ���� �ǹ��ϱ⵵ ��
package model.domain;  

public class CustomerDTO {
	private String id;//��� ����
	private int pw;
	
	/* �ڹٴ� ������ �ʼ�
	 * �ڵ�� ������ �� ���� ��� �⺻ �����ڸ� �ڵ�����
	 * �ʿ信 ���ؼ� ��� ������ �ʱ�ȭ �ϴ� �����ڴ� ���� ����
	 * 	- ���� ���� : �⺻������ ���ߵ� �ʼ� 
	 * 
	 * ��ü ���� ����
	 * 	- ȣ���� CustomerDTO ���� ������ ���������� Object ��ü�� ���� ����
	 * 	CustomerDTO c = new CustomerDTO("��", 20);// ���ڿ�, ���� �ΰ��� �����͸� ���� ������ �޸� ����
	 */
	public CustomerDTO() {}
	public CustomerDTO(String id, int pw) {
//		super(); �����ÿ��� �ڵ� �߰�, �� super([..]) �ڵ��ÿ��� �ڵ� ���� �Ұ�
		this.id = id;
		this.pw = pw;
	}
	
	//ȣ���� ��� id���� ���ڿ� Ÿ�Կ� �°� ��ȯ
	//ȣ���� �޼ҵ� : caller / ȣ��Ǿ� ����Ǵ� �޼ҵ� : walker
	//getter �޼ҵ�
	public String getId() {
		return id;
	}
	//setter �޼ҵ�
	public void setId(String id) { //���� ����, parameter, argument, �Ű�����, �Ű�����, �μ�..
		this.id = id;  //�� ����, ��� ���� �ʱ�ȭ
	}
	
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	
	/* �ַ� domain(���� ǥ���ϴ�) Ŭ������ ������� �����Ǵ� ��ü���� println() ��½ÿ�
	 * toString() �ڵ� ȣ��
	 * ������ ������ ���ؼ� java.lang.Object���� �޼ҵ�� ������ ��ü�� �ּҰ� ��ȯ
	 * �ּҰ��� ���߽ÿ��� �����δ� ����� ���� ����
	 * ���� Ŭ�������� ������ 
	 */
	@Override   //������ �޼ҵ� ���� = �ɼ�
	public String toString() {
		return "CustomerDTO [id=" + id + ", pw=" + pw + "]";
	}
}