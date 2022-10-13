package com.primesoft.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="orders",schema="food_truck")
public class Order {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name="iteam")
	private String iteam;
	
	@Column(name="quantity")
	private float quantity;
	
	@Column(name="additeam")
	private String additionalIteam;
	
	@Column(name="offer")
	private float offer;
	
	@Column(name="deliverytime")
	private int deliveryTime;
	
	@Column(name="filter")
	private String filter;
	
	@Column(name="coupon")
	private String coupon;
	
	@Column(name="price")
	private float price;
	
	
	
	public Order() {
		
	}
	public Order(String iteam, float quantity, String additionalIteam, float offer, int deliveryTime, String filter,
			String coupon, float price) {
		
		this.iteam = iteam;
		this.quantity = quantity;
		this.additionalIteam = additionalIteam;
		this.offer = offer;
		this.deliveryTime = deliveryTime;
		this.filter = filter;
		this.coupon = coupon;
		this.price = price;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public int getId() {
		return  id;
	}
	public String getIteam() {
		return iteam;
	}
	public void setIteam(String iteam) {
		this.iteam = iteam;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getAdditionalIteam() {
		return additionalIteam;
	}
	public void setAdditionalIteam(String additionalIteam) {
		this.additionalIteam = additionalIteam;
	}
	public float getOffer() {
		return offer;
	}
	public void setOffer(float offer) {
		this.offer = offer;
	}
	public int getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", iteam=" + iteam + ", quantity=" + quantity + ", additionalIteam="
				+ additionalIteam + ", offer=" + offer + ", deliveryTime=" + deliveryTime + ", filter=" + filter
				+ ", coupon=" + coupon + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
