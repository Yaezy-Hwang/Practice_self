package com.practice_self.date200508;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int row = 1; row<=6; row++) {
			for(int tab=(6-row); tab>=0; tab--) {
				System.out.print(" ");
			}
			for(int col=1; col<=(row*2-1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
