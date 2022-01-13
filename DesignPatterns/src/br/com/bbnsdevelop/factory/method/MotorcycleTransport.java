package br.com.bbnsdevelop.factory.method;

import br.com.bbnsdevelop.factory.method.vehicles.IVehicle;
import br.com.bbnsdevelop.factory.method.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorcycle();
	}

}
