package br.com.bbnsdevelop.v2_examples.factories.method.person;

public class Main {
	
	
	public static void main(String[] args) {
		IPerson p = PersonFactory.create(true);
		
		
		p.wish("Hello");
	}

}
