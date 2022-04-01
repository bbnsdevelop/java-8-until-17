package br.com.bbnsdevelop.sb.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="tb_produ")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produ implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "product_id")
	private Integer id;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy ="product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Phone> phones;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "products")
	private List<Company> companies;

}
