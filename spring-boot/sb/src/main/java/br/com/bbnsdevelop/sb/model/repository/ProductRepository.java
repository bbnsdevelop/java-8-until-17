package br.com.bbnsdevelop.sb.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.sb.model.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
