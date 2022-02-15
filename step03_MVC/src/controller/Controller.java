package controller;

//�ʿ��� Ŭ���� import
import model.CustomerDTO;
import model.Model;
import view.EndView;

//Controller Ŭ���� ����
public class Controller {
	
	//CustomerDTO���� ������ ��ü�� Model���� ������ �ҷ��ͼ� Endview ���� print
	//1 ��û - �Ѹ� �� ���� ���� | 2 ��û - ��� �� ���� ���� | 1�Ǵ� 2�� �ƴ϶�� �߸��� ��û
	/* ���� - 1�ΰ�? 2�ΰ�? 1�Ǵ� 2�� �ƴѰ�?
	 * ���� �� ������(����� ������) : ==
	 */
	public static void reqRes(int flag) {
		if(flag == 1) {
			EndView.print(Model.getCustomer());			
		}else if(flag == 2) {
			/* EndView.printAll(Model.getCustomers()); �������
			 * Model.getCustomers()
			 * -> Encview.printAll()
			 * 	-> ;
			 */
			EndView.printAll(Model.getCustomers());
		}else {
			EndView.printMsg("�߸��� ��û�Դϴ�. Ȯ���Ͻʽÿ�.");
		}
		
	}
}
