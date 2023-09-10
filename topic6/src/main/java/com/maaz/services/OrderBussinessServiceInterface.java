package com.maaz.services;

import java.util.List;

import com.maaz.model.Services;

public interface OrderBussinessServiceInterface {
	public void test();
	public List<Services> getOrders();
	public void init();
	public void destroy();
	public Services getByid(long id);
	public List<Services> searchOrders(String searchTerm);

	
	public long addOne(Services newOrder);
	public boolean deleteOne(long id);
	public Services updateOne(long idToupdate,Services updateModel);

}
