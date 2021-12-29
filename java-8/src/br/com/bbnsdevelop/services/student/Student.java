package br.com.bbnsdevelop.services.student;

public class Student {
	
	private String name;
	private Double note;

	public Student() {

	}

	public Student(String name, Double note) {
		this.name = name;
		this.note = note;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", nota=" + note + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	

}
