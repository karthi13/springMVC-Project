package org.EdurekaProject.controller;

import org.EdurekaProject.dao.impl.TranscationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankStatementController {
	
	@Autowired
	TranscationService service;
	
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public String creditCArdGet(){
		return "bankstatement";
	}
	
	
	@RequestMapping(value="/display",method=RequestMethod.POST)
	public String creditCardPost(ModelMap map){
		map.addAttribute("statement", service.getStatement());
		return "Menu";
	}
}
