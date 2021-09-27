package com.grretingappdevelopment.service;

public class Greeting {
	private int id;
	private String firstName;
	private String lastName;

	public Greeting(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Greetings [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + "]";
	}

}