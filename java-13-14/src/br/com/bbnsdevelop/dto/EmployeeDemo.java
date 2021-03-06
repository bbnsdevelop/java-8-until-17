package br.com.bbnsdevelop.dto;

import br.com.bbnsdevelop.dto.EmployeeRecordDemo.EmployeeRecord;
import br.com.bbnsdevelop.dto.records.Employee;

public class EmployeeDemo {
	
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Snow", 1500.00);				
		System.out.println(employee);
		
		
		System.out.println("-".repeat(50));
		System.out.println("In record we don't need create methods GET/SET, toString hashcode, etc");
		EmployeeRecord employee2 = new EmployeeRecord("John", 2500.0);
		System.out.println(employee2);
		System.out.println(employee2.name());
		System.out.println(employee2.salary());
		System.out.println(employee2.hashCode());
		
	}

}
