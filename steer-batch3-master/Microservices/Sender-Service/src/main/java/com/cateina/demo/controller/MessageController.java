package com.cateina.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cateina.demo.service.MesaageServiceImpl;

@RestController
public class MessageController {
	
	@Autowired
	private MesaageServiceImpl service;
	
	@GetMapping("/s1")
	public String op1() {
		System.out.println(">>>>> Test ");
		service.sendMessage();
		return "Mesaage Sent";
	}
	
	@GetMapping("/s2")
	public String op2() {
		service.sendMessageV1();
		return "Mesaage Sent as MAP";
	}
	

}
