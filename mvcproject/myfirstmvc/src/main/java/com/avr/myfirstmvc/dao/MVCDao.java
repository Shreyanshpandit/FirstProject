package com.avr.myfirstmvc.dao;

import java.util.List;

import javax.servlet.RequestDispatcher;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.avr.myfirstmvc.entity.UserInfo;

@Repository
public class MVCDao {

	@Autowired
	SessionFactory sf;

	public List<UserInfo> loginCheck(UserInfo user) {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(UserInfo.class);
		List<UserInfo> ls = cr.list();
		return ls;
	}

}
