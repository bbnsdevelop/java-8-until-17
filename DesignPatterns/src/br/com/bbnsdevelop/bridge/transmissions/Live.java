package br.com.bbnsdevelop.bridge.transmissions;

import br.com.bbnsdevelop.bridge.platforms.IPlatform;

public class Live implements ITransmission {

	protected IPlatform platform;

	public Live() {

	}

	public Live(IPlatform platform) {
		this.platform = platform;
	}

	@Override
	public void broadcasting() {
		System.out.println("Start transmission");

	}

	@Override
	public void result() {
		System.out.println("********ON********Air************");

	}

}
