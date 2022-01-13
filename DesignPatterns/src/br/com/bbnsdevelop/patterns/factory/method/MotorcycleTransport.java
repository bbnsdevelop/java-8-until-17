package br.com.bbnsdevelop.patterns.factory.method;

import br.com.bbnsdevelop.patterns.factory.method.vehicles.IVehicle;
import br.com.bbnsdevelop.patterns.factory.method.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorcycle();
	}

}
