package com.budgetly.application.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	
	
	System.out.println("HELOOOOOOO!");
}
