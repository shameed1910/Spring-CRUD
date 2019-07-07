package com.springboot.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> 
{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Customer customer=new Customer();
		customer.setId(rs.getInt("id"));
		customer.setName(rs.getString("name"));
		customer.setEmail(rs.getString("email"));
		customer.setCommodity(rs.getString("commodity"));
		customer.setWeight(rs.getInt("weight"));
		customer.setWeight_desc(rs.getString("weight_desc"));
		customer.setRupees(rs.getInt("rupees"));
		customer.setPurchase_date(rs.getDate("purchase_date"));

		return customer;
	}

}
