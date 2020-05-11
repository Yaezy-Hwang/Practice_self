package com.practice_self.date200506;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별 코드를 입력해 주세요: ");
		String code = sc.nextLine();
		
		if(code=="F") {
			System.out.println("여성입니다.");
		} else if(code=="M"){
			System.out.println("남성입니다.");
		} else {
			System.out.println("다시 입력해주세요");
		}
		
		sc.close();
	}
}
