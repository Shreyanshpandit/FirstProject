package com.thekiranacademy.Artifact;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("Vishay")
	String FirstAPI() {
		return "Vishay Ahe Ka";
	}
	
	@RequestMapping("Name")
	ArrayList<String> ShowName() {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Vishay");
		al.add("Ahe");
		al.add("Ka");
		al.add("Re");
		
		return al;
	}
	@RequestMapping("Hashmap")
	HashMap<Integer, String>  check() {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Shrii");
		hm.put(2, "Shreyan");
		hm.put(3, "Shreyansh");
		hm.put(4, "Virat");
		hm.put(5, "Vir");
		
		return hm;
		
	}
	
}
