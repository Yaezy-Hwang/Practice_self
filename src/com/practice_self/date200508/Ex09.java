package com.practice_self.date200508;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요: ");
		int num = sc.nextInt();
		
		for(int row = num; row>0; row--) {
			for(int tab=(num-row); tab>0; tab--) {
				System.out.print(" ");
			}
			for(int col = (row*2-1); col>0; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int row = 1; row<=num-1; row++) {
			for(int tab=(num-row-2); tab>=0; tab--) {
				System.out.print(" ");
			}
			for(int col=1; col<=(row*2+1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		
		
		
		sc.close();
	}

}
