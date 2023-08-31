package com.maaz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


import com.maaz.services.OrderBussinessService2;
import com.maaz.services.OrderBussinessServiceInterface;

@Configuration
public class SpringConfig {
	@Bean(name="OrderBussinessService" ,initMethod="init",destroyMethod="destroy")
	@RequestScope
	public OrderBussinessServiceInterface getOrdersBussiness() {
		return new OrderBussinessService2();
	}
}
