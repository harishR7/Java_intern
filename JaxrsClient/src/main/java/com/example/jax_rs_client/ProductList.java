package com.example.jax_rs_client;

import java.util.List;

import com.example.entity.Product;

public class ProductList {
	
	private List<Product> list;
	
	public ProductList() {
		super();
		
	}

	public ProductList(List<Product> list) {
		super();
		this.list = list;
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	
	
	
}
