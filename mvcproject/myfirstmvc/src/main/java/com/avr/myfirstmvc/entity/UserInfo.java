package com.avr.myfirstmvc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
	private String username;
	private String password;
	private String confirm_password;
	private String first_name;
	private String last_name;
	private String email_add;
	@Id
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_add() {
		return email_add;
	}
	public void setEmail_add(String email_add) {
		this.email_add = email_add;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password + ", confirm_password=" + confirm_password
				+ ", first_name=" + first_name + ", last_name=" + last_name + ", email_add=" + email_add + "]";
	}
	
	
}
