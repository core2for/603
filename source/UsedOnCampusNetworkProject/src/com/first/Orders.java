package com.first;

import java.util.Date;

public class Orders {
	private String orderId;
	private String orderCustomer;
	private String orderPhone;
	private String orderAddress;
	private String orderDate;
	private int orderStatus;
	private String orderRemark;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderCustomer() {
		return orderCustomer;
	}
	public void setOrderCustomer(String orderCustomer) {
		this.orderCustomer = orderCustomer;
	}
	public String getOrderPhone() {
		return orderPhone;
	}
	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderRemark() {
		return orderRemark;
	}
	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}
	public Orders(){}
	public Orders(String orderCustomer, String orderPhone, String orderAddress, String orderDate, int orderStatus, String orderRemark) {
		this.orderCustomer = orderCustomer;
		this.orderPhone = orderPhone;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.orderRemark = orderRemark;
	}
}
