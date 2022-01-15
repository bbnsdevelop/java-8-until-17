package br.com.bbnsdevelop.v1_examples.builder;

import br.com.bbnsdevelop.v1_examples.builder.builders.CarBuilder;
import br.com.bbnsdevelop.v1_examples.builder.builders.SportCarBuilder;
import br.com.bbnsdevelop.v1_examples.builder.builders.TruckBuilder;
import br.com.bbnsdevelop.v1_examples.builder.cars.Car;
import br.com.bbnsdevelop.v1_examples.builder.cars.SportCar;
import br.com.bbnsdevelop.v1_examples.builder.cars.Truck;
import br.com.bbnsdevelop.v1_examples.builder.director.Director;

public class Main {
	
	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder builder = new CarBuilder();
		director.constructSedanCar(builder);
		
		Car car = builder.build();
		
		System.out.println(car);
		
		
		TruckBuilder truckBuilder = new TruckBuilder();
		director.constructTruck(truckBuilder);
		
		Truck truck = truckBuilder.build();
		System.out.println(truck.result());
		
		SportCarBuilder sportCarBuilder = new SportCarBuilder();
		director.constructSportCar(sportCarBuilder);
		
		SportCar sportCar = sportCarBuilder.build();
		System.out.println(sportCar);
	}

}
