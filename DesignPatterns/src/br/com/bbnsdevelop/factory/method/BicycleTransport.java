package br.com.bbnsdevelop.factory.method;

import br.com.bbnsdevelop.factory.method.vehicles.Bicycle;
import br.com.bbnsdevelop.factory.method.vehicles.IVehicle;

public class BicycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {		
		return new Bicycle();
	}

}
