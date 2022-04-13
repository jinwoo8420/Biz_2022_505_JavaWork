package com.callor.arrays.test;

public class test {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			System.out.println(i + " : " + num[i]);
		}
		
		int max = num[0] , min = num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (max <= num[i]) {
				max = num[i];
			}
			
			if (min >= num[i]) {
				min = num[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);

	}

}
