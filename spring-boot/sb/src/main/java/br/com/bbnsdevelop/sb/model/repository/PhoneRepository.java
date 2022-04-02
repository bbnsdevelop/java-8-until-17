package br.com.bbnsdevelop.sb.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.sb.model.entities.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer>{

	List<Phone> findByCompanyIdAndProductId(Integer companyId, Integer productId);
}
