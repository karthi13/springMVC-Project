package org.EdurekaProject.controller;

import org.EdurekaProject.dao.impl.CreditCardAuthentication;
import org.EdurekaProject.model.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreditCardConotroller {
	
	@Autowired
	CreditCard card;
	
	@Autowired
	CreditCardAuthentication authenticate;
	
	
	@RequestMapping(value="/credit",method=RequestMethod.GET)
	public String creditCArdGet(){
		return "CreditCardView";
	}
	
	
	@RequestMapping(value="/credit",method=RequestMethod.POST)
	public String creditCArdPost(ModelMap model,
								 @RequestParam String name,
								 @RequestParam String cardnumber,
								 @RequestParam int cvv,
								 @RequestParam int amount){
		
		card.setCardnumber(cardnumber);
		card.setCvv(cvv);
//		card.setExpirymonth(expirymonth);
//		card.setExpiryYear(expiryyear);
		card.setName(name);
		card.setAmount(amount);
		
		if(authenticate.getCreditCardCredentials(card)){

//			model.addAttribute("error","Transaction Hass been Approved");
			return "Menu";
		}
		else{
			model.addAttribute("error","Transaction Has been Rejected");
			return "CreditCardView";
		}
		
		
	}
}
