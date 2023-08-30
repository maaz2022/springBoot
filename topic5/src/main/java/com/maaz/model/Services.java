package com.maaz.model;

public class Services {
	private int id;
	private int orderNo;
	private String orderName;
	private int price;
	private int quantity;
	
	
	public Services(int id, int orderNo, String orderName, int price, int quantity) {
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
