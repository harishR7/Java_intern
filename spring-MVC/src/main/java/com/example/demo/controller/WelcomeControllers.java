package com.example.demo.controller;

import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class WelcomeControllers {
	
	
	@RequestMapping(value="/greet",method=RequestMethod.GET)
	@ResponseBody
	public String getMessage() {
	//	return "Welcom to Spring MVC";
	return " <h1 style='text-align:center'>Welcome to Spring MVC </h1>";
	}
	
}
