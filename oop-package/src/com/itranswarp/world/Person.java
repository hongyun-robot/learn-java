package com.itranswarp.world;

public class Person {
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println("Hello " + name);
	}
}
