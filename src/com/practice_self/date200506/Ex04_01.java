package com.practice_self.date200506;

import java.util.Scanner;

public class Ex04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력해 주세요 : ");
		int score = sc.nextInt();
				
		if (score>=90) {
			grade = 'A';
		} else if(score>=80) {
			grade = 'B';
		} else if(score>=70) {
			grade = 'C';
		} else if(score>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
				
		System.out.println(grade+"학점 입니다.");
				
		sc.close();
	}

}
