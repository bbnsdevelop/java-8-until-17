package br.com.bbnsdevelop.bridge.platforms;

public class YouTube  implements IPlatform {

	
	
	
	public YouTube() {
		configureRMTP();
		System.out.println("YouTube: Transmission started ");
	}

	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("YouTube: connection established");

	}

	@Override
	public void authToken() {
		System.out.println("Get token......");
		System.out.println("Authorized");

	}

}
