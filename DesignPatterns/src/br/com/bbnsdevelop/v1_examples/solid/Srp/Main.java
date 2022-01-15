package br.com.bbnsdevelop.v1_examples.solid.Srp;

public class Main {
	
	public static void main(String[] args) {
		
		ClientBadPractice bad = new ClientBadPractice();
		bad.listClient();
		// more methods to call
		
		Client client = new Client();
		client.deleteClientById(0);
		
	}
	
	
}
