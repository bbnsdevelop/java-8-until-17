package br.com.bbnsdevelop.jdbc.factory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	
	public static Connection getConnection() {
		
		Properties properties = getProperties();
		
		String urlConnection = properties.getProperty("db.url");
		String user = properties.getProperty("db.user");
		String pass = properties.getProperty("db.pass");
		Connection connection = null;;
		try {
			connection = DriverManager.getConnection(urlConnection, user, pass);
		} catch (SQLException e) {
			System.out.println("Error to connecte on database!");
			throw new RuntimeException(e);
		}
		
		return connection;
	}
	
	private static Properties getProperties() {
		
		Properties properties = new  Properties();
		String path = "/connections.properties";
		try {
			properties.load(ConnectionFactory.class.getResourceAsStream(path));
			return properties;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

}
