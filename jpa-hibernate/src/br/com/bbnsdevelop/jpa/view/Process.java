package br.com.bbnsdevelop.jpa.view;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import br.com.bbnsdevelop.jpa.entities.Customer;
import br.com.bbnsdevelop.jpa.entities.ItemOrder;
import br.com.bbnsdevelop.jpa.entities.Order;
import br.com.bbnsdevelop.jpa.entities.Product;
import br.com.bbnsdevelop.jpa.entities.Seat;
import br.com.bbnsdevelop.jpa.entities.User;
import br.com.bbnsdevelop.jpa.service.OrderService;
import br.com.bbnsdevelop.jpa.service.ReservationService;
import br.com.bbnsdevelop.jpa.service.UserService;

public class Process {
	
	private static UserService service = new UserService();	
	private static ReservationService reservation = new ReservationService();
	private static OrderService orderService = new OrderService();
	
	public static int operations() {
		Scanner in = new Scanner(System.in);
		Menu.showMenu();
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
		case 7:
			findCustomer();
			break;
		case 8:
			buyItem();
			break;
		case 9:
			findOrder();
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
	
	private static void findCustomer() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type id to find");
		Long id = in.nextLong();
		Customer customer = reservation.findById(id);
		System.out.println("Customer: " + customer.getName() + " Seat: "+ customer.getSeat().getName());
	}
	
	private static void findOrder() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type id to find");
		Long id = in.nextLong();
		Order order = orderService.findById(id);
		System.out.println("Date of transaction: " + order.getDate());
		Consumer<ItemOrder> consumer = i -> System.out.println("Product: " +i.getProduct().getName() + " Quantity: " + i.getQuantity() + " Total price: " + i.getPrice());
		
		order.getItens().forEach(consumer);
		
	}
	
	private static void buyItem() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type name of product: ");
		String name = in.nextLine();
		System.out.println("Type price: ");
		Double price = in.nextDouble();
		
		System.out.println("Type quantity: ");
		int quantity = in.nextInt();
		
		Order oder = new Order();		
		Product product = new Product(name, price);
		ItemOrder item = new ItemOrder(oder, product, quantity);
		
		String result = orderService.save(item);
		System.out.println(result);
	}

}
