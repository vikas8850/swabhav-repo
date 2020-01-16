package com.techlab.rectangle;

public class Rectangle {
	private int length;
	private int breath;

	public int getLength() {
		return length;
	}

	public int getBreath() {
		return breath;
	}

	public void setLength(int length) {
		if (length <= 0) {
			length = 1;
		} else if (length > 100) {
			length = 100;

		}

		this.length = length;
	}

	public void setBreath(int breath) {

		if (breath <= 0) {
			breath = 1;
		} else if (breath > 100) {
			breath = 100;

		}

		this.breath = breath;
	}

	public int calculateArea() {
		int area;
		return area = breath * length;

	}

	public void display() {
		System.out.println(" The lenght is :-" + length);
		System.out.println(" The breath is :-" + breath);
		calculateArea();

	}

}
