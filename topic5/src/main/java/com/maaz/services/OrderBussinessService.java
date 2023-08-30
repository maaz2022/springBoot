package com.maaz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.maaz.model.Services;

public class OrderBussinessService implements OrderBussinessServiceInterface {

	List<Services> orders;

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void init() {
		System.out.println("service 1 initialized");
		orders=new ArrayList<Services>();

	}

	@Override
	public void destroy() {
		System.out.println("service 1 destroyed");
		
	}

	@Override
	public List<Services> getOrders() {
		
//		List<Services> orders=new ArrayList<Services>();
		
		orders.add(new Services(1,1,"mobile",1500,2));
		orders.add(new Services(2,10,"headphone",150,3));
		orders.add(new Services(3,12,"ipad",1506,6));
		orders.add(new Services(4,15,"mobile cover",125,8));
		orders.add(new Services(5,5,"mac-book",15000,12));
		orders.add(new Services(6,2,"mouse",150,23));
		return orders;
	}
	
}
