package org.EdurekaProject.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Service;

@Service
public class User {

	@NotEmpty
	private String username;
	@NotEmpty(message = "Please Enter your Password.")
	@Size(min = 5, max = 15, message = "Your password must be 5 - 15 characters.")
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
