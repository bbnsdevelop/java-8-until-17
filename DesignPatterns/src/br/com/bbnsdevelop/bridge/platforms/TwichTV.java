package br.com.bbnsdevelop.bridge.platforms;

public class TwichTV implements IPlatform {

	
	
	
	public TwichTV() {
		configureRMTP();
		System.out.println("TwichTV: Transmission started ");
	}

	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("TwichTV: connection established");

	}

	@Override
	public void authToken() {
		System.out.println("Get token......");
		System.out.println("Authorized");

	}

}
