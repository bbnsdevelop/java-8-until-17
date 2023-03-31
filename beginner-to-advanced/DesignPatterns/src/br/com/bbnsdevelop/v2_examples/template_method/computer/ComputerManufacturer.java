package br.com.bbnsdevelop.v2_examples.template_method.computer;

public abstract class ComputerManufacturer {
	
	void buildComputer() {
		addKeyboard();
		addRAM();
		addHardDisk();
		System.out.println("Computer done!!!");
	}

	protected abstract void addKeyboard();

	protected abstract void addRAM();

	protected abstract void addHardDisk();

}
