package com.jbk.Alpha;

public class Tshirts {
	private String Brandname;
	private double price;
	private char size;
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String brandname) {
		Brandname = brandname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Tshirts [Brandname=" + Brandname + ", price=" + price + ", size=" + size + "]";
	}
	
}
