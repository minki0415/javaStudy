/* �н�����

* 1. ������ Ÿ�� �н�
* 
* 2. ������ Ÿ���� Ȱ��Ǵ� �������� ��ġ
* 		1) ���, ���� ���� ���� Ÿ��`
* 		- ���� : ������, �޼ҵ� argument�� {} ���ο� ����`
* 		2) ����Ÿ��
* 
* 3. ������ Ÿ�� ����
* 		1) �⺻ Ÿ��(���� Ÿ��, built in Ÿ��)`
* 			(1) �� 8 ����`
* 			(2) class�� �������� ���·�, �ҹ��ڷ�, Ű����� Ÿ���� �̹� ������ ����`
* 			(3) ���� ���� ���� - ������/����/�Ǽ���/������`
* 			(4) ���º��� ������ε� ����ȭ`
* 				- ������ : char, 16bit(�ٱ��� ���� ������)`
* 				- ���� : boolean(true or false)`
* 				- �Ǽ��� : float, 32bit / double, 64bit`
* 				- ������ : byte, 8bit / short, 16bit / int, 32bit / long, 64bit`
* 
* 		2) ��ü Ÿ��(���� Ÿ��, class Ÿ��)`
* 			(1) �⺻�� �ƴ� ��� Ÿ�� �ǹ�`
* 			(2) class�� ������� Ÿ�� ����`
* 			(3) API �� �̹� ���� �����ڵ鿡�� ����϶� �����ϴ� library�� �ټ��� class`
* 				��, Ÿ�� ����`
* 			(4) ���ڿ��� String.java�� �����Ǵ� Ŭ����, ���󵵰� ���Ƽ� �⺻ Ÿ��ó�� ���� ����`
* 			(5) ��ü ���� ����`
* 				Ÿ�� ���� = new ������([..]);`
* 				String ���� = new String([���ڿ�)];`
* 				String ���� = "���ڿ�"; ����ǥ "" ǥ�� ������ �ڵ����� String ��ü ����`
* 			(6) ������ ��ü�� ���� ����Ǵ� �޸� - heap`
* 				heap �޸� Ư¡`
* 				- ��ü�� ����`
* 				- �����Ǵ� ��ü�� ������ ��� ��� ������ ������ ���� ����`
* 				- ��ü�� �޸� ȸ���� garbage collector(GC)`
* 
*/

package step04.datatype;


public class L01DataType {

	String getName() {
		String s = "�缮";
		return s; //�缮�̶�� �����͸� ������ ���ڿ� ��ü ����, ��ȯ�ÿ� �ּ� �� ��ȯ
	}

	Person getPerson() {
		Person p = new Person();
		return p;
	}

	void setName(String name) {
		String n = "���� �̸���:" + name;
	}

	void setPerson(Person p) {
		Person p2 = p;
	}	

	public static void main(String[] args) {
		L01DataType l = new L01DataType();
		String n = l.getName();
		

	}


}