
package acme.entities.challenges;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Challenge extends DomainEntity {

	//Serialisation indetifier ------------------------

	private static final long	serialVersionUID	= 1L;

	//Atributes ---------------------------------------

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	//	@Future
	private Date				deadline;

	@NotBlank
	private String				description;

	@NotNull
	private Integer				rewardGoalGold;

	@NotNull
	private Integer				rewardGoalSilver;

	@NotNull
	private Integer				rewardGoalBronze;
}
