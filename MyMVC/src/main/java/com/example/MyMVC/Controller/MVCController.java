package com.example.MyMVC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.MyMVC.Entity.User;
import com.example.MyMVC.Service.MVCService;

@Controller
public class MVCController {
	@Autowired
	MVCService ms;
	
	@RequestMapping("/")
	public ModelAndView openLoginPage() {
		
		return new ModelAndView("login");
	}
	
	
		@PostMapping("login")
		public List<User> checklogin(@ModelAttribute User u, Model m) {
			return ms.checklogin();
			
		
	}
	
	/*	// Print data from front end to java where we hv req of 1 or 2 parameters.
	 @PostMapping("loginpage")
	public ModelAndView checklogin(@RequestParam String username, @RequestParam String password ,@RequestParam String confirmpassword) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(confirmpassword);
		return null;

		// Print data from front end to java where we hv req of more than 1 or 2 parameters.
	}/*
	@PostMapping("loginpage")
	public ModelAndView checklogin(@ModelAttribute User user) {
		System.out.println(user);
		return null;
	}
	
	// Print data from java to front end with the help of Model interface.
	@PostMapping("loginpage")
	public ModelAndView checklogin(@ModelAttribute User user, Model model) {
		System.out.println(user.getUsername());
		model.addAttribute("msg", user.getUsername());
		return new ModelAndView("home");
}
	
	// Print data from java to front end with the help of to create object of ModelAndView.
	@PostMapping("loginpage")
	public ModelAndView checklogin(@ModelAttribute User user, Model model) {
		System.out.println(user.getUsername());
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", user.getUsername());
		mv.setViewName("home");
		return mv;
}*/
	
	
}