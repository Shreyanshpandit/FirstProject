package com.jbk.Alpha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("name/")
public class HappyController {

	@Value("${env.name}")
	int envvirnmentName;
	@RequestMapping("value")
	int number() {
		return envvirnmentName;
	}

	@RequestMapping("Employee")
	List<Employee> emp() {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Shreyansh");
		e1.setSal(25000);

		Employee e2 = new Employee();
		e2.setId(3);
		e2.setName("Shrii");
		e2.setSal(35000);

		Employee e3 = new Employee();
		e3.setId(5);
		e3.setName("Shreya");
		e3.setSal(29000);

		List<Employee> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);

		return l;
	}


	@RequestMapping("Student")
	List<Student> Student() {
		Student s1 = new Student();
		s1.setName("Shri");
		s1.setPerc(88.83);
		s1.setRollno(1);

		Student s2 = new Student();
		s2.setName("Shreya");
		s2.setPerc(78.30);
		s2.setRollno(2);

		Student s3 = new Student();
		s3.setName("Shuu");
		s3.setPerc(75.90);
		s3.setRollno(3);

		Student s4 = new Student();
		s4.setName("Shanch");
		s4.setPerc(89.81);
		s4.setRollno(4);

		List<Student> l = new LinkedList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);

		return l;
	}
	@RequestMapping("Tshirts")
	Map<Integer, Tshirts> Tshirts() {
		Tshirts t1 = new Tshirts();
		t1.setBrandname("Puma");
		t1.setPrice(999);
		t1.setSize('L');

		Tshirts t2 = new Tshirts();
		t2.setBrandname("HRX");
		t2.setPrice(799);
		t2.setSize('M');

		Tshirts t3 = new Tshirts();
		t3.setBrandname("Nike");
		t3.setPrice(549);
		t3.setSize('S');

		Map<Integer, Tshirts> m = new HashMap();
		m.put(1, t1);
		m.put(2, t2);
		m.put(3, t3);
		return m;

	}
	@RequestMapping("After_10th_What_You_wanna_Do")
	Map<Integer, After_10th> After_10th(){ {
		After_10th a1 = new After_10th();
		a1.setField("Science");
		a1.setYear_of_field(2);
		a1.setSubject("Phisics , Chemistry , Maths");

		After_10th a2 = new After_10th();
		a2.setField("Commerse");
		a2.setYear_of_field(2);
		a2.setSubject("Accounting");

		After_10th a3 = new After_10th();
		a3.setField("Science");
		a3.setYear_of_field(2);
		a3.setSubject("Sanskrit , Marathi , Hindi");

		Map<Integer, After_10th> m = new TreeMap<>();
		m.put(1, a1);
		m.put(2, a2);
		m.put(3, a3);
		return m;
	}
	}
	@RequestMapping("Pants")
	Map<Integer, Pants> Pants() {
		Pants j1 = new Pants();
		j1.setType("Cotton Jean");
		j1.setColour("Brown");
		j1.setPrice(899);

		Pants j2 = new Pants();
		j2.setType("Cargoes");
		j2.setColour("Black");
		j2.setPrice(599);

		Pants j3 = new Pants();
		j3.setType("Jeans");
		j3.setColour("Skyblue");
		j3.setPrice(799);

		Map<Integer, Pants> s = new LinkedHashMap<>();
		s.put(1, j1);
		s.put(2, j2);
		s.put(3, j3);
		return s;
	}
	@RequestMapping("Mobiles")
	Set<Mobiles> Mobiles() {
		Mobiles m1 = new Mobiles();
		m1.setName("1+ Nord CE 2");
		m1.setAndroid_Version("Android 13");
		m1.setPrice(24999);

		Mobiles m2 = new Mobiles();
		m2.setName("Realme 10");
		m2.setAndroid_Version("Android 12");
		m2.setPrice(18999);

		Mobiles m3 = new Mobiles();
		m3.setName("xiaomi 11i");
		m3.setAndroid_Version("Android 13");
		m3.setPrice(19999);

		Set<Mobiles> s = new HashSet<>();
		s.add(m1);
		s.add(m2);
		s.add(m3);
		return s;
	}

	@RequestMapping("IPL")
	Set<IPL> Ipl() {
		IPL i1 = new IPL();
		i1.setTeam("RCB");
		i1.setCaptain("King_Kohli");
		i1.setJersy_Colour("Red");

		IPL i2 = new IPL();
		i2.setTeam("CSK");
		i2.setCaptain("M.S.Dhoni");
		i2.setJersy_Colour("Yellow");

		IPL i3 = new IPL();
		i3.setTeam("MI");
		i3.setCaptain("RohitMan");
		i3.setJersy_Colour("Blue");

		Set<IPL> s = new LinkedHashSet<>();
		s.add(i1);
		s.add(i2);
		s.add(i3);
		return s;
	}
	
	
	
}