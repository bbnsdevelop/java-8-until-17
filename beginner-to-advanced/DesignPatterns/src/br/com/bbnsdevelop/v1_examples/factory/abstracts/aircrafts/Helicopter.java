package br.com.bbnsdevelop.v1_examples.factory.abstracts.aircrafts;

public class Helicopter implements IAircraft {

	@Override
	public void startRoute() {
		wind();
		getCargo();
		System.out.println("Starting route");

	}

	@Override
	public void getCargo() {
		System.out.println("helicopter propellers, OK");
		System.out.println("passengers on board, authorized flight.");

	}

	@Override
	public void wind() {
		System.out.println("wind at 50km/h");

	}

}
