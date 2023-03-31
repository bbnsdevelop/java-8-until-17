package br.com.bbnsdevelop.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		String urlConnection = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=false";
		String user = "root";
		String pass = "123asd";
		Connection connection = DriverManager.getConnection(urlConnection, user, pass);
		
		System.out.println("You need add in build path, jdbc drive to connect on mysql");
		System.out.println("Successfully established a connection to the database");
		
		connection.close();
		
		
	}

}
