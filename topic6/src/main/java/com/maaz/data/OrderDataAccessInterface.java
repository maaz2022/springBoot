package com.maaz.data;

import java.util.List;

import com.maaz.model.Services;

public interface OrderDataAccessInterface <T>{
	public T getByid(long id);
	public List<T> searchOrders(String searchTerm);
	public List<T> getOrders();
	
	public long addOne(T newOrder);
	public boolean deleteOne(long id);
	public T updateOne(long idToupdate,T updateModel);

}
