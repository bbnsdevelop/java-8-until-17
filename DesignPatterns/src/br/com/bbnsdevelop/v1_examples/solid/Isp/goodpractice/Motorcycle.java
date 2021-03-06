package br.com.bbnsdevelop.v1_examples.solid.Isp.goodpractice;

public class Motorcycle extends Vehicle implements IVehicle, IVehicleMotorcycle {

	public Motorcycle(String color, String year, double engine) {
		configureMotocycle(color, year, engine);
	}

	
	@Override
	public void configureMotocycle(String color, String year, double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		System.out.println("Creating a new motorcycle: ".concat(color).concat(" ").concat(year).concat(" ").concat(String.valueOf(engine)).concat(" engine capacity"));
		startVehicle();

	}

	@Override
	public void startVehicle() {
		System.out.println("Turn on");

	}

}
