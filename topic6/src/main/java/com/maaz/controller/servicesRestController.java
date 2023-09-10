package com.maaz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maaz.model.Services;

import com.maaz.services.OrderBussinessServiceInterface;

@RestController
@RequestMapping("/api/v1/order")
public class servicesRestController {
	
	OrderBussinessServiceInterface service;

	@Autowired
	public servicesRestController(OrderBussinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public List<Services> displayOrders() {		
		List<Services> orders=service.getOrders();
				
		return orders;
	}
	
	@GetMapping("/search/{searchTerm}")
	public List<Services> displaySearchorders(@PathVariable(name="searchTerm") String searchTerm) {		
		List<Services> orders=service.searchOrders(searchTerm);
				
		return orders;
	}
	
	@PostMapping("/")
	public long addOrder(@RequestBody Services model) {
		return service.addOne(model);
	}
	@GetMapping("/{id}")
	public Services getId(@PathVariable(name="id")long id) {
		return service.getByid(id);
	}
	
	@GetMapping("/delete/{id}")
	public boolean deltOrder(@PathVariable(name="id") long id) {
		return service.deleteOne(id);
	}
	@PutMapping("/update/{id}")
	public Services updateOrder(@RequestBody Services model,@PathVariable(name="id") Long id) {
		return service.updateOne(id, model);
	}
}
