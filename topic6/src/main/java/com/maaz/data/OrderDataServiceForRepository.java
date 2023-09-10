package com.maaz.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maaz.model.OrdersEntity;
import com.maaz.model.Services;

public class OrderDataServiceForRepository implements OrderDataAccessInterface<Services> {

	@Autowired
	OrdersRepositoryInterface ordersRepository;
	
	private JdbcTemplate jdbcTemplate;
	
	ModelMapper modelMapper = new ModelMapper();
	public OrderDataServiceForRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Services getByid(long id) {
	OrdersEntity entity=ordersRepository.findById(id).orElse(null);
	Services model=modelMapper.map(entity,Services.class);
	return model; 
	}

	@Override
	public List<Services> searchOrders(String searchTerm) {
	List<OrdersEntity> entites=ordersRepository.findByOrderNameIgnoreCase(searchTerm);
	List<Services> model=new ArrayList<Services>();
	for(OrdersEntity item:entites) {
		model.add(modelMapper.map(item,Services.class));
	}
		return model;
	}

	@Override
	public List<Services> getOrders() {
		Iterable<OrdersEntity> ordersEntity=ordersRepository.findAll();
		List<Services> model=new ArrayList<Services>();
		for(OrdersEntity item: ordersEntity) {
		 model.add(modelMapper.map(item,Services.class));
		}
		return null;
	}

	@Override
	public long addOne(Services newOrder) {
		OrdersEntity entity =modelMapper.map(newOrder, OrdersEntity.class);
		OrdersEntity result=ordersRepository.save(entity);
		if(result == null) {
			return 0;
			}
		else {
			return result.getId();
		}
	}

	@Override
	public boolean deleteOne(long id) {
		ordersRepository.deleteById(id);
		return true;
	}

	@Override
	public Services updateOne(long idToupdate, Services updateModel) {
		OrdersEntity entity=modelMapper.map(updateModel, OrdersEntity.class);
		OrdersEntity result =ordersRepository.save(entity);
		Services orders=modelMapper.map(result, Services.class);
		return orders;
	}

}
