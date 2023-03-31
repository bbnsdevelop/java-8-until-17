package br.com.bbnsdevelop.v2_examples.template_method.computer;

public class DesktopManufacturer extends ComputerManufacturer {

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
		System.out.println("Adding disk");

	}

}
