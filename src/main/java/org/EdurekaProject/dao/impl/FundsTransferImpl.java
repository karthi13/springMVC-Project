package org.EdurekaProject.dao.impl;

import javax.sql.DataSource;

import org.EdurekaProject.dao.FundTransferDao;
import org.EdurekaProject.model.Transcation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class FundsTransferImpl implements FundTransferDao {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource datasource1) {
		// TODO Auto-generated method stub
		this.dataSource = datasource1;
		this.jdbcTemplate = new JdbcTemplate(datasource1);
	}

	@Override
	public void transcationRegister(Transcation transcation) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO user_transcations (date,acc_holder_name, acc_number, amt_in, amt_out, amt_balance) VALUES (?,?,?,?,?,?)";

		jdbcTemplate.update(sql, transcation.getDate(),
								 transcation.getAccountHolderName(),
								 transcation.getAccountNumber(),
								 transcation.getAmt_in(),
								 transcation.getAmt_out(),
								 transcation.getAmtBalance()
								 );
		System.out.println("Feeling finished");

		
		System.out.println("Updated into database");
	}

}
