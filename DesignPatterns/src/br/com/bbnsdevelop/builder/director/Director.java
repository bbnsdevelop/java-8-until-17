package br.com.bbnsdevelop.builder.director;

import br.com.bbnsdevelop.builder.builders.IBuilder;
import br.com.bbnsdevelop.builder.builders.IBuilderSportCar;
import br.com.bbnsdevelop.builder.components.CarType;
import br.com.bbnsdevelop.builder.components.Engine;
import br.com.bbnsdevelop.builder.components.TransmissionType;

public class Director {
	
	public void constructSedanCar(IBuilder builder) {
		builder.setCarType(CarType.SEDAN);
		builder.setSeats(5);
		builder.setTransmissionType(TransmissionType.AUTOMATIC);
		builder.setEngine(new Engine(1600));
	}
	
	
	public void constructTruck(IBuilder builder) {
		builder.setCarType(CarType.TRUCK);
		builder.setSeats(2);
		builder.setTransmissionType(TransmissionType.MANUAL);
		builder.setEngine(new Engine(13000));
	}
	
	public void constructSportCar(IBuilderSportCar builder) {
		builder.setCarType(CarType.SPORTCAR);
		builder.setSeats(2);
		builder.setTransmissionType(TransmissionType.AUTOMATIC_SEQUENTIAL);
		builder.setEngine(new Engine(15000));
		builder.setColor("Yellow");
	}

}
