package acme.features.anonymous.recordCompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import acme.entities.recordCompanies.RecordCompany;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractShowService;

@Service
public class AnonymousRecordCompanyShowService implements AbstractShowService<Anonymous, RecordCompany> {

	@Autowired
	private AnonymousRecordCompanyRepository repository;

	// Interfaz de Abstract ShowService

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

		request.unbind(entity, model, "name", "CEO", "sector", "website", "description", "email", "telephone",
				"incorporated");
	}

	@Override
	public RecordCompany findOne(Request<RecordCompany> request) {
		// TODO Auto-generated method stub
		assert request != null;

		RecordCompany result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);
		if (result.isIncorporated() == true) {
			String res = "";

			res = result.getName() + ".inc";
			result.setName(res);
		} else {
			String res = "";
			res = result.getName() + ".llc";
			result.setName(res);
		}

		return result;
	}

}
