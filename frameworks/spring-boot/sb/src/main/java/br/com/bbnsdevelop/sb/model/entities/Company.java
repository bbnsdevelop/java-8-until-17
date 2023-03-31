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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

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

	
	@Transient
	private List<Produ> products;
	
		
}
