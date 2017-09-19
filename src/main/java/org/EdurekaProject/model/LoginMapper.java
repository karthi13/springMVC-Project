package org.EdurekaProject.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LoginMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet res, int arg1) throws SQLException {
		
		User user = new User();
		user.setUsername(res.getString("username"));
		user.setPassword(res.getString("password"));
		return user;
		
	}

}
