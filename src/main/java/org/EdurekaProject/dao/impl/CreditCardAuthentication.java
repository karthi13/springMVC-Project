package org.EdurekaProject.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.EdurekaProject.dao.CreditCardDAO;
import org.EdurekaProject.model.CreditCard;
import org.EdurekaProject.model.CreditCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreditCardAuthentication implements CreditCardDAO {

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource datasource1) {
		this.dataSource = datasource1;
		this.jdbcTemplate = new JdbcTemplate(datasource1);
	}

	@Override
	public boolean getCreditCardCredentials(CreditCard card) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM credit_card WHERE card_number='"+card.getCardnumber()+"'";
		List<CreditCard> list = jdbcTemplate.query(sql, new CreditCardMapper());
		
		if(list.size() == 1){
			for(CreditCard cards : list){
				if(card.getAmount() > cards.getAmount()){
					return false;
				}
			}
			return true;
		}
		else{
			return false;
		}
	}


}
