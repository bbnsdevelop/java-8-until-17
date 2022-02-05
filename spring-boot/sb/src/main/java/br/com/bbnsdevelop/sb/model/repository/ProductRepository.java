package br.com.bbnsdevelop.sb.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.sb.model.entities.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long>{

}
