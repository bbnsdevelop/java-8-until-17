package br.com.bbnsdevelop.patterns.solid.Ocp.vehicle;

public class Car extends Vehicle{
	
	
	private int seats;

	public Car() {

	}

	public Car(String color, String year, Double engine, int seats) {
		super(color, year, engine);
		this.seats = seats;
	}
	

	public void configure() {
		System.out.println("Creating a new car: ".concat(color).concat(" ").concat(year).concat(" ")
				.concat(engine.toString()).concat(" ").concat("with ").concat(String.valueOf(seats)).concat(" seats"));
		
		startVehicle();
	}
	
	
	

}
