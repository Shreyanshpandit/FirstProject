package com.TypesOfRequestMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("name/")
public class HappyController {

	@PutMapping("/update/{uname}")
	public String updatewithpathvariable(@PathVariable("uname") String uname) {
		String name = "Vishay";
		System.out.println("Before = "+name);
		
		name=uname;
		System.out.println("After = "+name);
		return "data Updated";
	}
	
	@PutMapping("/update1")
	public String updatewithbody(@RequestBody String uname) {
		String name = "Vishay";
		System.out.println("Before = "+name);
		
		name=uname;
		System.out.println("After = "+name);
		return "data Updated";
	}
	@PostMapping("insert/{uname}")
	String insertname(@PathVariable ("uname") String uname) {
		System.out.println(uname);
		return "Data Inserted";
	}
	
}
