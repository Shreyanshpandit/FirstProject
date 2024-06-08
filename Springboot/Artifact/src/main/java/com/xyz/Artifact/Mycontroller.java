package com.xyz.Artifact;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mycontroller")
public class Mycontroller {
	
	@RequestMapping("/abc/")
	public String check() {
		return "WELCOME TO THE WORLD.. ";
	}

	@Value("${pen.brand:null}")
	String brand;
	@RequestMapping("/xyz/")
	public String check1() {
		return brand;
	}
	@RequestMapping("/pen")
	public ArrayList<Pen> checkPen() {
		Pen pen=new Pen();
		pen.setBrand("cello");
		pen.setColour("black");
		pen.setPrice(15);
		
		Pen pen1=new Pen();
		pen1.setBrand("cello");
		pen1.setColour("red");
		pen1.setPrice(10);
		
		ArrayList<Pen> al= new ArrayList<>();
		al.add(pen1);
		al.add(pen);
		
		return al;
		
	}
	@RequestMapping("/getStudent")
	public ArrayList<Object>  getStudent() throws ClassNotFoundException, SQLException {
		 Connection cn=Configuration.config();
		 Statement st= cn.createStatement();
		 String query="select * from student";
		ResultSet rs= st.executeQuery(query);
		ArrayList<Object>al=new ArrayList<>();
		while(rs.next()) {
			String id=rs.getString(1);
			String name=rs.getString(2);
			String  roll_no=rs.getString(3);
		
			al.add(id);
			al.add(name);
			al.add(roll_no);
		}
	
	return al;
			
	}
	
	
}
