package org.EdurekaProject.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

public interface TranscationDAO {

	public 	void setDataSource(DataSource datasource1);
	
	public List<Map<String, Object>> getStatement();
}
