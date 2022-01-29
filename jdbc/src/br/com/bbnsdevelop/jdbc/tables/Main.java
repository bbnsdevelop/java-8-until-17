package br.com.bbnsdevelop.jdbc.tables;

import java.sql.SQLException;
import java.util.List;

import br.com.bbnsdevelop.jdbc.tables.entities.People;

public class Main {
	
	
	public static void main(String[] args) throws SQLException {
		ServicePeople service = new ServicePeople();
		
		
		List<People> list = service.findAll();
		
		for (People people : list) {
			System.out.println(people);
		}
	}

}
