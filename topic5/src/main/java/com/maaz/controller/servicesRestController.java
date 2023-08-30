package com.maaz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maaz.model.Services;
import com.maaz.services.OrderBussinessService;
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
}
