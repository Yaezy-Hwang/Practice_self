package com.practice_self.date200520.ex03;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.height = 180.0f;
		personKim.weight = 85.5f;
		
		Person personLee = new Person("이순신", 175, 75);

		personKim.showInfo();
		personLee.showInfo();
		
	}

}
