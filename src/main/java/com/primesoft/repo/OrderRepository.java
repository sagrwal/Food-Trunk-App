package com.primesoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primesoft.entity.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Integer> {

	Order findByIteam(String iteam);

	

}
