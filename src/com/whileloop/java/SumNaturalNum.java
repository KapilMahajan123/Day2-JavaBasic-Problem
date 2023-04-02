package com.whileloop.java;

public class SumNaturalNum {
	
	public static void main(String[] args) {
		int n = 5, i = 1, sum = 0;
		
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("Sum of first five natural numbers is = " + sum);
	}

}
