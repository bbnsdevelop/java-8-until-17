package br.com.bbnsdevelop.factory.abstracts.aircrafts;

public class Airplane implements IAircraft {

	@Override
	public void startRoute() {
		wind();
		getCargo();
		
		System.out.println("starting takeoff");
	}

	@Override
	public void getCargo() {
		System.out.println("passengers on board, authorized flight.");

	}

	@Override
	public void wind() {
		System.out.println("wind at 50km/h");

	}

}
