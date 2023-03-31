package br.com.bbnsdevelop.sb.model.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.sb.dto.CompanyDto;

@Repository
public class JdbcCompanyRepository {

	@Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	public List<CompanyDto> findAll(){
		
		List<CompanyDto>  list = namedParameterJdbcTemplate.query(queryFindAllCompanies(), new BeanPropertyRowMapper<CompanyDto>(CompanyDto.class));
		
		return list;
	}

	private String queryFindAllCompanies() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("select ");
		sb.append("c.company_id id, c.name name, ");
		sb.append("p.product_id idProduto, p.description description, ");
		sb.append("ph.id idPhone, ph.ddd ddd, ph.number number, ");
		sb.append("ph.contact contact, ph.company_id idCompany, ");
		sb.append("ph.product_id idProduct ");				
		sb.append("from tb_company c ");
		sb.append("inner join tb_company_product cp ");
		sb.append("on cp.company_id = c.company_id inner ");
		sb.append("join tb_produ p on p.product_id = cp.product_id ");
		sb.append("inner join tb_phone ph on c.company_id = ph.company_id ");
		sb.append("and p.product_id = ph.product_id ");
		
		return sb.toString();

	}

}
