package br.com.bbnsdevelop.jdbc.tables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.bbnsdevelop.jdbc.factory.ConnectionFactory;

public class InsertPeople {
	
	
public static void main(String[] args) throws SQLException {
	
		
		Connection connection = ConnectionFactory.getConnection();
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Typing a name: ");
		String name = in.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO people (name) ");
		sb.append("VALUES (?)");
		String sql = sb.toString();
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, name);
		
		stmt.execute();
		
		System.out.println("Successfully to insert new person in database");
		
		in.close();
	}

}
