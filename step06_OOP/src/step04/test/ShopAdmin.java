package step04.test;

public class ShopAdmin {
	
	public static Person[] publicData() {
		Person[] p = {new Customer("������", 30, "VIP"),
				      new Employee("���缮", 20, "��ȹ��")};
		
		return p;		
	}
	
	
	public static void main(String[] args) {
		Person[] arr = publicData();
		Customer cus = (Customer)arr[0];
		System.out.println("------toString------");
		System.out.println(cus);
		System.out.println("------grade------");
		System.out.println(cus.getGrade());

	}
	
//	public static void print(Person[] p) {
//	Person[] arr = publicData();
//	System.out.println(arr);
//}
//
//public static void main(String[] args) {
//	print(publicData());
//
//}
	
}