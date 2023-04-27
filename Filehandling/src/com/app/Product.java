package com.app;

import java.io.Serializable;

public class Product implements Serializable {
	private transient int pid;//transient does not allow to partient in
	private String pName;
	private int qty;
	private double price;
	public int getpid() {
		return pid;
		}
	public int getPid() {
		return pid;
	}
	
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", qty=" + qty + ", price=" + price + "]";
	}

}
