package com.indium.java.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.indium.java.repository.OrderRepository;
import com.indium.java.repository.StockRepository;
import com.indium.java.repository.UserRepository;

public class DbService {
	
	@Autowired (required = false)
	OrderRepository orderRepository;
	
	@Autowired (required = false)
	StockRepository stockRepository;
	
	@Autowired (required = false)
	UserRepository userRepository;

}
