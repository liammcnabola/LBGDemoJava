package garages;


public class VehiclesList {

	public static void main(String[] args) {


//		ArrayList<Vehicle> vehicles = new ArrayList<>();
//
//		vehicles.add(new Car("Fiesta", 4, 5555.99, 4));
//		vehicles.add(new Car("Focus", 5, 6666.95, 4));
//		vehicles.add(new Planes("EasyJet", 12, 95999.99, 243));
//		vehicles.add(new Bike("Motorbike", 3, 1000.00, true));
//
//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
//		}

		Garage myGarage = new Garage("The garage");

		myGarage.storeVehicle(new Car("Fiesta", 4, 5555.99, 4));
		myGarage.storeVehicle(new Car("Focus", 5, 6666.95, 4));
		myGarage.storeVehicle(new Bike("Motorbike", 3, 1000.00, true));
		myGarage.print();
		myGarage.withdrawVehicle(new Car("Fiesta", 4, 5555.99, 4));
		myGarage.print();

// Equals Ex: 

		Car c1 = new Car("BMW", 6, 9999.99, 3);
		Car c2 = new Car("Chevvie", 12, 8888.88, 8);
		Bike b1 = new Bike("Learner", 5, 600.00, true);
		Bike b2 = new Bike("Learner", 5, 600.00, true);

		System.out.println("c1.equals(c2):  " + c1.equals(c2)); // false
		System.out.println("c1.equals (c1): " + c1.equals(c1)); // true
		System.out.println("b1.equals (b2): " + b1.equals(b2)); // true
	}

}
