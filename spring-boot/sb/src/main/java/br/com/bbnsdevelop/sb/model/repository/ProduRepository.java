package br.com.bbnsdevelop.sb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.sb.model.entities.Produ;

@Repository
public interface ProduRepository extends JpaRepository<Produ, Integer>{

}
