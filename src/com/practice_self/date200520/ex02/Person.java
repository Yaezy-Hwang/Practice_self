package com.practice_self.date200520.ex02;

public class Person {
	
	private int age;
	private String name;
	private boolean isMarried;
	private int sons;
	
	//getter setter
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public void setSons(int sons) {
		this.sons = sons;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	public boolean getIsMarried() {
		return isMarried;
	}
	
	public int getSons() {
		return sons;
	}
	
	//일반 메소드
	public void showInfo() {
		char married;
		if(isMarried==true) {
			married='O';
		}else {
			married='X';
		}
		
		System.out.println("나이: "+age);
		System.out.println("이름: "+name);
		System.out.println("결혼여부: "+married);
		System.out.println("자녀수: "+sons);
	}
	
	
	

}
