package com.callor.arrays;

public class ArraysV5 {

	public static void main(String[] args) {
		int[] intScore = new int [100];
		
		for (int i = 0; i < intScore.length; i++) {
			intScore[i] = (int)(Math.random() * 100) + 1;
			
			if ((i % 5) == 0) {
				System.out.println();
			}
			
			System.out.print(intScore[i] + ",\t");
			
		}
	}
}
