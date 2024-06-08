package com.avr.myfirstmvc.service;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.avr.myfirstmvc.dao.MVCDao;
import com.avr.myfirstmvc.entity.UserInfo;

@Service
public class MVCService {
	@Autowired
	MVCDao md;
	UserInfo ui;

	public ModelAndView loginCheck(UserInfo user,Model model) {
		List<UserInfo> ls= md.loginCheck(user);
		UserInfo us=ls.get(0);
		if( us.getUsername().equals(user.getUsername())  && us.getPassword().equals(user.getPassword())) {
		
			return new ModelAndView("home");	
		}
		else
			
	     return new ModelAndView("invalid");
	}
}
