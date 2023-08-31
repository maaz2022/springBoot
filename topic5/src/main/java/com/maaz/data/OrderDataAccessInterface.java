package com.maaz.data;

import java.util.List;

import com.maaz.model.Services;

public interface OrderDataAccessInterface {
	public Services getByid(long id);
	public List<Services> searchOrders(String searchTerm);
	public List<Services> getOrders();
	
	public long addOne(Services newOrder);
	public boolean deleteOne(long id);
	public Services updateOne(long idToupdate,Services updateModel);

}
