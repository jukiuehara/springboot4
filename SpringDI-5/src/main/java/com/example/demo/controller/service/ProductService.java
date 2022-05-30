package com.example.demo.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.dao.Dao;
import com.example.demo.controller.entity.Product;

@Service
public class ProductService implements Services{
	
	@Autowired
	private Dao dao;
	
	public List<Product> findAll(Integer price,String name) {

		return dao.findAll(price,name);
	}
	public List<Product> findAll() {
		
		return dao.findAll();
		
	}
	 public void insert(Product product) {
		 dao.insert(product);
	 }
	 
}
	
