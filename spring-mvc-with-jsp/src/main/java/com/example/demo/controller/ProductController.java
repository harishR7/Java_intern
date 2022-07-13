package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRespository;

@Controller
public class ProductController {
	
	
	@Autowired
	private Product entity;
	@Autowired
	private ProductRespository repo;
	
	@RequestMapping(value="/product",method = RequestMethod.GET)
	public String inintForm (Model model) {
		model.addAttribute("title","Add Products");
		model.addAttribute("command",entity);
		return "addProduct";
	}
	@RequestMapping(value="/product",method = RequestMethod.POST)
	public String submitForm (@ModelAttribute("command") Product entity) {
		
		int rowAdded;
		try {
			rowAdded=this.repo.add(entity);
			//return "success";
			return "addProduct";
		} catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
	}
	@RequestMapping(value="/product/search",method = RequestMethod.GET)
	public String searchForm (Model model) {
		model.addAttribute("title","Search Products");
	
		return "searchProduct"  ;
	}
	@RequestMapping(value="/product/search",method = RequestMethod.POST)
	public String submitSearchForm (@RequestParam("id") int id,Model model) {
		
		Product pro=this.repo.findbyId(id);
		model.addAttribute("found",pro);
		return "searchSuccess";
			
	}
	@RequestMapping(value="/product/delete",method = RequestMethod.GET)
	public String deleteForm (Model model) {
		model.addAttribute("title","delete Product");
	
		return "findProduct";
	}
	
	@RequestMapping(value="/product/delete",method = RequestMethod.POST)
	public String deleteProduct(@RequestParam("id") int id,Model model) {
		
		Product pro=this.repo.findbyId(id);
		model.addAttribute("delete",pro);
		model.addAttribute("delete1",repo.delete(id));
		return "deleteProduct";
	
	
}
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String indexPath (Model model) {
		model.addAttribute("title","IndexPath");
	
		return "indexPath";
	}
}
