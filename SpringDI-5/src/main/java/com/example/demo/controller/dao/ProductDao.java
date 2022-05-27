package com.example.demo.controller.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.entity.Product;

@Repository
public class ProductDao implements Dao{
	
    @Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
    
    private static final String SELECT_ID = "SELECT * FROM products where product_id = :product_id;" ;
    
    public Product id(Integer id) {
    	String sql = SELECT_ID;
    	
    MapSqlParameterSource param = new MapSqlParameterSource();
    param.addValue("product_id", id);
    List<Product> list =  jdbcTemplate.query(sql,param, new BeanPropertyRowMapper<Product>(Product.class));
    return list.isEmpty() ? null:list.get(0);
    }

    
   
    
}