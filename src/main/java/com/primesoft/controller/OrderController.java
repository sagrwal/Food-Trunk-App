package com.primesoft.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.entity.Order;
import com.primesoft.repo.OrderRepository;


@RestController
public class OrderController {

	
	private OrderRepository ord;
	
	public OrderController(OrderRepository ord) {
		
		this.ord = ord;
	}


	@GetMapping("/H")
	public String home() {
		return "Hello";
	}
	
	
	@GetMapping("/ord")
	public List<Order> retriveAllOrders(){
		return ord.findAll();
		
	}
	@GetMapping("/ord/{id}")
	public Optional<Order> getOrder(@PathVariable int id){
		return ord.findById(id);
	}
	
	
	@PostMapping("/ords")
	public Order addOrder(@RequestBody Order or) {
		return ord.save(or);
	}
	
	
	
	
	
	
	
	
	
}
