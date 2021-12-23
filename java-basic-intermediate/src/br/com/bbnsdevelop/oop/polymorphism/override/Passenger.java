package br.com.bbnsdevelop.oop.polymorphism.override;

import java.util.Objects;

public class Passenger {
	
	private int id;
	private String name;
	private String lastName;
	

	
	public Passenger() {

	}

	public Passenger(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, lastName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		return id == other.id && Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}

	
	
	

}
