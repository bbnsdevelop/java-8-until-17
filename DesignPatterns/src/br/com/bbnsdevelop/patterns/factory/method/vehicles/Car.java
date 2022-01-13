package br.com.bbnsdevelop.patterns.factory.method.vehicles;

public class Car implements IVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Starting route");

	}

	@Override
	public void getCargo() {
		System.out.println("taking passenger");

	}

}
