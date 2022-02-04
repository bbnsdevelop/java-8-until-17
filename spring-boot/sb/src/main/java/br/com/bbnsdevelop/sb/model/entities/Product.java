package br.com.bbnsdevelop.sb.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name ="name", nullable = false, length = 60)	
	private String name;
	
	@Min(0)
	@Column(name ="price", nullable = false, scale = 2, precision = 10)
	private Double price;
	
	@Min(0)
	@Max(1)
	@Column(name ="discount", nullable = false, scale = 2, precision = 3)
	private Double discount;
	

	public Product() {
	}

	public Product(String name, Double price, Double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	

}
