package com.study.entity;

import java.io.Serializable;

public class OrderInfo implements Serializable{
	private int orderId;
	private String number;
	
	public OrderInfo() {
		// TODO Auto-generated constructor stub
	}

	public OrderInfo(int orderId, String number) {
		super();
		this.orderId = orderId;
		this.number = number;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", number=" + number + "]";
	}
	
}
