package org.EdurekaProject.dao;

import javax.sql.DataSource;

import org.EdurekaProject.model.Transcation;

public interface FundTransferDao {
	
	public 	void setDataSource(DataSource datasource1);
	
	public void transcationRegister(Transcation transcation);

}
