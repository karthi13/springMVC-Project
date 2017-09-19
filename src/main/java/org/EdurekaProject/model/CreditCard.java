package org.EdurekaProject.model;

import org.springframework.stereotype.Service;

@Service
public class CreditCard {
	
	private String name;
	private String cardnumber;
	private int id;
//	private String expirymonth;
	private int cvv;
//	private String expiryyear;
	private int amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getExpirymonth() {
//		return expirymonth;
//	}
//	public void setExpirymonth(String expirymonth) {
//		this.expirymonth = expirymonth;
//	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
//	public String getExpiryYear() {
//		return expiryyear;
//	}
//	public void setExpiryYear(String expiryYear) {
//		this.expiryyear = expiryYear;
//	}
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(String name, String cardnumber, int id, String expirymonth, int cvv, String expiryYear) {
		super();
		this.name = name;
		this.cardnumber = cardnumber;
		this.id = id;
//		this.expirymonth = expirymonth;
		this.cvv = cvv;
//		this.expiryyear = expiryYear;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
