package garages;

public class Car extends Vehicle {

	private int bootSize;

	public Car() {
		super();
	}

	public Car(String name, int age, double price, int bootSize) {
		super(name, age, price);
		this.bootSize = bootSize;
		;
	}

	public int getBootSize() {
		return bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;

	}

	public void displayBoot() {
		System.out.println("Boot Size:  " + this.bootSize + "ft");
	}
}

