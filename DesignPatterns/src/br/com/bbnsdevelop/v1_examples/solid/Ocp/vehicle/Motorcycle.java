package br.com.bbnsdevelop.v1_examples.solid.Ocp.vehicle;

public class Motorcycle extends Vehicle{
	
	
	public Motorcycle() {
		
	}

	public Motorcycle(String color, String year, Double engine) {
		super(color, year, engine);		
	}

	public void configure() {
		System.out.println("Creating a new motorcycle: ".concat(color).concat(" ").concat(year).concat(" ").concat(engine.toString()).concat(" engine capacity"));
		startVehicle();
	}
	
	

}
