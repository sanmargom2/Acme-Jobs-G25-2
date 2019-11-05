package acme.entities.recordCompanies;

import javax.persistence.Entity;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RecordCompany extends DomainEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
	private String name;
	
	@NotBlank
	private String CEO;

	@NotBlank
	private String sector;

	@URL
	private String website;

	@NotBlank
	private String description;

	@NotBlank
	@Email
	private String email;

	@Pattern(regexp = "\\+\\d{1,3}\\s\\(\\d{1,4}\\)\\s\\d{6,10}")
	private String telephone;
	
	private boolean incorporated;
}
