package br.com.bbnsdevelop.v2_examples.template_method.computer;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	protected void addKeyboard() {
		System.out.println("Adding keyboard");

	}

	@Override
	protected void addRAM() {
		System.out.println("Adding memory RAM");

	}

	@Override
	protected void addHardDisk() {
		System.out.println("Adding ssd disk");
		addScreen();
	}
	
	private void addScreen() {
		System.out.println("Adding Screen");
	}

}
