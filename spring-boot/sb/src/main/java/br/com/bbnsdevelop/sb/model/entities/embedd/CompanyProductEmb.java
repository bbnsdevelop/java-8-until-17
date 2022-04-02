package br.com.bbnsdevelop.sb.model.entities.embedd;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyProductEmb implements Serializable{
	
	private static final long serialVersionUID = 1L;
		
	
	@Column(name ="company_id")
	private Integer companyId;	
	
	@Column(name ="product_id")
	private Integer productId;
	

}
