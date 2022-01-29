package br.com.bbnsdevelop.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public static Connection getConnection() {
		String urlConnection = "jdbc:mysql://localhost:3306/course_java?verifyServerCertificate=false&useSSL=false";
		String user = "root";
		String pass = "123asd";
		Connection connection = null;;
		try {
			connection = DriverManager.getConnection(urlConnection, user, pass);
		} catch (SQLException e) {
			System.out.println("Error to connecte on database!");
			throw new RuntimeException(e);
		}
		
		return connection;
	}

}
