package org.EdurekaProject.dao;

import javax.sql.DataSource;

import org.EdurekaProject.model.User;

public interface LoginDAO {
	
	public void setDataSource(DataSource dataSource);
	public boolean checkLoginCredentials(User login);
}
