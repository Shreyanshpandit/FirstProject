package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Config {

	public static SessionFactory getConnection(){
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
        return sf;
	}
}
