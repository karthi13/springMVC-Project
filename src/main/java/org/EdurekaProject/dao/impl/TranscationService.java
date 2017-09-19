package org.EdurekaProject.dao.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.EdurekaProject.dao.TranscationDAO;
import org.EdurekaProject.model.Transcation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TranscationService implements TranscationDAO{

	@Autowired
	Transcation trans;
	
	@Autowired
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource datasource1) {
		// TODO Auto-generated method stub
		this.dataSource = datasource1;
		this.jdbcTemplate = new JdbcTemplate(datasource1);
	}

	@Override
	public List<Map<String, Object>> getStatement() {
		// TODO Auto-generated method stub
		String query = "Select * from user_transcations";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
		
		for (Map<String, Object> employee : list) {
			for (Iterator<Map.Entry<String, Object>> it = employee.entrySet().iterator(); it.hasNext();) {
				Map.Entry<String, Object> entry = it.next();
				      String key = entry.getKey();
				      Object value = entry.getValue();
				      System.out.println(key + " = " + value);
			}
			System.out.println();		                 
		}
		
		return list;
	}

	
}
