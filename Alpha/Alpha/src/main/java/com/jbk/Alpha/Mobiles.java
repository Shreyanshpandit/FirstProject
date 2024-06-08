package com.jbk.Alpha;

public class Mobiles {
	private String name;
	private double price;
	private String Android_Version;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAndroid_Version() {
		return Android_Version;
	}
	public void setAndroid_Version(String android_Version) {
		Android_Version = android_Version;
	}
	@Override
	public String toString() {
		return "Mobiles [name=" + name + ", price=" + price + ", Android_Version=" + Android_Version + "]";
	}
	
}
