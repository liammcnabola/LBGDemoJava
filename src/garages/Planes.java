package garages;

public class Planes extends Vehicle {

	private int wingSpan;

	public Planes() {
		super();
	}

	public Planes(String name, int age, double price, int wingSpan) {
		super(name, age, price);
		this.wingSpan = wingSpan;

	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public void printWingSpan() {
		System.out.println("Wing Span:   " + wingSpan + "ft.");
	}
}
