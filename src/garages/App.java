package garages;


public class App {

	public static void main(String[] args) {

		car Ford = new car();
		Ford.setName("Ford");
		Ford.setAge(5);
		Ford.setPrice(17500.99);
		Ford.print();


		bike mtnBike = new bike();
		mtnBike.setName("Explorer");
		mtnBike.setAge(2);
		mtnBike.setPrice(689.95);
		mtnBike.print();

		planes Boeing = new planes();
		Boeing.setName("Boeing 747");
		Boeing.setAge(23);
		Boeing.setPrice(675000.99);
		Boeing.print();

	}

}
