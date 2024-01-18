package garages;

import java.util.Objects;

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
//
	@Override
	public void print() {
		super.print();
		System.out.println("Has Wheels:   " + this.wheels);
	}
//	public void printWheels() {
//		System.out.println("Wheels:  " + wheels);
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(wheels);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return wheels == other.wheels;
	}

}
