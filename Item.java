package com;

public class Item {
	
	private double shippingWeight;
	public double getShippingWeight() {return shippingWeight;}
	public void setShippingWeight(double shippingWeight) {this.shippingWeight = shippingWeight;}
	
	private String description;
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	
	private OrderDetail orderdetail = new OrderDetail();
	public OrderDetail getOrderdetail() {return orderdetail;}
	public void setOrderdetail(OrderDetail orderdetail) {this.orderdetail = orderdetail;}
	
	

}
