package com.primesoft.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.primesoft.entity.Order;
import com.primesoft.repo.OrderRepository;


@Component
@Service
@Transactional
public class OrderDAOImpl implements OrderDAO {
	
	
	
	@Autowired
    OrderRepository ordrepo;
	
	
	public OrderDAOImpl(OrderRepository ordrepo) {
		
		this.ordrepo = ordrepo;
			
	}
    public List<Order> getOrders(){
		 return ordrepo.findAll();
		
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Order getOrder(int id) {
		
		return ordrepo.getById(id);
	}

	@Override
	public Order addOrders(Order ord) {
		ordrepo.save(ord);
		return ord;
	}
	
	public Order updateOrder(Order order) {
		ordrepo.save(order);
		return order;
	}
	
	
/*	public void deleteOrder(String iteam) {
		Order entity= ordrepo.getOne(iteam);
		ordrepo.delete(entity);
	}
*/
}
