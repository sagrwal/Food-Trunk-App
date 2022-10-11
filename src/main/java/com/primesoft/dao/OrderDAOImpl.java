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



	public boolean findAll(){
		try {
			 List<Order> o = ordrepo.findAll();
			 System.out.println(o);
			 return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
			
		}
		
	}

}
