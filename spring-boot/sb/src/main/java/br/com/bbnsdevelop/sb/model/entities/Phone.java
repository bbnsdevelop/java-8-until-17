package br.com.bbnsdevelop.sb.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="tb_phone")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String ddd;
	
	private String number;
	
	private String contact;
	
	@JsonIgnore
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name ="company_id", referencedColumnName = "company_id")
	private Company company;
	
	
	@JsonIgnore
	@ManyToOne	
	@JoinColumn(name ="product_id", referencedColumnName = "product_id")
	private Produ product;
	

}
