package br.com.bbnsdevelop.v1_examples.factory.abstracts.landvehicles;

public class Car implements ILandVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Car: Start the route.");
	}

	@Override
	public void getCargo() {
		System.out.println("taking passenger");
	}

}
