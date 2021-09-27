package com.grretingappdevelopment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public String helloService()
	{
		return "hello folks";
	}
	
	 public static List<Greeting> list = new ArrayList<Greeting>();

	    
	    public String addData(Greeting greeting) {
	        list.add(greeting);
	        return list.toString();
	    }
}
