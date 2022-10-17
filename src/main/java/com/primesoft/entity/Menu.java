package com.primesoft.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu",schema="food_truck")
public class Menu {
	
	private static final long serialVersionUID = 1L;  
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="truckname")
	private String foodTruckName;
	
	@Column(name="item")
	private String items;
	
	@Column(name="price")
	private float price;
	
	@Column(name="offer")
	private float offer;
	
	
	public String getFoodTruckName() {
		return foodTruckName;
	}
	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getOffer() {
		return offer;
	}
	public void setOffer(float offer) {
		this.offer = offer;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", foodTruckName=" + foodTruckName + ", iteams=" + items + ", price=" + price
				+ ", offer=" + offer + "]";
	}
	
	
	
	
	

}
