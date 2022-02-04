package br.com.bbnsdevelop.sb.model.entities;

public class Customer {
	
	
	private Integer id;
	private String name;
	private String cpf;

	public Customer() {
	}

	public Customer(Integer id, String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
