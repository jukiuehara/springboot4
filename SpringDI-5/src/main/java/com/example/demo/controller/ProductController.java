package com.example.demo.controller;

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
	
	@RequestMapping("/result")
	public String result(@ModelAttribute("product")IndexForm from,Model model) {
		
		

		Product product = services.id(from.getId());
		
		if(product==null) {
			model.addAttribute("msg", "対象のデータはありません");
			return "index";
		}else {
			model.addAttribute("msg", "データを取得しました");
			 model.addAttribute("product", product);
			return "result";
		}
		
	}
	
	
}