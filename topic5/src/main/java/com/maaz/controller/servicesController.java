package com.maaz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maaz.model.Services;

import com.maaz.services.OrderBussinessServiceInterface;

@Controller
@RequestMapping("/services")
public class servicesController {
	@Autowired
	OrderBussinessServiceInterface service;
	public servicesController(OrderBussinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String displayOrders(Model model) {		
		List<Services> orders=service.getOrders();
		model.addAttribute("products",orders);		
		return "orders.html";
	}
}
