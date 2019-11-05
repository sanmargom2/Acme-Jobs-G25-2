package acme.features.anonymous.recordCompany;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.recordCompanies.RecordCompany;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRecordCompanyListService implements AbstractListService<Anonymous, RecordCompany> {

	// Internal state -----------------------------------

	@Autowired
	AnonymousRecordCompanyRepository repository;

	// AbstractShowService<Administrator,RecordCompany> interface------------

	@Override
	public boolean authorise(Request<RecordCompany> request) {
		// TODO Auto-generated method stub
		assert request != null;
		return true;
	}

	@Override
	public void unbind(Request<RecordCompany> request, RecordCompany entity, Model model) {
		// TODO Auto-generated method stub
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "sector");
	}

	@Override
	public Collection<RecordCompany> findMany(Request<RecordCompany> request) {
		// TODO Auto-generated method stub
		assert request != null;

		Collection<RecordCompany> result;

		result = this.repository.findManyAll();

		return result;
	}

}
