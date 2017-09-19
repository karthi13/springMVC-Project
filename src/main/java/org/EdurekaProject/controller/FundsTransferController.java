package org.EdurekaProject.controller;


import org.EdurekaProject.dao.impl.FundsTransferImpl;
import org.EdurekaProject.model.Transcation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FundsTransferController {
	
	@Autowired
	Transcation transcation;
	
	@Autowired
	FundsTransferImpl fti;
		
	@RequestMapping(value="/transfer",method=RequestMethod.GET)
	public String creditCArdGet(){
		return "transferfunds";
	}
	
	
	@RequestMapping(value="/transfer",method=RequestMethod.POST)
	public String creditCArdPost(ModelMap model,
								 @RequestParam String accountHolderName,
								 @RequestParam int accountNumber,
								 @RequestParam int transferAmt,
								 @RequestParam String debit){
		
		transcation.setAccountHolderName(accountHolderName);
		transcation.setAccountNumber(accountNumber);
		transcation.setDate(new java.util.Date());
		if(debit.equals("debit")){
			transcation.setAmt_out(transferAmt);
			transcation.setAmt_in(0);
			transcation.setAmtBalance(0);
		}
		else{
		transcation.setAmt_in(transferAmt);
		transcation.setAmt_out(0);
		transcation.setAmtBalance(0);
		}
		fti.transcationRegister(transcation);
		System.out.println("Exiting controller");
		return "Menu";
	}
}
