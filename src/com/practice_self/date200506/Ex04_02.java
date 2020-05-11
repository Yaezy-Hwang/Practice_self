package com.practice_self.date200506;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력해 주세요 : ");
		int score = sc.nextInt();
		
		grade = (score>=90) ? 'A' : 'B';
		
		System.out.println(grade+"학점 입니다.");
		
		
		sc.close();
	}
}
