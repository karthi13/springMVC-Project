package org.EdurekaProject.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CreditCardMapper implements RowMapper<CreditCard> {

	@Override
	public CreditCard mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
		CreditCard card = new CreditCard();
		card.setCardnumber(rs.getString("card_number"));
		card.setName(rs.getString("name"));
		card.setCvv(rs.getInt("cvv"));
		card.setAmount(rs.getInt("amount"));
//		card.setExpirymonth(rs.getString("expirymonth"));
//		card.setExpiryYear(rs.getString("expiryyear"));
		return card;
	}

}
