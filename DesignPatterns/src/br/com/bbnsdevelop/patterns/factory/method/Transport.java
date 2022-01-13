package br.com.bbnsdevelop.patterns.factory.method;

import br.com.bbnsdevelop.patterns.factory.method.vehicles.IVehicle;

public abstract class Transport {

	protected abstract IVehicle createTransport();
	
	public void startTransport() {
		IVehicle vehicle = createTransport();
		vehicle.startRoute();
	}
	
	
}
