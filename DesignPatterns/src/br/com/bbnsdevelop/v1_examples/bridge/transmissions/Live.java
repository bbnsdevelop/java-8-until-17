package br.com.bbnsdevelop.v1_examples.bridge.transmissions;

import br.com.bbnsdevelop.v1_examples.bridge.platforms.IPlatform;

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
