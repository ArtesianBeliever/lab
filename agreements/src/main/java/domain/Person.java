package domain;

import java.util.Date;

public class Person {
	
	private Long Id;
	private String Cipher;
	private Long Inn;
	private String Type;
	private Date RegistrationDate;
	
	public Person() {
	}
	public Person(Long id, String cipher, Long inn, String type, Date date){
		Id = id;
		Cipher = cipher;
		Inn = inn;
		Type = type;
		RegistrationDate = date;
	}

	public void setCipher(String cipher) {
		Cipher = cipher;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setInn(Long inn) {
		Inn = inn;
	}

	public void setRegistrationDate(Date registrationDate) {
		RegistrationDate = registrationDate;
	}

	public void setType(String type) {
		Type = type;
	}

	public Date getRegistrationDate() {
		return RegistrationDate;
	}

	public Long getId() {
		return Id;
	}

	public Long getInn() {
		return Inn;
	}

	public String getCipher() {
		return Cipher;
	}

	public String getType() {
		return Type;
	}

	public String toString() {
		return "Bank {" + "Id = " + Id +
				", Cipher = " + Cipher +
				", Inn = "+ getInn() +
				", Type = "+ getType() +
				", Data = "+ getRegistrationDate();
	}
	
}
