package br.com.bbnsdevelop.jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	
	public static void main(String[] args) throws SQLException {
		
		
		
		String urlConnection = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=false";
		String user = "root";
		String pass = "123asd";
		Connection connection = DriverManager.getConnection(urlConnection, user, pass);
		
		
		Statement stmt = connection.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS course_java");
		
		System.out.println("Database created!");
		
		connection.close();
		
	}

}
