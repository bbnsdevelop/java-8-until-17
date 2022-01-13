package br.com.bbnsdevelop.patterns.factory.method;

import br.com.bbnsdevelop.patterns.factory.method.vehicles.Car;
import br.com.bbnsdevelop.patterns.factory.method.vehicles.IVehicle;

public class CarTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Car();
	}

}
