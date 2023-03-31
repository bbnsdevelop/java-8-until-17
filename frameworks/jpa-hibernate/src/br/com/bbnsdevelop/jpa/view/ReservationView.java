package br.com.bbnsdevelop.jpa.view;

import java.util.Scanner;

import br.com.bbnsdevelop.jpa.entities.Customer;
import br.com.bbnsdevelop.jpa.entities.Seat;
import br.com.bbnsdevelop.jpa.service.ReservationService;

public class ReservationView {
	
	private static ReservationService reservation = new ReservationService();
	
	

	
	protected static void saveReservation() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type name of client: ");
		String name = in.nextLine();
		System.out.println("Type your seat: ");
		String seatNumber = in.nextLine();
		
		Seat seat = new Seat(seatNumber);
		Customer customer = new Customer(name, seat);
		String result = reservation.saveAtomic(customer);
		System.out.println(result);
	}
	
	protected static void findCustomer() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type id to find");
		Long id = in.nextLong();
		Customer customer = reservation.findById(id);
		System.out.println("Customer: " + customer.getName() + " Seat: "+ customer.getSeat().getName());
	}

}
