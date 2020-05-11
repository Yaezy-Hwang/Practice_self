package com.practice_self.date200506;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char medalColor;
		System.out.print("순위를 입력해 주세요: ");
		int ranking = sc.nextInt();
		
		switch(ranking) {
			case 1 :
				medalColor = 'G';
				break;
			case 2 :
				medalColor = 'S';
				break;
			case 3 :
				medalColor = 'B';
				break;
			default :
				medalColor = 'A';
				break;
		}
		
		System.out.println(ranking+"등의 메달 색상은 "+medalColor+" 입니다.");
		
		
		sc.close();
	}

}
