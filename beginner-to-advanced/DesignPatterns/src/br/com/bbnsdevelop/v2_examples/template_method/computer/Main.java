package br.com.bbnsdevelop.v2_examples.template_method.computer;

public class Main {
	
	
	public static void main(String[] args) {
		ComputerManufacturer manufacturer = new LaptopManufacturer();
		
		manufacturer.buildComputer();
	}

}
