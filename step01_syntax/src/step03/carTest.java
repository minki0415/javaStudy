package step03;

public class carTest {

	public static void main(String[] args) {
		
		car c1 = new car();
		car c2 = new car();
		
		c1.setMake("Hyundai");
		c1.setModel("Avante");
		c1.setNum(1234);

		c2.setMake("Kia");
		c2.setModel("K5");
		c2.setNum(5678);
		
		System.out.println(c1.getMake()+" "+c1.getModel()+" "+c1.getNum());
		System.out.println(c2.getMake()+" "+c2.getModel()+" "+c2.getNum());

	}

}
