package com.grretingappdevelopment.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grretingappdevelopment.service.Greeting;
import com.grretingappdevelopment.service.GreetingService;
import com.grretingappdevelopment.service.GreetingService;

@RestController
public class GreetinfRestController {
	@Autowired
	private GreetingService gret;
	
	public static int id=0;
	
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
    
    @RequestMapping("/hello")
   	public String home(@RequestParam String name) {
   		return "Hello "+name;
   	}

    @PostMapping("/addData")
    public String addData(@RequestParam String fName,@RequestParam String lName,@RequestParam String message){
        id +=1;
        return gret.addData(new Greeting(id, fName, lName,message));
    }


    @GetMapping("/getData")
    public String getData(){
        return gret.list.toString();
    }
    @PostMapping("/addfName")
    public String addfName(@RequestParam String fName,@RequestParam String message){
        id +=1;
        return gret.addData(new Greeting(id, fName, "",message));
    }
    @PostMapping("/addDatalName")
    public String addDatalName(@RequestParam String lName,@RequestParam String message){
        id +=1;
        return gret.addData(new Greeting(id, "", lName,message));
    }

    @GetMapping("/msgbyID")
    public String greetingMessageByID(@RequestParam int id){     
        return gret.greetingMessageByID(id);
    }
}
