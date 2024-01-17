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

		Garage myGarage = new Garage("Confusing garage");

		myGarage.storeVehicle(new Car("Fiesta", 4, 5555.99, 4));
		myGarage.storeVehicle(new Car("Focus", 5, 6666.95, 4));
		myGarage.storeVehicle(new Bike("Motorbike", 3, 1000.00, true));
		myGarage.print();


	}
}
