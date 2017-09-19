package org.EdurekaProject.controller;

import org.EdurekaProject.dao.impl.LoginDAOImpl;
import org.EdurekaProject.model.LoginService;
import org.EdurekaProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@Autowired
	LoginService service;
	@Autowired
	User user;
	@Autowired
	LoginDAOImpl logindao;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String viewLogin(){
		return "login";		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginProcess(ModelMap model,@RequestParam String name,@RequestParam String password){
		
		user.setUsername(name);
		user.setPassword(password);
		
		if(logindao.checkLoginCredentials(user)){
			return "Menu";
			
		}
		else{
			model.put("error", "Invalid Credentials");
			return "login";
		}
	}
}
