package br.com.bbnsdevelop.sb.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="tb_company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "company_id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinTable(name = "tb_company_product",
		joinColumns = @JoinColumn(name="company_id", referencedColumnName = "company_id"),
		inverseJoinColumns = @JoinColumn(name="product_id", referencedColumnName = "product_id")
	)
	private List<Produ> products;
	

}
