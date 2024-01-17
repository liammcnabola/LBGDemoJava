package garages;

public class Vehicle {

	private String name;
	private int age;
	private double price;

	public Vehicle() {
		super();
	};

	public Vehicle(String name, int age, double price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public void print() {
		System.out.println("Vehicle Name:  " + this.name);
		System.out.println("Vehicle Age (years):  " + this.age);
		System.out.println("Vehicle Price:  £" + this.price);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
