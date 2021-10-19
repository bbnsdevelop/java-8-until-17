package br.com.bbnsdevelop.oop.test;

import br.com.bbnsdevelop.oop.entities.Event;
import br.com.bbnsdevelop.oop.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		
		
		Organizer organizer = new Organizer();
		organizer.id = 123l;
		organizer.name = "Apple Inc";
		
		System.out.println(organizer);
		
		
		Event event = new Event();
		event.id = 456l;
		event.name = "Iphone 100 launch";
		event.description = "Grand Launch";
		
		System.out.println(event);
		
		Event event1 = new Event(1234l, "MacBook 200 launch", "Grand Launch");
		System.out.println(event1);
		
	}
}
