package garages;

public class Bike extends Vehicle {

	private boolean wheels;

	public Bike() {
		super();
	}

	public Bike(String name, int age, double price, boolean wheels) {
		super(name, age, price);
		this.wheels = wheels;
	}

	public boolean isWheels() {
		return wheels;
	}

	public void setWheels(boolean wheels) {
		this.wheels = wheels;
	}

//	@Override
//	public void print() {
//		System.out.println("Has Wheels:   " + this.wheels);
//
//	}
//	public void printWheels() {
//		System.out.println("Wheels:  " + wheels);
//	}
}
