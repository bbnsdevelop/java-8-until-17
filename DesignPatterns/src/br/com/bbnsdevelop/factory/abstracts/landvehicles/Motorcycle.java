package br.com.bbnsdevelop.factory.abstracts.landvehicles;

public class Motorcycle implements ILandVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Motorcycle: Starting route");
		System.out.println("Start delivery");

	}

	@Override
	public void getCargo() {
		System.out.println("Taking food or package");

	}

}
