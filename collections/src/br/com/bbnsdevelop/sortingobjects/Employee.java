package br.com.bbnsdevelop.sortingobjects;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	
	
	public Employee() {
	
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		int id = this.id;
		int id2 = o.id;
		
		if(id < id2) {
			return -1;
		}
		else if(id > id2) {
			return 1;
		}		
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
		
}
