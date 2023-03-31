package br.com.bbnsdevelop.jpa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nephew")
public class Nephew {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;

	@ManyToMany(mappedBy = "nephews")
	private List<Uncle> uncles = new ArrayList<>();

	public Nephew() {
	}

	public Nephew(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Uncle> getUncles() {
		return uncles;
	}

	public void setUncles(List<Uncle> uncles) {
		this.uncles = uncles;
	}
	
	
	

}
