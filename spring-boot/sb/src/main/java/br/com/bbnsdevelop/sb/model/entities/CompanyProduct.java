package br.com.bbnsdevelop.sb.model.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.bbnsdevelop.sb.model.entities.embedd.CompanyProductEmb;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="tb_company_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyProduct {
	
	@EmbeddedId
	private CompanyProductEmb id;

}
