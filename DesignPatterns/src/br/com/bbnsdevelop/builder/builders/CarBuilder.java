package br.com.bbnsdevelop.builder.builders;

import br.com.bbnsdevelop.builder.cars.Car;
import br.com.bbnsdevelop.builder.components.CarType;
import br.com.bbnsdevelop.builder.components.Engine;
import br.com.bbnsdevelop.builder.components.TransmissionType;

public class CarBuilder implements IBuilder {

	private CarType carType;
	private int seats;
	private Engine engine;
	private TransmissionType transmissionType;

	@Override
	public void setCarType(CarType carType) {
		this.carType = carType;

	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;

	}

	@Override
	public void setTransmissionType(TransmissionType transmissionType) {
		this.transmissionType = transmissionType;

	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;

	}
	
	public Car build() {
		return new Car(carType, seats, engine, transmissionType);
	}

}
