package com.example.MyMVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyMVC.Dao.MVCDao;
import com.example.MyMVC.Entity.User;

@Service
public class MVCService {
	@Autowired
	MVCDao md;
	
	public List<User> checklogin(){
		return md.checklogin();
		
	}

	
}
