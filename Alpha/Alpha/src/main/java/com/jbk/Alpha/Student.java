package com.jbk.Alpha;

public class Student {
	private int rollno ;
	private String name;
	private double perc;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", perc=" + perc + "]";
	}
	
}
