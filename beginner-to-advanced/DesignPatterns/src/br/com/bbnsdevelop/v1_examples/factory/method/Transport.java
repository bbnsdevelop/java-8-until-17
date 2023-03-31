package br.com.bbnsdevelop.v1_examples.factory.method;

import br.com.bbnsdevelop.v1_examples.factory.method.vehicles.IVehicle;

public abstract class Transport {

	protected abstract IVehicle createTransport();
	
	public void startTransport() {
		IVehicle vehicle = createTransport();
		vehicle.startRoute();
	}
	
	
}
