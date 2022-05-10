package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRespository;

@RequestMapping("/mvc")
@Controller
public class WelcoomeController {
	 
	private ModelAndView mdlView;
	private ProductRespository pro;
	
	@Autowired
	public WelcoomeController(ModelAndView mdlView,ProductRespository pro) {
		super();
		this.mdlView = mdlView;
		this.pro=pro;
	}

	@RequestMapping(value ="/first", method = RequestMethod.GET )
	public String getFirst() {
		return "welcome";
	}
	
	@RequestMapping(value ="/home", method = RequestMethod.GET )
	public ModelAndView gethomePage() {
		
		List<Product> prolist=pro.findAll();
		 mdlView.addObject("list",prolist);
		 mdlView.setViewName("home");
		 return mdlView;
	}
	
}
