package br.com.bbnsdevelop.v1_examples.factory.method;

import br.com.bbnsdevelop.v1_examples.factory.method.vehicles.IVehicle;
import br.com.bbnsdevelop.v1_examples.factory.method.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorcycle();
	}

}
