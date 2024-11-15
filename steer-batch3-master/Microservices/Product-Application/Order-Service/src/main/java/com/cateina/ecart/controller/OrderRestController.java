package com.cateina.ecart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cateina.ecart.model.Order;
import com.cateina.ecart.service.OrderServiceImpl;

@RestController
@RequestMapping("/api/orders")
public class OrderRestController {
	
	@Autowired
	private OrderServiceImpl os;
	
	@GetMapping
	public Order f1() {
		Order order = os.placeOrder("james");
		return order;
	}

}
