package br.com.bbnsdevelop.solid.Isp.goodpractice;

public class Vehicle {

	protected String color;
	protected String year;
	protected Double engine;	

	public Vehicle() {

	}

	public Vehicle(String color, String year, Double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;
	}

	void startVehicle() {
		System.out.println("Turn on");
	}
	
	
	

}
