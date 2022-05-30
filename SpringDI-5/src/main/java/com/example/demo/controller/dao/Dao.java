package com.example.demo.controller.dao;
import java.util.List;

import com.example.demo.controller.entity.Product;

public interface Dao {

    public  List<Product> findAll(Integer price,String name);
    public  List<Product> findAll();
    public void insert(Product product) ;

}