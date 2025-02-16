package domain;

public class TypeAgreement {
	
	private Long id;
	
	private String type;
	
	public TypeAgreement() {
	}
	
	public TypeAgreement(String type) {
		this.type = type;
	}
	
	public TypeAgreement(Long id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "TypeAgreement {" + "Id = " + id + ", Type = "
	+ type + "}";
	}
	
}
