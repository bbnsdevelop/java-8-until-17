package br.com.bbnsdevelop.sortingobjects;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
	
	
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		
		
		set.add(new Employee(100, "Luiz"));
		set.add(new Employee(200, "Tom"));
		set.add(new Employee(400, "Obama"));
		set.add(new Employee(500, "Ana"));
		set.add(new Employee(300, "Elvis"));
		set.add(new Employee(600, "Jhon"));
		
		
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
	}

}
