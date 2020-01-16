package com.techlab.test;

public class LeafYear {
	
	public static void main(String[] args) {
		int year=2020;
		if( year%4==0 || year%100==00|| year%400==0) {
			System.out.println(" It's leap year  "  + year );
			
		}
		else {
			System.out.println(" its not leap year  "  + year);
		}
	}

}
