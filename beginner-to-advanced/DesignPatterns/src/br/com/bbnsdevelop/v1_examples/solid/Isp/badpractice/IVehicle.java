package br.com.bbnsdevelop.v1_examples.solid.Isp.badpractice;

public interface IVehicle {
	
	void configureCar(String color, String year, double engine, int seats);
	void configureMotocycle(String color, String year, double engine);
	void startVehicle();

}
