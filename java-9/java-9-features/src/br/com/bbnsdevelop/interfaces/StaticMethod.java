package br.com.bbnsdevelop.interfaces;

public interface StaticMethod {
	
	static void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple notifications");
	}
		
	private static void establishConnection() {
		System.out.println("Establishing a connection");	
	}

}
