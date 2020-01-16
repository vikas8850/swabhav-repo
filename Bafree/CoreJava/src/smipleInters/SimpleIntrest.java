package smipleInters;

import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter the customer amount ");
		double amount= sc.nextDouble();
		System.out.println(" Enter rat of intrest ");
		int rateOfInterst= sc.nextInt();
		System.out.println(" Amount deposited for the given years ");
		int year=sc.nextInt();
		
		double simpleInterest= (amount+rateOfInterst+year/100);
		System.out.println(simpleInterest);
		display(amount, rateOfInterst, year, simpleInterest);
		
		
			
		}
	public static void display( double amount, int rateOfInterst , int year, double simpleInterest) {
		System.out.println(" Print the info of customer");
		System.out.println(" ********************************************");
		System.out.println("Amount is :-" +     amount) ;
		System.out.println("Rate of Intrest :- " + rateOfInterst ) ;
		System.out.println("Number of year  :- " + year) ;
		System.out.println("The Smiple Interest  will be  " + simpleInterest) ;
		System.out.println(" ********************************************");
		
		
	}
		
		
	}


