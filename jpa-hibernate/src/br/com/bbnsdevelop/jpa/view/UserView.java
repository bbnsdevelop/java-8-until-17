package br.com.bbnsdevelop.jpa.view;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import br.com.bbnsdevelop.jpa.entities.User;
import br.com.bbnsdevelop.jpa.service.UserService;

public class UserView {
	
	protected static UserService service = new UserService();
	

	public static void closeConnection() {
		service.close();
		
	}

	protected static void create() {
		
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
	
	protected static void findById() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type id to find");
		Long id = in.nextLong();
		
		User user = service.findUserById(id);
		System.out.println(user);
		System.out.println("-".repeat(50));
	}

	protected static void findAll() {
		Consumer<User> consumer = u -> System.out.println(u);		
		List<User> list = service.findAll();
		list.forEach(consumer);
		System.out.println("-".repeat(50));
	}
	
	protected static void delete() {
		
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

	protected static void update() {
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

}
