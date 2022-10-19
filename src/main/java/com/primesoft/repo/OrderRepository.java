package com.primesoft.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primesoft.entity.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Integer> {

	Order findById(int id);

	/*
	@Modifying
	@Query(value= "UPDATE Order o set o.item =?2 where o.id =?")
	List<Order> updateById( @Param("id") Order o);

*/

	
	

	

}
