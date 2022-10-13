package com.primesoft.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.dao.OrderDAOImpl;
import com.primesoft.entity.Order;



@RestController
public class OrderController {

	
	//private OrderRepository ord;
	private OrderDAOImpl ordDao;
	public OrderController(OrderDAOImpl ord) {
		
		this.ordDao = ord;
	}
	
	
	@GetMapping("/ord")
	public List<Order> retriveAllOrders(){
		return ordDao.getOrders();
		
	}
	
	@GetMapping("/ord/{id}")
	public Order getOrder(@PathVariable int id){
		 return ordDao.getOrder(id);
		 
		
	}
	
	@PostMapping("/ords")
	public Order addOrder(@RequestBody Order or) {
		return ordDao.addOrders(or);
	}
	
	@DeleteMapping("/order/{id}")
	public void deleteOrder(@PathVariable int id) {
	     ordDao.deleteById(id);
	}
	
	@PostMapping("/ordup/{id}")
	public boolean updateOrder(@RequestBody int id,Order order) {
		return ordDao.updateOrder(id,order);
	}
	
	
	
	
	
	
	
	
}
