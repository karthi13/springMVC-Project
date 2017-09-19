package org.EdurekaProject.model;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class Transcation {
	
	private int ID;
	private String AccountHolderName;
	private int AccountNumber;
	private Date Date;
	private int Amt_in;
	private int Amt_out;
	private int AmtBalance;
	
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		this.Date = date;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getAmt_in() {
		return Amt_in;
	}
	public void setAmt_in(int amt_in) {
		Amt_in = amt_in;
	}
	public int getAmt_out() {
		return Amt_out;
	}
	public void setAmt_out(int amt_out) {
		Amt_out = amt_out;
	}
	public int getAmtBalance() {
		return AmtBalance;
	}
	public void setAmtBalance(int amtBalance) {
		AmtBalance = amtBalance;
	}
	public Transcation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transcation( String accountHolderName, int accountNumber, int amt_in, int amt_out, int amtBalance,Date date) {
		super();
		AccountHolderName = accountHolderName;
		AccountNumber = accountNumber;
		Amt_in = amt_in;
		Amt_out = amt_out;
		AmtBalance = amtBalance;
		Date = date;
	}

	
}
