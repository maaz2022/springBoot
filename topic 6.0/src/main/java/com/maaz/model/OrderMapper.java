package com.maaz.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrderMapper implements RowMapper<Services> {

	@Override
	public Services mapRow(ResultSet rs, int rowNum) throws SQLException {
		Services service= new Services(rs.getLong("ID"),rs.getString("Order_NO"),rs.getString("ORDER_NAME"),rs.getFloat("PRICE"),rs.getInt("QTY"));
		return service;
	}
}