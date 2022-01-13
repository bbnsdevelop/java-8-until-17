package br.com.bbnsdevelop.factory.abstracts.boats;

public class Boat implements IBoat {

	@Override
	public void startRoute() {
		tide();
		getCargo();
		System.out.println("The boat is ready to navigate");

	}

	@Override
	public void getCargo() {
		System.out.println("The cargo has been loaded");

	}

	@Override
	public void tide() {
		System.out.println("low tide");

	}

}
