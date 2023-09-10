package com.maaz.data;

import java.util.HashMap;
import java.util.Map;
import java.util.List;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import com.maaz.model.OrderMapper;

import com.maaz.model.Services;

@Repository

public class OrderDataServices implements OrderDataAccessInterface <Services> {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Services getByid(long id) {
		List<Services> result =jdbcTemplate.query("SELECT * FROM orders WHERE ID =?",new OrderMapper(),id);
		if(result.size() >0) {
			return (result.get(0));
		}
		else {
		return null;
	}
		}

	@Override
	public List<Services> searchOrders(String searchTerm) {
		List<Services> result=jdbcTemplate.query("SELECT *FROM orders WHERE ORDER_NAME LIKE ?", new OrderMapper(),"%"+searchTerm+"%");
		return result;
	}

	@Override
	public List<Services> getOrders() {
		List<Services> result= jdbcTemplate.query("SELECT * FROM orders", new OrderMapper());
	return result;
	}


    @Override
    public long addOne(Services newOrder) {
        SimpleJdbcInsert simpleInsert = new SimpleJdbcInsert(jdbcTemplate)
            .withTableName("orders")
            .usingGeneratedKeyColumns("ID");

        Map<String,Object> parameter=new HashMap<String,Object>();
        parameter.put("ORDER_NO", newOrder.getOrderNo());
        parameter.put("ORDER_NAME", newOrder.getOrderName());
        parameter.put("PRICE", newOrder.getPrice());
        parameter.put("QTY", newOrder.getQuantity());

        Number result = simpleInsert.executeAndReturnKey(parameter);

        return result.longValue();
    }

	@Override
	public boolean deleteOne(long id) {
		int result=jdbcTemplate.update("DELETE FROM orders WHERE ID =?",id);
		if(result>0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Services updateOne(long idToupdate, Services updateModel) {
		int result=jdbcTemplate.update("UPDATE orders SET ORDER_NO = ?,ORDER_NAME = ?,PRICE = ?,QTY = ? WHERE ID = ?",
				updateModel.getOrderNo(),
				updateModel.getOrderName(),
				updateModel.getPrice(),
				updateModel.getQuantity(),
				idToupdate
				);
				if(result>0) {
					return(updateModel);
				}
			else {
				return null;
			}	
	}
	

}
