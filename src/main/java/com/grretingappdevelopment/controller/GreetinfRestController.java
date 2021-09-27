package com.grretingappdevelopment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grretingappdevelopment.service.GreetingService;

@RestController
public class GreetinfRestController {
	@Autowired
	private GreetingService gret;
	
	@GetMapping("/web")
	public String hello()
	{
		return gret.helloService();
	}
}
