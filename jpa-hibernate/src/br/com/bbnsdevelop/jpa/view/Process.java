package br.com.bbnsdevelop.jpa.view;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import br.com.bbnsdevelop.jpa.entities.Customer;
import br.com.bbnsdevelop.jpa.entities.Seat;
import br.com.bbnsdevelop.jpa.entities.User;
import br.com.bbnsdevelop.jpa.service.ReservationService;
import br.com.bbnsdevelop.jpa.service.UserService;

public class Process {
	
	private static UserService service = new UserService();	
	private static ReservationService reservation = new ReservationService();
	
	public static int operations() {
		Scanner in = new Scanner(System.in);
		System.out.println("1 - create new User");
		System.out.println("2 - Find all");
		System.out.println("3 - Find by id");
		System.out.println("4 - Update by id");
		System.out.println("5 - Delete by id");
		System.out.println("6 - Make reservation");
		System.out.println("7 - exit");
		System.out.println("Choose a options: ");
		int option = Integer.valueOf(in.nextLine());
		return option;
	}	
	
	public static void switchMethod(int option) {
		switch (option) {
		case 1:
			create();
			break;
		case 2:
			findAll();
			break;
		case 3:
			findById();
			break;
		case 4:
			update();
			break;
		case 5:
			delete();
			break;
		case 6:
			saveReservation();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);			
		}
	}
	
	public static void closeConnection() {
		service.close();
		
	}

	private static void create() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type name: ");
		String name = in.nextLine();
		System.out.println("Type email: ");
		String email = in.nextLine();		
		
		User user = new User(name, email);		
		String response = service.createUser(user);		
		System.out.println(response);
		System.out.println("-".repeat(50));
		
	}
	
	private static void findById() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type id to find");
		Long id = in.nextLong();
		
		User user = service.findUserById(id);
		System.out.println(user);
		System.out.println("-".repeat(50));
	}

	private static void findAll() {
		Consumer<User> consumer = u -> System.out.println(u);		
		List<User> list = service.findAll();
		list.forEach(consumer);
		System.out.println("-".repeat(50));
	}
	
	private static void delete() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type id to delete: ");
		Long id = in.nextLong();		
		User user = service.findUserById(id);
		
		if(user != null) {
			String result = service.delete(user);			
			System.out.println(result);			
			
		}else {
			System.out.println("User not found!");
		}
		
		
	}

	private static void update() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type id to find");
		Long id = in.nextLong();		
		User user = service.findUserById(id);
		
		if(user != null) {
			in.nextLine();
			System.out.println("Type name: ");
			String name = in.nextLine();
			System.out.println("Type email: ");
			String email = in.nextLine();
			
			user.setName((name == null || name.isBlank()) ? user.getName() : name );
			user.setEmail((email == null || email.isBlank()) ? user.getEmail() : email);
			
			String result = service.update(user);
			System.out.println(result);			
		}else {
			System.out.println("User not found!");
		}
		
		System.out.println("-".repeat(50));
		
	}
	
	private static void saveReservation() {
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

}
