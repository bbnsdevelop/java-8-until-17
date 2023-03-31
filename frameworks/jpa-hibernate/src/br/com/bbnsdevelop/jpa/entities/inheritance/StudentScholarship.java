package br.com.bbnsdevelop.jpa.entities.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student_scholarship")
@DiscriminatorValue("SS")
public class StudentScholarship extends Student {
	
	
	private Double valueScholarship;

	public StudentScholarship() {
		
	}
	
	public StudentScholarship(String name, Double valueScholarship) {
		super(name);
		this.valueScholarship = valueScholarship;
	}


	public Double getValueScholarship() {
		return valueScholarship;
	}


	public void setValueScholarship(Double valueScholarship) {
		this.valueScholarship = valueScholarship;
	}
	

}
