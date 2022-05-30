package com.example.demo.controller.service;

import java.util.List;

import com.example.demo.controller.entity.Product;

public interface Services {
	 public List<Product> findAll(Integer price,String name);
	 public List<Product> findAll();
	 public void insert(Product product) ;
}
