package com.primesoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.dao.OrderDAOImpl;
import com.primesoft.entity.Menu;
import com.primesoft.entity.Order;
import com.primesoft.exception.MenuException;



@RestController
public class OrderController {

	
	@Autowired(required = true)
	private OrderDAOImpl ordDao;
	
	public OrderController(OrderDAOImpl ord) {
		
		this.ordDao = ord;
	}
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
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
	/*
	@PutMapping("/ordup/{id}")
	public boolean updateOrder(@RequestBody Order o) {
		return ordDao.updateOrder(o);
	}
	*/
	
	@GetMapping(value ="/menu/{name}")
	public ResponseEntity<?> SearchitemByName(@PathVariable("name") String name) {
		try {
			List<Menu> response = null;
			response = ordDao.getMenuIDByName(name);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (MenuException e) {
			return new ResponseEntity<>("Exception" + e.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
		}
	}      
	
	
	
	
}
