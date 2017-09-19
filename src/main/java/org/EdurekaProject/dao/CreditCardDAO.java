package org.EdurekaProject.dao;

import javax.sql.DataSource;

import org.EdurekaProject.model.CreditCard;


public interface CreditCardDAO {
	
	public void setDataSource(DataSource dataSource);
	public boolean getCreditCardCredentials(CreditCard card);
}
