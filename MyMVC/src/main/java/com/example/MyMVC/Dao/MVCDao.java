package com.example.MyMVC.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.MyMVC.Entity.User;
import com.example.MyMVC.Service.MVCService;

@Repository
public class MVCDao {
	
	@Autowired
	SessionFactory sf;
	
	public 	List<User> checklogin() {
		Session s = sf.openSession();
		Criteria c = s.createCriteria(User.class);
		List<User> l = c.list();
		return l;
	}

}
