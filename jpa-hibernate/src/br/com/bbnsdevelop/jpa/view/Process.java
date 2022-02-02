package br.com.bbnsdevelop.jpa.view;

import java.util.Scanner;

public class Process {
	
	public static int operations() {
		Scanner in = new Scanner(System.in);
		Menu.showMenu();
		int option = Integer.valueOf(in.nextLine());
		return option;
	}	
	
	public static void switchMethod(int option) {
		switch (option) {
		case 1:
			UserView.create();
			break;
		case 2:
			UserView.findAll();
			break;
		case 3:
			UserView.findById();
			break;
		case 4:
			UserView.update();
			break;
		case 5:
			UserView.delete();
			break;
		case 6:
			ReservationView.saveReservation();
			break;
		case 7:
			ReservationView.findCustomer();
			break;
		case 8:
			OrderView.buyItem();
			break;
		case 9:
			OrderView.findOrder();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);			
		}
	}

	public static void closeConnection() {
		UserView.closeConnection();		
	}

}
