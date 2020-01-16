package com.techlab.reactangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.setLength(20);
		r1.setBreath(10);
		
		Rectangle r2 = new Rectangle();
		r2.setBreath(5);
		r2.setLength(10);
		PrintRectangleInfo(r2);
		//PrintRectangleInfo(r1);
		
		
		
		

		

	}
	
	public static void PrintRectangleInfo(Rectangle r1) {
		System.out.println(" ================Printing info of Rectangle============== ");
		System.out.println("      " + "    The Length is "  + r1.getLength());
		System.out.println("      " + "    The Breath is "  + r1.getBreath());
		System.out.println("      " + "    The Area  is "  + r1.calculateArea());
		System.out.println(" ================   End  of   Rectangle =================== ");
		
		
		
	}

}
