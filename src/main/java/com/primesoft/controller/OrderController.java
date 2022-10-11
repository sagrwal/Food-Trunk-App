package com.primesoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.entity.Order;
import com.primesoft.repo.OrderRepository;

@RestController
@RequestMapping("/api/or")
public class OrderController {

	@Autowired
	private OrderRepository repo;

	public OrderController(OrderRepository repo) {
		
		this.repo = repo;
	}
	@GetMapping("/H")
	public String home() {
		return "Hello";
	}
	
	
	@GetMapping("/order")
	public List<Order> retriveAllOrders(){
		return repo.findAll();
		
	}
	@PostMapping("/orders")
	public Order createOrder(@RequestBody Order ord) {
		return repo.save(ord);
	}
	
	
	
	
	
}
