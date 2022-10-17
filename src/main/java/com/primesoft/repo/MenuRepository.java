package com.primesoft.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.primesoft.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu,Integer>{

	@Query(value = "SELECT m.id,m.truckname,m.item,m.price,m.offer FROM Menu m where m.item =:item", nativeQuery = true)
    List<Menu> getMenuIDByName(@Param("item") String item);
	
	
	
}
