package br.com.bbnsdevelop.v1_examples.factory.method.vehicles;

public class Motorcycle implements IVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Starting route");
		System.out.println("Start delivery");

	}

	@Override
	public void getCargo() {
		System.out.println("taking food");

	}

}
