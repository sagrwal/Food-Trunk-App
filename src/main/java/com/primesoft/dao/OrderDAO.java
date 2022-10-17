package com.primesoft.dao;
import java.util.List;

import com.primesoft.entity.Menu;
import com.primesoft.entity.Order;

public interface OrderDAO {
	
	public List<Order> getOrders();

	public Order getOrder(int id);
	
	public Order addOrders(Order ord);
	//public boolean updateOrder(int id);
	public void deleteById(int id);

	List<Menu> getMenuIDByName(String name);

	boolean updateOrder(int id);
	

}
