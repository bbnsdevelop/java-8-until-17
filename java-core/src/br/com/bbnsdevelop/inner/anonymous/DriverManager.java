package br.com.bbnsdevelop.inner.anonymous;

public class DriverManager {
	
	static Connection getConnection() {
		Connection connection = new Connection(){

			@Override
			public void createStatement() {				
				System.out.println("Anonymous inner classes method");
			}
			
		};
	
		return connection;
	}

}
