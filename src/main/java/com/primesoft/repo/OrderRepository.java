package com.primesoft.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.primesoft.entity.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Integer> {

	Order findById(int id);

	
	
	@Query(value= "UPDATE Order o set o.item =:ordName where o.id =:id")
	List<Order> updateById(@Param("id") int id);



	
	

	

}
