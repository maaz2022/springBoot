package com.maaz.model;

public class Services {
	private long id;
	private String orderNo;
	private String orderName;
	private float price;
	private int quantity;
	
	
	public Services(long id, String orderNo, String orderName, float price, int quantity) {
		super();
		this.id = id;
		this.orderNo = orderNo;
		this.orderName = orderName;
		this.price = price;
		this.quantity = quantity;
	}
	


	@Override
	public String toString() {
		return "services [id=" + id + ", orderNo=" + orderNo + ", orderName=" + orderName + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
