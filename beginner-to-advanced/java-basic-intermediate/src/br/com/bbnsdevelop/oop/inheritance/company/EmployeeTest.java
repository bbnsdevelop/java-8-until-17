package br.com.bbnsdevelop.oop.inheritance.company;

public class EmployeeTest {
	
	public static void main(String[] args) {
		String[] projects = new String[] {"Flight Reservation", "Check In"};
		
		Manager m = new Manager(1, "Jhon", "Travel", 100000.00, projects);
		m.showInfo();
		m.work();
		
		Developer d = new Developer(2, "Jose", "loan", 10000,"Java");
		d.showInfo();
		d.work();
		
	}

}
