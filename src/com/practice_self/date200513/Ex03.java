package com.practice_self.date200513;

public class Ex03 {

	public static void main(String[] args) {
		
		//배열에서 유효한 값만 출력하기
		
		double[] data = new double[5];
		
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;	
		// 1. 배열의 비어있는 값은 size++이 없음.
		
		for(int i=0; i<size; i++) { //2. 1때문에 비어있는 값은 i=size가 되어 반복문 탈출
			System.out.println(data[i]);
		}
		

	}
}
