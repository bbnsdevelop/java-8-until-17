package br.com.bbnsdevelop.bridge.platforms;

public class Facebook implements IPlatform {
	
	
	public Facebook() {
		configureRMTP();
		System.out.println("Facebook: Transmission started ");
	}

	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("Facebook: connection established");

	}

	@Override
	public void authToken() {
		System.out.println("Get token......");
		System.out.println("Authorized");

	}

}
