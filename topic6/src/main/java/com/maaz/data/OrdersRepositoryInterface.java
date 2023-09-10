package com.maaz.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.maaz.model.OrdersEntity;

public interface OrdersRepositoryInterface extends CrudRepository<OrdersEntity,Long>{

	List<OrdersEntity> findByOrderNameIgnoreCase(String searchTerm);
}
