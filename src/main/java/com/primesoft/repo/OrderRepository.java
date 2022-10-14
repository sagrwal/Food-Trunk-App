package com.primesoft.repo;

import java.util.Optional;

import javax.servlet.Registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primesoft.entity.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Integer> {

	Order findById(int id);

	//void saveAll(Registration reg);

	

}
