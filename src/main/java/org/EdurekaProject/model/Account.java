package org.EdurekaProject.model;

import org.springframework.stereotype.Service;

@Service
public class Account {

	private int id;
	private String FirstName;
	private String LastName;
	private String Address;
	private String PhoneNumber;
	private String City;
	private String State;
	private String Zipcode;
	private String Email;
	private String AccType;
	
	public String getAccType() {
		return AccType;
	}

	public void setAccType(String accType) {
		AccType = accType;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String firstName, String lastName, String address, String phoneNumber, String city, String state,
			String zipcode, String email,String accType) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		PhoneNumber = phoneNumber;
		City = city;
		State = state;
		Zipcode = zipcode;
		Email = email;
		AccType = accType;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZipcode() {
		return Zipcode;
	}

	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
