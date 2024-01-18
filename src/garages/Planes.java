package garages;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(wingSpan);
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
		Planes other = (Planes) obj;
		return wingSpan == other.wingSpan;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Wing Span:   " + wingSpan + "ft.");
	}

}
