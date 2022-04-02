package br.com.bbnsdevelop.sb.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bbnsdevelop.sb.model.entities.Company;
import br.com.bbnsdevelop.sb.model.entities.CompanyProduct;
import br.com.bbnsdevelop.sb.model.entities.Phone;
import br.com.bbnsdevelop.sb.model.entities.Produ;
import br.com.bbnsdevelop.sb.model.repository.CompanyProductRepository;
import br.com.bbnsdevelop.sb.model.repository.CompanyRepository;
import br.com.bbnsdevelop.sb.model.repository.PhoneRepository;
import br.com.bbnsdevelop.sb.model.repository.ProduRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private CompanyProductRepository companyProductRepository;
	
	@Autowired
	private ProduRepository produRepository;
	
	@Autowired
	private PhoneRepository phoneRepository;

	
	public List<Company> findAll(){
		
		List<Company> response = new ArrayList<>();		
		List<Company> companies = companyRepository.findAll();		
		companies.forEach(c ->{
			Company company = new Company() ;
			company.setId(c.getId());
			company.setName(c.getName());
			company.setProducts(findProductByIdCompany(c.getId()));			
			response.add(company);
		});
		
		return response;
	}
	
	private List<Produ> findProductByIdCompany(Integer id){
		List<Produ> products = new ArrayList<>();
		List<CompanyProduct> companyProducts = companyProductRepository.findByIdCompanyId(id);
		companyProducts.forEach(cp ->{
			Optional<Produ> productOptional = produRepository.findById(cp.getId().getProductId());			
			Produ p = productOptional.get();
			Produ product = new Produ();
			product.setDescription(p.getDescription());
			product.setId(p.getId());				
			product.setPhones(findCompanyByCompanyAndProduct(id, p.getId()));
			
			products.add(product);
		});
		return products;
	}
	
	private List<Phone> findCompanyByCompanyAndProduct(Integer companyId, Integer productId){		
		return phoneRepository.findByCompanyIdAndProductId(companyId, productId);
		
	}

}
