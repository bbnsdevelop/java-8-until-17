package br.com.bbnsdevelop.sb.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

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
		
	
	@Transient	
	private List<Phone> phones;
	
}
