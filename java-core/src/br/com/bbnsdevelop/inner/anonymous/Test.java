package br.com.bbnsdevelop.inner.anonymous;

public class Test {
	
	public static void main(String[] args) {
		Connection con = DriverManager.getConnection();		
		con.createStatement();
	}

}
