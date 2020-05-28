package com.practice_self.date200520.ex05;

public class Subway {
	
	//필드
	String lineNumber;
	int passengerCount;
	int money;
	
	//생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//일반메소드
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"의 승객 수는 "+passengerCount+"명이며, 금일 총 수입은 "+money+"원 입니다.");
	}

	

}
