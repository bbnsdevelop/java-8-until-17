package br.com.bbnsdevelop.services.student;

public class Student {
	
	private String name;
	private Double nota;

	public Student() {

	}

	public Student(String name, Double nota) {
		this.name = name;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", nota=" + nota + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
