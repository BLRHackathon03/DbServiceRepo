package com.indium.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.indium.java.repository.OrderRepository;
import com.indium.java.repository.StockRepository;
import com.indium.java.repository.UserRepository;

@Service
@Component
public class DbService {
	
	@Autowired (required = false)
	OrderRepository orderRepository;
	
	@Autowired (required = false)
	StockRepository stockRepository;
	
	@Autowired (required = false)
	UserRepository userRepository;

	  @KafkaListener(topics = "stock-events-t2")
	  public void consume() {

	    System.out.println(String.format("Task status is updated : "));
	  }
	
}
