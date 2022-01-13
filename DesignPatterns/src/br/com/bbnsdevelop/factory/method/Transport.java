package br.com.bbnsdevelop.factory.method;

import br.com.bbnsdevelop.factory.method.vehicles.IVehicle;

public abstract class Transport {

	protected abstract IVehicle createTransport();
	
	public void startTransport() {
		IVehicle vehicle = createTransport();
		vehicle.startRoute();
	}
	
	
}
