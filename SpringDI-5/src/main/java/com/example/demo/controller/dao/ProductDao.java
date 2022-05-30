package com.example.demo.controller.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.entity.Product;

@Repository
public class ProductDao implements Dao{
	
    @Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
    
    @Autowired
   private JdbcTemplate  jdbcTemplate2;
    
    private static final String SELECT_PRICE_NAME = "SELECT * FROM products where price = :price or product_name = :name" ;
    private static final String INSERT_PRICE_NAME = "insert into products (product_name, price)values(:name,:price);" ;

    
    public List<Product> findAll(Integer price,String name) {
    	String sql = SELECT_PRICE_NAME;
    MapSqlParameterSource param = new MapSqlParameterSource();
    param.addValue("price", price);
    param.addValue("name", name);
    List<Product> list =  jdbcTemplate.query(sql,param, new BeanPropertyRowMapper<Product>(Product.class));
    return list;
    }

    public List<Product> findAll() {
        return jdbcTemplate2.query("SELECT * FROM products ORDER BY product_id", new BeanPropertyRowMapper<Product>(Product.class));
    }
   
    public void insert(Product product) {
    	String sql = INSERT_PRICE_NAME;
    MapSqlParameterSource param = new MapSqlParameterSource();
    param.addValue("price", product.getPrice());
    param.addValue("name", product.getProductName());
    jdbcTemplate.update(sql, param);

    }
}