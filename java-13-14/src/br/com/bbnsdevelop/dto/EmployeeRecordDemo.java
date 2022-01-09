package br.com.bbnsdevelop.dto;

public class EmployeeRecordDemo {
	
	record EmployeeRecord(String name, Double salary) {}
	
	public static void main(String[] args) {
		
		EmployeeRecord employee = new EmployeeRecord("John", 2500.0);
		
		System.out.println(employee);
		System.out.println(employee.name());
		System.out.println(employee.salary());
		System.out.println(employee.hashCode());
		
	}

}
