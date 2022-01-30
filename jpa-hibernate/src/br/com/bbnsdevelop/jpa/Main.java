package br.com.bbnsdevelop.jpa;

import br.com.bbnsdevelop.jpa.view.Process;

public class Main {
	
	
	public static void main(String[] args) {
		
		int option = Process.operations();
		while (option != 6) {			
			Process.switchMethod(option);
			option = Process.operations();
			System.out.println("-".repeat(50));
		}
		exit();
	}

	private static void exit() {
		System.out.println("-".repeat(50));
		System.out.println("-----------------------bye------------------------");
		System.out.println("-".repeat(50));
	}

}
