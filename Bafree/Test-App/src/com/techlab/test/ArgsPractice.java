package com.techlab.test;

public class ArgsPractice {
	 public static void main(String[] args) {
		 int a=Integer.parseInt(args[0]);
		 int b=Integer.parseInt(args[1]);
		 int sum=a+b;
		System.out.println("The value of args[0] is " + a);
		System.out.println("The value of args[1] is " + b);
		System.out.println(" The sum of the value is " + sum);
	}

}
