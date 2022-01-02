package br.com.bbnsdevelop.interfaces;

public class PrivateMethodSendNotificationsImpl implements PrivateMethodSendNotifications {
	
	public static void main(String[] args) {
		PrivateMethodSendNotifications send = new PrivateMethodSendNotificationsImpl();
		
		send.sendNotification();
		send.sendNotifications();
	}

}
