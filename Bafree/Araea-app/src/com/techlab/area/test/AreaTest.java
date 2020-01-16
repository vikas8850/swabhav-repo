package com.techlab.area.test;

public class AreaTest {
	
	public static void calculateAreaOfRectangle(int a, int b) {
		int area=a*b;
		System.out.println(" The area of reactangle  " + area);
	}
	public static void calculateAreaOfSquare(int a ) {
		int area=a*a;
		System.out.println(" The area of Square " + area);
	}
	
	public static void checkWheatherReactangleOrSquare(int a,int b) {
		if (a==b) {
		calculateAreaOfSquare(a);
		}
		else {
			calculateAreaOfRectangle(a, b);
		}
	}
	
	
	
	public static void main(String[] args) {
		checkWheatherReactangleOrSquare(15, 5);
	
	
	}

}
