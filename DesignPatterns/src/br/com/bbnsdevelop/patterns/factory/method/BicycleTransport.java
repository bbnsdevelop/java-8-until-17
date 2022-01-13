package br.com.bbnsdevelop.patterns.factory.method;

import br.com.bbnsdevelop.patterns.factory.method.vehicles.Bicycle;
import br.com.bbnsdevelop.patterns.factory.method.vehicles.IVehicle;

public class BicycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {		
		return new Bicycle();
	}

}
