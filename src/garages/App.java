package garages;



public class App {

	public static void main(String[] args) {

		Car Ford = new Car();
		Ford.setName("Ford");
		Ford.setAge(5);
		Ford.setPrice(17500.99);
		Ford.print();
		Ford.setBootSize(2);
		Ford.displayBoot();


		Bike mtnBike = new Bike();
		mtnBike.setName("Explorer");
		mtnBike.setAge(2);
		mtnBike.setPrice(689.95);
		mtnBike.print();
		mtnBike.setWheels(true);
//		mtnBike.printWheels();


		Planes Boeing = new Planes();
		Boeing.setName("Boeing 747");
		Boeing.setAge(23);
		Boeing.setPrice(675000.99);
		Boeing.print();
		Boeing.setWingSpan(242);
//		Boeing.printWingSpan();


		Vehicle v1 = new Car("BMW", 12, 6000.55, 3);
		Vehicle v2 = new Car("Ibiza", 4, 12000.95, 2);
		Vehicle v3 = new Planes("KLM", 12, 400000.95, 242);
		Vehicle v4 = new Bike("BMX", 1, 799.99, true);

		Vehicle[] vehicles = { v1, v2, v3, v4 };
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}
	}


}
