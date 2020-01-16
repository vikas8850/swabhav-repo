package com.techlab.test;

public class LogicalOprater {
	 public static void main(String[] args) {
		int a=10;
		int b=20;
		int c= a++;
		int d=++a;
		
		int e= ++a +a++;
		int f =b++ + ++a;
		int g= b++ + a++;
		int h= ++a + ++b;
		System.out.println("c: " + c);
		System.out.println("d: "  + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		System.out.println("g: " + g);
		System.out.println("h: " + h);
		
		
		
		
	}

}
