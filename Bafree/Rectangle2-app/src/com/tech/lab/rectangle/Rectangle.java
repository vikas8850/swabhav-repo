package com.tech.lab.rectangle;

public class Rectangle {

	private int lenght;
	private int breath;
	private String color;

	public int getLenght() {
		return lenght;

	}

	public int getBreath() {
		return breath;
	}

	public String getColor() {
		return color;

	}

	public void setLength(int length) {
		if (length <= 0) {
			length = 1;

		} else if (length > 100) {
			length = 100;

		}

		this.lenght = length;

	}

	public void setBreath(int breath) {

		if (breath <= 0) {

			breath = 1;

		} else if (breath > 100) {
			breath = 100;

		}

		this.breath = breath;

	}

	public void setColor(String color) {

		if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase  (" Blue") ||  color.equalsIgnoreCase("Green")) {
			
		
			
			
			System.out.println(" The color of rectangle is " + color);
		

		}
		
		
		
		else {
			System.out.println(" The color of Rectangle is Black");

		}

	}

	public void calculateArea() {
		int area = breath * lenght;
		System.out.println("The area of rectangle is " + area);

	}

}
