package br.com.bbnsdevelop.v1_examples.factory.method.vehicles;

public class Bicycle implements IVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("You need to navigate the route on the bike path");
		System.out.println("Start delivery");

	}

	@Override
	public void getCargo() {
		System.out.println("taking food");

	}

}
