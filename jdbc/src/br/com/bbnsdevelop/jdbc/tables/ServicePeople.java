package br.com.bbnsdevelop.jdbc.tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.bbnsdevelop.jdbc.factory.ConnectionFactory;
import br.com.bbnsdevelop.jdbc.tables.entities.People;

public class ServicePeople {
	
	private Connection connection;
	
	
	public ServicePeople() {
		connection = ConnectionFactory.getConnection();
	}
	
	public List<People> findAll() throws SQLException{
		String sql = "SELECT * FROM people";
		
		Statement stmt = connection.createStatement();
		ResultSet resultSet = stmt.executeQuery(sql);
		
		List<People> peolpe = new ArrayList<>();
		
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");			
			peolpe.add(new People(id, name));
		}
		
		stmt.close();
		connection.close();		
		return peolpe;
	}

}
