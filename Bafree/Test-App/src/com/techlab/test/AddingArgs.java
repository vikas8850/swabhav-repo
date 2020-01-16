package com.techlab.test;

public class AddingArgs {
	public static void main(String[] args) {
		int sum = 0;
		int length = Integer.parseInt(args[0]);
		for (int i = 0; i < length; i++) {
			sum = sum + i;

		}
		System.out.println("The sum of number"  +  sum);
	}
} 