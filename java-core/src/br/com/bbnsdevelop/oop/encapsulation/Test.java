package br.com.bbnsdevelop.oop.encapsulation;

public class Test {
	
	public static void main(String[] args) {
		Custumer c = new Custumer();
		
		c.setFirstName("Jhon");
		c.setLastName("I don't know");
		c.setCreditCard("6454.4587.54576.63487.24887");
		
		
		System.out.println("Name: ".concat(c.getFirstName()));
		System.out.println("Last name: ".concat(c.getLastName()));
		System.out.println("Credit card: ".concat(c.getCreditCard()));
		
		Patient p = new Patient();
		
		p.setId(1L);
		p.setName("Jhon");
		p.setSsn("1a4454ABV");
		
		System.out.println("ID: ".concat(p.getId().toString()));
		System.out.println("Name: ".concat(p.getName()));
		System.out.println("SSN: ".concat(p.getSsn()));
	}

}

