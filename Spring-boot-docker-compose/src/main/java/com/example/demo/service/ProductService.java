package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRespository;

import lombok.AllArgsConstructor;

@Service

public class ProductService {
	private ProductRespository repo;

	
	@Autowired
	public ProductService(ProductRespository repo) {
		super();
		this.repo = repo;
	}
	
	
	public Product add(Product entity) {
		return this.repo.save(entity);
	}
	
	public List<Product> findAll() {
		return this.repo.findAll();
	}
	
}

