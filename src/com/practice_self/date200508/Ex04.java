package com.practice_self.date200508;

public class Ex04 {

	public static void main(String[] args) {

		System.out.println("1부터 10까지의 정수의 합은 "+(1+10)*(10/2)+" 입니다.");

		int x, fac ;

		for(x= 1, fac= 0; x<= 10; x++) {
			fac= (int)(1+x)*x/2;
			System.out.println(x+ "까지의 합은 "+fac);
		}

		System.out.println("1부터 "+(x-1)+"까지의 정수의 합은 "+fac+" 입니다.");

	}

}