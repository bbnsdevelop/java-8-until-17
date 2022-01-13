package br.com.bbnsdevelop.solid.Isp.goodpractice;

public class Car extends Vehicle implements IVehicle, IVehicleCar{

	private int seats;
	

	public Car(String color, String year, double engine, int seats) {
		configureCar(color, year, engine, seats);
	}

	@Override
	public void configureCar(String color, String year, double engine, int seats) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		this.seats = seats;
		System.out.println("Creating a new car: ".concat(color).concat(" ").concat(year).concat(" ")
				.concat(String.valueOf(engine)).concat(" ").concat("with ").concat(String.valueOf(seats)).concat(" seats"));
		startVehicle();

	}

	@Override
	public void startVehicle() {
		System.out.println("Turn on");

	}

}
