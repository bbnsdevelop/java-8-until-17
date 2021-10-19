package br.com.bbnsdevelop.oop.entities;

public class Event {

	public Long id;
	public String name;
	public String description;
	public String startTime;
	public String endTime;
	public Boolean started;

	
	public Event() {
	}


	public Event(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	
	
	

}
