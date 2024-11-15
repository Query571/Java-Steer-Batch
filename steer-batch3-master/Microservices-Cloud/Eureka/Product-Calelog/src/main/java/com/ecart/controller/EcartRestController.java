package com.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecart.model.Brand;
import com.ecart.model.Category;
import com.ecart.model.Product;
import com.ecart.service.ProductService;

@RestController
@RequestMapping("/api/products")
@RefreshScope
public class EcartRestController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		System.out.println(">>>> Product <<<<");
		System.out.println(product);
		return productService.save(product);
	}
	
	@GetMapping()
	public List<Product> findAllProducts(){
		return productService.findAll();
	}
	
	
	
	
	
	

}
