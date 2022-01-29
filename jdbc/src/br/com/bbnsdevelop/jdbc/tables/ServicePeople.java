package br.com.bbnsdevelop.jdbc.tables;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

	public List<People> findAll() throws SQLException {
		String sql = "SELECT * FROM people";

		Statement stmt = connection.createStatement();
		ResultSet resultSet = stmt.executeQuery(sql);

		List<People> peolpe = new ArrayList<>();

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			peolpe.add(new People(id, name));
		}
		return peolpe;
	}

	public People findById(int id) throws SQLException {
		String sql = "SELECT * FROM people WHERE id = ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet resultSet = stmt.executeQuery();
		People person = null;

		while (resultSet.next()) {
			id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			person = new People(id, name);
		}
		return person;
	}

	public String updatePeople(People newPeople) throws SQLException {
		People p = findById(newPeople.getId());

		String sql = "UPDATE people SET name = ? WHERE id = ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, newPeople.getName());
		stmt.setInt(2, p.getId());
		stmt.execute();
		
		return "Successfully to update a person ".concat(newPeople.getName());
		
	}

}
