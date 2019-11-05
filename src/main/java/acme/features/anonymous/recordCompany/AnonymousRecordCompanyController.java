package acme.features.anonymous.recordCompany;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.recordCompanies.RecordCompany;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/record-company/")
public class AnonymousRecordCompanyController extends AbstractController<Anonymous, RecordCompany> {

	// Internal state-----------------------

	@Autowired
	private AnonymousRecordCompanyListService listService;

	@Autowired
	private AnonymousRecordCompanyShowService showService; 

	// Constructors --------------------
	
	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, showService);
	}
}
