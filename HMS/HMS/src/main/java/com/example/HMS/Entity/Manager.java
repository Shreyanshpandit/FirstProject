package com.example.HMS.Entity;

public class Manager {
	private	int Manager_Id;
	private	String Manager_Name;
	private	String Manager_Sal;
	private	String Manager_Branch_Name;
	public int getManager_Id() {
		return Manager_Id;
	}
	public void setManager_Id(int manager_Id) {
		Manager_Id = manager_Id;
	}
	public String getManager_Name() {
		return Manager_Name;
	}
	public void setManager_Name(String manager_Name) {
		Manager_Name = manager_Name;
	}
	public String getManager_Sal() {
		return Manager_Sal;
	}
	public void setManager_Sal(String manager_Sal) {
		Manager_Sal = manager_Sal;
	}
	public String getManager_Branch_Name() {
		return Manager_Branch_Name;
	}
	public void setManager_Branch_Name(String manager_Branch_Name) {
		Manager_Branch_Name = manager_Branch_Name;
	}
	@Override
	public String toString() {
		return "Manager [Manager_Id=" + Manager_Id + ", Manager_Name=" + Manager_Name + ", Manager_Sal=" + Manager_Sal
				+ ", Manager_Branch_Name=" + Manager_Branch_Name + "]";
	}
	
	
}
