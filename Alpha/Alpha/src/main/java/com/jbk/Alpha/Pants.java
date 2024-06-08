package com.jbk.Alpha;

public class Pants {
	private String Type;
	private double Price;
	private String Colour;
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	@Override
	public String toString() {
		return "Jeans [Type=" + Type + ", Price=" + Price + ", Colour=" + Colour + "]";
	}
	
}
