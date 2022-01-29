package br.com.bbnsdevelop.jdbc.tables;

import java.sql.SQLException;

public class Main {	

	public static void main(String[] args) throws SQLException {
		int option = Operation.operations();
		while (option != 6) {			
			Operation.switchMethod(option);
			option = Operation.operations();
		}

	}


}
