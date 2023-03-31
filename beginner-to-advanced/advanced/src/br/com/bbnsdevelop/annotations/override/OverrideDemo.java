package br.com.bbnsdevelop.annotations.override;

public class OverrideDemo extends OverrideInheritance implements OverrideInterface{
	
	
	
	@Override
	public void showNumber() {
		System.out.println("NUmber 2");
	}

	@Override
	public void methodInterface() {
		System.out.println("Inside method override");
		
	}
	
	
	public static void main(String[] args) {
		OverrideDemo o = new OverrideDemo();
		
		OverrideInheritance i = new OverrideInheritance();
		
		i.showNumber();
		o.showNumber();
		
		System.out.println("----------------------------");
		o.methodInterface();
	}

}
