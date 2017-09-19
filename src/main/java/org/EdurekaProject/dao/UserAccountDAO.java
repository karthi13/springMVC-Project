package org.EdurekaProject.dao;

import javax.sql.DataSource;

import org.EdurekaProject.model.Account;

public interface UserAccountDAO {

	public void registerUser(Account account);

	void setDataSource(DataSource datasource1);
}
