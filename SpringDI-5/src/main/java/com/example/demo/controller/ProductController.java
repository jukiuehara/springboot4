package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.entity.Product;
import com.example.demo.controller.form.IndexForm;
import com.example.demo.controller.service.Services;

@Controller
public class ProductController{
	@RequestMapping("/index")
	public String index(@ModelAttribute("product")IndexForm from,Model model) {
		return "index";
	}
	
	@Autowired
	private Services services;
	
	@RequestMapping(value ="/result",params="param1")
	public String result(@ModelAttribute("product")IndexForm from,Model model) {
		
		if(from.getPrice()==0&&"".equals(from.getName())) {
			List<Product> list = services.findAll();
			model.addAttribute("list", list);
		}else {
			List<Product> list = services.findAll(from.getPrice(),from.getName());
			model.addAttribute("list", list);
		}

			model.addAttribute("msg", "データを取得しました");
			 
			return "result";
		
		
	}
	@RequestMapping(value = "/result",params = "param2")
	public String result2(@ModelAttribute("product")IndexForm from,Model model) {
		Product p = new Product();
		p.setPrice(from.getPrice());
		p.setProductName(from.getName());
		services.insert(p); 
	
		return "insertResult";
		
		
	}
	
	
}