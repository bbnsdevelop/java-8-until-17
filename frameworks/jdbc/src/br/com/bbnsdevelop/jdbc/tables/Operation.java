package br.com.bbnsdevelop.jdbc.tables;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.bbnsdevelop.jdbc.tables.entities.People;

public class Operation {
	
	static ServicePeople service = new ServicePeople();
	
	
	public static void switchMethod(int option) throws SQLException {
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
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);			
		}
	}
	
	public static int operations() {
		Scanner in = new Scanner(System.in);
		System.out.println("1 - create new person");
		System.out.println("2 - Find all");
		System.out.println("3 - Find by id");
		System.out.println("4 - Update by id");
		System.out.println("5 - Delete by id");
		System.out.println("6 - exit");
		System.out.println("Choose a options: ");
		int option = Integer.valueOf(in.nextLine());
		return option;
	}

	private static void create() throws SQLException {
		Scanner in = new Scanner(System.in);
		System.out.println("Typing a name: ");
		String name = in.nextLine();
		String result = service.insertPerson(new People(0, name));
		System.out.println(result);
	}

	private static void update() throws SQLException {
		Scanner in = new Scanner(System.in);

		System.out.println("Typing id: ");
		int id = Integer.valueOf(in.nextLine());

		System.out.println("Typing new name: ");
		String name = in.nextLine();

		People newPeople = new People(id, name);
		if (name != null && !name.isEmpty()) {
			String result = service.updatePeople(newPeople);
			System.out.println(result);
		}
	}

	private static void findById() throws SQLException {
		Scanner in = new Scanner(System.in);

		System.out.println("Typing id: ");
		int id = Integer.valueOf(in.nextLine());
		
		People person = service.findById(id);
		System.out.println(person);
	}

	private static void findAll() throws SQLException {
		List<People> list = service.findAll();

		for (People people : list) {
			System.out.println(people);
		}
	}

	private static void delete() throws SQLException {

		Scanner in = new Scanner(System.in);

		System.out.println("Typing id: ");
		int id = Integer.valueOf(in.nextLine());
		String result = service.deleteById(id);
		System.out.println(result);

	}

}
