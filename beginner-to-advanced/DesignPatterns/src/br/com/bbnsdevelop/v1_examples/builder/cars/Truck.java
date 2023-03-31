package br.com.bbnsdevelop.v1_examples.builder.cars;

import br.com.bbnsdevelop.v1_examples.builder.components.CarType;
import br.com.bbnsdevelop.v1_examples.builder.components.Engine;
import br.com.bbnsdevelop.v1_examples.builder.components.TransmissionType;

public class Truck {

	

	private final CarType carType;
	private int seats;
	private Engine engine;
	private final TransmissionType transmissionType;
	
	public Truck(CarType carType, int seats, Engine engine, TransmissionType transmissionType) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmissionType = transmissionType;
	}
	
	
	public String result() {
		String truck = "Truck with motor: " + engine.getPower() + "\n";
		truck += "Transmission: "+ transmissionType;
		return truck;
	}
	
}
