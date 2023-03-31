package br.com.bbnsdevelop.v1_examples.factory.method;

import br.com.bbnsdevelop.v1_examples.factory.method.vehicles.Car;
import br.com.bbnsdevelop.v1_examples.factory.method.vehicles.IVehicle;

public class CarTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Car();
	}

}
