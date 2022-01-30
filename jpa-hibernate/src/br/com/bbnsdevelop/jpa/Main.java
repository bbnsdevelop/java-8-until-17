package br.com.bbnsdevelop.jpa;

import br.com.bbnsdevelop.jpa.view.Process;

public class Main {
	
	
	public static void main(String[] args) {
		
		int option = Process.operations();
		while (option != 6) {			
			Process.switchMethod(option);
			option = Process.operations();
		}
		
	}

}
