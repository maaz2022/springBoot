package com.maaz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.maaz.model.Services;
//@Primary
public class OrderBussinessService2 implements OrderBussinessServiceInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Services> getOrders() {
		
		List<Services> orders=new ArrayList<Services>();
		
		orders.add(new Services(1,1,"samsung",1500,2));
		orders.add(new Services(2,10,"huawei",150,3));
		orders.add(new Services(3,12,"iphone",1506,6));
		orders.add(new Services(4,15,"nokiar",125,8));
		orders.add(new Services(5,5,"red-mi",15000,12));
		orders.add(new Services(6,2,"oppo",150,23));
		return orders;
	}

	@Override
	public void init() {
		System.out.println("service 2 initialized");
	}

	@Override
	public void destroy() {
		System.out.println("service 2 destroyed");
		
	}
	
}
