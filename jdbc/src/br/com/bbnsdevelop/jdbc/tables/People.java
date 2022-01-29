package br.com.bbnsdevelop.jdbc.tables;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.bbnsdevelop.jdbc.factory.ConnectionFactory;

public class People {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnection();
		Statement stmt = connection.createStatement();
		String sql = """
					CREATE TABLE IF NOT EXISTS people (
						id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
						name VARCHAR(80) NOT NULL																	
					)
				""";
		stmt.execute(sql);
		
		System.out.println("Table created");
	}

}
