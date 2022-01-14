package br.com.bbnsdevelop.builder.cars;

import br.com.bbnsdevelop.builder.components.CarType;
import br.com.bbnsdevelop.builder.components.Engine;
import br.com.bbnsdevelop.builder.components.TransmissionType;

public class SportCar extends Car{
	
	private String color;

	public SportCar(CarType carType, int seats, Engine engine, TransmissionType transmissionType, String color) {
		super(carType, seats, engine, transmissionType);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "SportCar [color=" + color + ", CarType=" + getCarType() + ", Seats=" + getSeats()
				+ ", Engine=" + getEngine() + ", TransmissionType=" + getTransmissionType() + "]";
	}
	
	
	
	

}
