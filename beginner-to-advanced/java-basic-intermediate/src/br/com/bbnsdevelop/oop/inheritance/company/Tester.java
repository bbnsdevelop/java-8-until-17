package br.com.bbnsdevelop.oop.inheritance.company;

import java.util.Arrays;

public class Tester extends Employee {
	
	String[] tools;

	public Tester(int id, String name, String dept, double salary, String[] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}
	
	@Override
	protected void work() {		
		super.work();
		System.out.println("Tester is testing using: ");
		Arrays.asList(tools).forEach(System.out::println);
	}
	
	

}
