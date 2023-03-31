package br.com.bbnsdevelop.v1_examples.factory.method;

import br.com.bbnsdevelop.v1_examples.factory.method.vehicles.Bicycle;
import br.com.bbnsdevelop.v1_examples.factory.method.vehicles.IVehicle;

public class BicycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {		
		return new Bicycle();
	}

}
