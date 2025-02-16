package domain;

public class StatusAgreement {
	
	private Long id;
	
	private String Status;

	public StatusAgreement() {
	}

	public StatusAgreement(String status) {

		Status = status;
	}

	public StatusAgreement(Long id, String status) {
		this.id = id;
		Status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "TypeAgreement {" + "Id = " + id + ", Type = "
				+ Status + "}";
	}
}
