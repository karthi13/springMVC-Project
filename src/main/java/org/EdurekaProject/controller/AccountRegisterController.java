package org.EdurekaProject.controller;

import org.EdurekaProject.dao.impl.UserAccountDAOImpl;
import org.EdurekaProject.model.Account;
import org.EdurekaProject.model.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountRegisterController {

	@Autowired
	Account account;
	
	@Autowired
	UserAccountDAOImpl userRegister;
	
	@Autowired
	AccountService service;
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String createAccountGet(){
		return "createAccount";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String createAccountPost(ModelMap model,
									@RequestParam String firstname,
									@RequestParam String lastname,
									@RequestParam String address,
									@RequestParam String city,
									@RequestParam String state,
									@RequestParam String zipcode,
									@RequestParam String pnumber,
									@RequestParam String email,
									@RequestParam String accType
									){
		account.setAddress(address);
		account.setCity(city);
		account.setEmail(email);
		account.setFirstName(firstname);
		account.setLastName(lastname);
		account.setPhoneNumber(pnumber);
		account.setState(state);
		account.setZipcode(zipcode);
		account.setAccType(accType);
		
		userRegister.registerUser(account);
		System.out.println();
		return "Menu";
	}
	
//	@RequestMapping(value="/create",method=RequestMethod.POST)
//	public String createAccountPost(){//userRegister.registerUser(account);
//		System.out.println();
//		return "redirect:Menu";
//	}
	
}
