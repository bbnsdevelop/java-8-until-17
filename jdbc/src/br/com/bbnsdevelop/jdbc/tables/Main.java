package br.com.bbnsdevelop.jdbc.tables;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.bbnsdevelop.jdbc.tables.entities.People;

public class Main {
	
	
	public static void main(String[] args) throws SQLException {
		ServicePeople service = new ServicePeople();
		
		
		List<People> list = service.findAll();
		
		for (People people : list) {
			System.out.println(people);
		}
		
		
		System.out.println("-".repeat(50));
		
		People person = service.findById(1);
		
		System.out.println(person);
		
		System.out.println("-".repeat(50));
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Typing id: ");
		int id = Integer.valueOf(in.nextLine());
		
		System.out.println("Typing new name: ");
		String name = in.nextLine();
		
		
		People newPeople = new People(id, name);
		if(name != null && !name.isEmpty()) {
			String result = service.updatePeople(newPeople);
			System.out.println(result);			
		}
		
	}

}
