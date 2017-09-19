package org.EdurekaProject.dao.impl;

import javax.sql.DataSource;

import org.EdurekaProject.dao.UserAccountDAO;
import org.EdurekaProject.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class UserAccountDAOImpl implements UserAccountDAO {

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource datasource1) {
		this.dataSource = datasource1;
		this.jdbcTemplate = new JdbcTemplate(datasource1);
	}
	
	@Override
	public void registerUser(Account account) {
		
		String sql = "Insert into user_profile (firstname,lastname,address,pnumber,city,state,zipcode,email,accType) values (?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,
							account.getFirstName(),
							account.getLastName(),
							account.getAddress(),
							account.getPhoneNumber(),
							account.getCity(),
							account.getState(),
							account.getZipcode(),
							account.getEmail(),
							account.getAccType());
		System.out.println("Updated into database");
	}

}
