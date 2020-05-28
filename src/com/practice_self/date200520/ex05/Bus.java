package com.practice_self.date200520.ex05;

public class Bus {
	
	//필드
	int busNumber;
	int passengerCount;
	int money;
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//메소드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber+"번 버스의 승객 수는 "+passengerCount+"명이며, 금일 총 수입은 "+money+"원 입니다.");
	}
	
	
	

}
