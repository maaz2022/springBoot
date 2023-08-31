package com.maaz.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.maaz.model.Services;

@Repository
public class OrdersFakeDAO implements OrderDataAccessInterface {
	
	List<Services> orders=new ArrayList<Services>();
	public OrdersFakeDAO() {
		orders.add(new Services(1,1,"samsung",1500,2));
		orders.add(new Services(2,10,"huawei",150,3));
		orders.add(new Services(3,12,"iphone",1506,6));
		orders.add(new Services(4,15,"nokiar",125,8));
		orders.add(new Services(5,5,"red-mi",15000,12));
		orders.add(new Services(6,2,"oppo",150,23));
	}

	@Override
	public Services getByid(long id) {
		for(int i=0;i<orders.size();i++) {
			if(orders.get(i).getId()==id) {
				return orders.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Services> searchOrders(String searchTerm) {
//		ArrayList<Services> foundItems=new ArrayList<Services>();
//		for(int i=0;i<orders.size();i++) {
//			if(orders.get(i).getOrderName().toLowerCase().contains(searchTerm.toLowerCase())) {
//				foundItems.add(orders.get(i));
//			}
//		}
		
//		return foundItems;
		List<Services> Items=orders
				.stream()
				.filter(o ->o.getOrderName().toLowerCase()
					.contains(searchTerm.toLowerCase()))
				.collect(Collectors.toList());
		return Items;
				
	}

	@Override
	public List<Services> getOrders() {
		
		return orders;
	}

	@Override
	public long addOne(Services newOrder) {
		boolean success=orders.add(newOrder);
		if(success) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean deleteOne(long id) {
		for(int i=0;i<orders.size();i++) {
			if(orders.get(i).getId()==id) {
				orders.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Services updateOne(long idToupdate, Services updateModel) {
		for(int i=0;i<orders.size();i++) {
			if(orders.get(i).getId()==idToupdate) {
				orders.set(i, updateModel);
				orders.get(i);
			}
		}
		return null;
	}

}
