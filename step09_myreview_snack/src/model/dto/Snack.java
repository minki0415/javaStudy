package model.dto;

public class Snack {
	
	private String name;    
	private String brand;
	private int kcal;
	private int price;
	
	public Snack() {}

	public Snack(String name, String brand, int kcal, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.kcal = kcal;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMake() {
		return brand;
	}

	public void setMake(String brand) {
		this.brand = brand;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Snack [name=" + name + ", brand=" + brand + ", kcal=" + kcal + ", price=" + price + "]";
	}
	
}
