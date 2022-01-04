package br.com.bbnsdevelop.interfaces;

public interface PrivateMethodSendNotifications {
	
	default void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple notifications");
	}
	
	default void sendNotification() {
		establishConnection();
		System.out.println("Sending notification");
	}
	
	private void establishConnection() {
		System.out.println("Establishing a connection");	
	}

}
