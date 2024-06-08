package com.avr.myfirstmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.avr.myfirstmvc.entity.UserInfo;
import com.avr.myfirstmvc.service.MVCService;

@Controller
public class MVCController {
	@Autowired
	MVCService ms;

	@RequestMapping("/")
	public ModelAndView openLogInPage() {
		return  new ModelAndView("login");
		
	}
	
	@PostMapping("login")
	public ModelAndView loginCheck(@ModelAttribute UserInfo user,Model model ) {
	      return ms.loginCheck(user, model);
	
		
	}
}
