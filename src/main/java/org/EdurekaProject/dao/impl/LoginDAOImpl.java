package org.EdurekaProject.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.EdurekaProject.dao.LoginDAO;
import org.EdurekaProject.model.LoginMapper;
import org.EdurekaProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
		
	@Override
	public boolean checkLoginCredentials(User login) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user_accounts where username='" + login.getUsername() + "' and password='" + login.getPassword()+"'";
		System.out.println(login.getUsername() +  " " +login.getPassword());
		List<User> rowCount = jdbcTemplate.query(sql,new LoginMapper());
	
		for(User user : rowCount){
			System.out.println("username = " + user.getUsername());
			System.out.println("Password = " + user.getPassword());
			System.out.println();
		}
		if(rowCount.size() > 0){
			System.out.println("incase true");
			return true;
		}
		else{
			System.out.println("incase false");
			return false;
		}
	}

	@Override
	public void setDataSource(DataSource datasource1) {
		this.dataSource = datasource1;
		this.jdbcTemplate = new JdbcTemplate(datasource1);
	}


}
