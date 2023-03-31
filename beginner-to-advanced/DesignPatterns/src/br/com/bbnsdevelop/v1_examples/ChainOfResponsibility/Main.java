package br.com.bbnsdevelop.v1_examples.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.bbnsdevelop.v1_examples.ChainOfResponsibility.init.Initialization;
import br.com.bbnsdevelop.v1_examples.ChainOfResponsibility.server.UserServer;

public class Main {
	
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		Initialization init = new Initialization();
		
		UserServer server = init.get();
		
		boolean done;
		
		do {
			System.out.println("Type the email: ");
			String email = reader.readLine();
			
			System.out.println("Type the password: ");
			String password = reader.readLine();
			done = server.LogIn(email, password);
			
		}
		while(!done);
	}

}
