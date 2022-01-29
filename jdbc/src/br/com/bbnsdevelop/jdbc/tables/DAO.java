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

public class DAO {

	private Connection connection;

	public DAO() {
		connection = ConnectionFactory.getConnection();
	}

	public List<People> findAll() {
		String sql = "SELECT * FROM people";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);

			List<People> peolpe = new ArrayList<>();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				peolpe.add(new People(id, name));
			}
			return peolpe;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public People findById(int id) {
		String sql = "SELECT * FROM people WHERE id = ?";
		try {
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
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public String updatePeople(People newPeople) {
		People p = findById(newPeople.getId());
		String sql = "UPDATE people SET name = ? WHERE id = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, newPeople.getName());
			stmt.setInt(2, p.getId());
			stmt.execute();

			return "Successfully to update a person ".concat(newPeople.getName());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public String insertPerson(People p) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO people (name) ");
		sb.append("VALUES (?)");
		String sql = sb.toString();

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, p.getName());

			stmt.execute();

			return "Successfully to insert new person in database";
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public String deleteById(int id) {
		StringBuilder sb = new StringBuilder();
		sb.append("DELETE FROM people ");
		sb.append("WHERE id = ?");
		String sql = sb.toString();

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			return "Successfully to delete person in database";
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
