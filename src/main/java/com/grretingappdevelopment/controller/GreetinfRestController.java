package com.grretingappdevelopment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	  
    @GetMapping("/json")
    public Map<String, String> jsonn() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        return map;
    }
    
    @PostMapping("/postjson")
    public Map<String, String> json() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        return map;
    }

}
