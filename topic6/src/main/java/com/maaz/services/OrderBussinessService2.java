package com.maaz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.maaz.data.OrderDataAccessInterface;
import com.maaz.model.Services;

public class OrderBussinessService2 implements OrderBussinessServiceInterface {

	@Autowired
	OrderDataAccessInterface<Services> ordersDAO;
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Services> getOrders() {
		
		return ordersDAO.getOrders();
	}

	@Override
	public void init() {
		System.out.println("service 2 initialized");
	}

	@Override
	public void destroy() {
		System.out.println("service 2 destroyed");
		
	}

	@Override
	public Services getByid(long id) {
		
		return ordersDAO.getByid(id);
	}

	@Override
	public List<Services> searchOrders(String searchTerm) {
		
		return ordersDAO.searchOrders(searchTerm);
	}

	@Override
	public long addOne(Services newOrder) {
		// TODO Auto-generated method stub
		return ordersDAO.addOne(newOrder);
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return ordersDAO.deleteOne(id);
	}

	@Override
	public Services updateOne(long idToupdate, Services updateModel) {
		// TODO Auto-generated method stub
		return ordersDAO.updateOne(idToupdate, updateModel);
	}
	
}
