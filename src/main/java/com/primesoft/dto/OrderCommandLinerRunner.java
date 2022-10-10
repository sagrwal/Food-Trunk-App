package com.primesoft.dto;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.primesoft.entity.Order;
import com.primesoft.repo.OrderRepository;

@Component
public class OrderCommandLinerRunner implements CommandLineRunner{

	@Autowired
	private OrderRepository ordRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ordRepo.save(new Order("Biryani",2.0f,"Coack",0.2f,LocalDate.now(),"xyz","mno",205.00f));
		System.out.println(ordRepo.findAll());
		
	}

}
