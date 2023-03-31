package br.com.bbnsdevelop.v1_examples.bridge.platforms;

public class DisneyPlus implements IPlatform {
	
	
	public DisneyPlus() {
		configureRMTP();
		System.out.println("DisneyPlus: Transmission started ");
	}

	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("DisneyPlus: connection established");

	}

	@Override
	public void authToken() {
		System.out.println("Get token......");
		System.out.println("Authorized");

	}

}
