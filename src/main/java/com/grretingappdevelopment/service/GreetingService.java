package com.grretingappdevelopment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public String helloService() {
		return "hello folks";
	}

	public static List<Greeting> list = new ArrayList<Greeting>();

	public String addData(Greeting greeting) {
		list.add(greeting);
		return list.toString();
	}

	public String greetingMessageByID(int id) {
		return list.get(id - 1).getMessage();
	}

	public String deleteData(int id) {
		if (list.remove(list.get(id - 1))) {
			return "Success";
		} else {
			return "failed";
		}
	}

	public String editMessageByid(int id, String message) {
		if (list.get(id - 1).setMessage(message)) {
			return "Success";
		} else {
			return "Failed";
		}
	}

}
