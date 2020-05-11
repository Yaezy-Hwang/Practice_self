package com.practice_self.date200508;

public class Ex07 {

	public static void main(String[] args) {
		
		for(int row = 6; row>0; row--) {
			for(int tab=(6-row); tab>0; tab--) {
				System.out.print(" ");
			}
			for(int col = (row*2-1); col>0; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
