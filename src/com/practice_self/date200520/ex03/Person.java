package com.practice_self.date200520.ex03;

public class Person {

	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("이  름: "+name);
		System.out.println("  키  : "+height);
		System.out.println("몸무게: "+weight);
	}
}
