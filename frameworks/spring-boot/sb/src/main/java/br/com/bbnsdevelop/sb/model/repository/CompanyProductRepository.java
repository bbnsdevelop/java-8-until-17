package br.com.bbnsdevelop.sb.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.sb.model.entities.CompanyProduct;
import br.com.bbnsdevelop.sb.model.entities.embedd.CompanyProductEmb;

@Repository
public interface CompanyProductRepository extends JpaRepository<CompanyProduct, CompanyProductEmb>{
	
	List<CompanyProduct> findByIdCompanyId(Integer idCompany);

}
