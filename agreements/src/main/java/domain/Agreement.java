package domain;

import java.util.Date;

public class Agreement {
	
	private Long Id;
	private Long PersonId;
	private Long TypeId;
	private Long StatusId;
	private Long Number;
	private Date DateOpen;
	private Date DateClose;

	public Long getId() {
		return Id;
	}

	public Long getPersonId() {
		return PersonId;
	}

	public Long getStatusId() {
		return StatusId;
	}

	public Long getTypeId() {
		return TypeId;
	}

	public Date getDateClose() {
		return DateClose;
	}

	public Date getDateOpen() {
		return DateOpen;
	}

	public Long getNumber() {
		return Number;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setDateClose(Date dateClose) {
		DateClose = dateClose;
	}

	public void setDateOpen(Date dateOpen) {
		DateOpen = dateOpen;
	}

	public void setNumber(Long number) {
		Number = number;
	}

	public void setPersonId(Long personId) {
		PersonId = personId;
	}

	public void setStatusId(Long statusId) {
		StatusId = statusId;
	}

	public void setTypeId(Long typeId) {
		TypeId = typeId;
	}

	public Agreement() {
	}
	
	public Agreement(Long id, Long personId, Long typeId, Long statusId,
					 Long number, Date dateOpen, Date dateClose) {
		Id = id;
		Number = number;
		DateOpen = dateOpen;
		DateClose = dateClose;
		PersonId = personId;
		TypeId = typeId;
		StatusId = statusId;
	}

	
	public String toString() {
		return "Agreement {" + "Id = " + Id +
				", Number = " + Number +
				", DateOpen = "+ DateOpen +
				", DateClouse = "+ DateClose;
	}
}
