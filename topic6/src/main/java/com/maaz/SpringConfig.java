package com.maaz;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;


import com.maaz.data.OrderDataAccessInterface;
import com.maaz.data.OrderDataServices;
import com.maaz.model.Services;
import com.maaz.data.OrderDataServiceForRepository;
import com.maaz.services.OrderBussinessService2;
import com.maaz.services.OrderBussinessServiceInterface;

@Configuration
public class SpringConfig {
    @Bean(name="OrderBussinessService", initMethod="init", destroyMethod="destroy")
    @RequestScope
    public OrderBussinessServiceInterface getOrdersBussiness() {
        return new OrderBussinessService2();
    }

    @Autowired
    DataSource dataSource;

    @Bean(name = "ordersDAO")
    @RequestScope
    public OrderDataAccessInterface orderDataAccessInterface() {
        return new OrderDataServiceForRepository(dataSource);
//        return new OrderDataServices();
    }
}

