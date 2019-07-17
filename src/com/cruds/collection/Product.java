package com.cruds.collection;

public class Product {
	
	private int pid;
	private String pname;
	private double price;
	
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		System.out.println("HASHCODE " + this.pid);
		return this.pid;
	}
	
	@Override
	public boolean equals(Object obj) {
		Product other = (Product) obj;
		System.out.println("EQUALS ==> THIS PID" + this.pid + " OTHER " + other.getPid());
		return this.pid == other.getPid();
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

}
