package com.example.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.dao.Dao;
import com.example.demo.controller.entity.Product;

@Service
public class ProductService implements Services{
	
	@Autowired
	private Dao dao;
	public Product id(Integer id) {
		return dao.id(id);
	}
}
	
