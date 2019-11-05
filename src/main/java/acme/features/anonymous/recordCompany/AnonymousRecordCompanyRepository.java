package acme.features.anonymous.recordCompany;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.recordCompanies.RecordCompany;
import acme.framework.repositories.AbstractRepository;

public interface AnonymousRecordCompanyRepository extends AbstractRepository{

	
	@Query("select r from RecordCompany r where r.id = ?1")
	RecordCompany findOneById(int id);
	
	@Query("select r from RecordCompany r")
	Collection<RecordCompany> findManyAll();



}
