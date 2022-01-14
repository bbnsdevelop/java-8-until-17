package br.com.bbnsdevelop.builder.cars;

import br.com.bbnsdevelop.builder.components.CarType;
import br.com.bbnsdevelop.builder.components.Engine;
import br.com.bbnsdevelop.builder.components.TransmissionType;

public class Car {
	
	private final CarType carType;
	private int seats;
	private Engine engine;
	private final TransmissionType transmissionType;
	
	
	public Car(CarType carType, int seats, Engine engine, TransmissionType transmissionType) {
		super();
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmissionType = transmissionType;
	}


	public CarType getCarType() {
		return carType;
	}


	public int getSeats() {
		return seats;
	}


	public Engine getEngine() {
		return engine;
	}


	public TransmissionType getTransmissionType() {
		return transmissionType;
	}


	@Override
	public String toString() {
		return "Car [carType=" + carType + ", seats=" + seats + ", engine=" + engine + ", transmissionType="
				+ transmissionType + "]";
	}
	
	
	
	
	

}
