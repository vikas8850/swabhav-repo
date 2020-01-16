package com.techlab.menudrivenapplication;

import java.util.Scanner;

public class MenuDrivenApplication {

	public static void evenOdd() {
		System.out.println(" Enter the number");
		Scanner even = new Scanner(System.in);
		int a = even.nextInt();

		if (a % 2 == 0) {
			System.out.println(" The number is Even" + a);
		} else {
			System.out.println(  "  The number is odd" + a);
		}

	}

	public static void leapYear() {
		System.out.println(" Enter the Year");
		Scanner a = new Scanner(System.in);
		int year = a.nextInt();
		if (year % 4 == 0 || year % 100 == 00 || year % 400 == 0) {
			System.out.println(" It's leap year  " + year);

		} else {
			System.out.println(" its not leap year  " + year);
		}
	}

	public static void factorail() {
		System.out.println(" Enter the number u wanted see Factorial");
		Scanner f = new Scanner(System.in);
		int num = f.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = i * fact;

		}

		System.out.println("The Factorial of number "+fact);
	}

	public static void fibonacci() {
		System.out.println(" Enter the number u wanted see Fibonacci");
		Scanner f = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3, i;
		int count = f.nextInt();
		System.out.print(n1 + " " + n2);

		for (i = 0; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void diplsay() {

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println(" Select any of the given choice");
			System.out.println(" 1. EvenOdd");
			System.out.println(" 2. LeapYear");
			System.out.println(" 3. Factorail");
			System.out.println(" 4. Fibonacci ");

			int choice = s.nextInt();

			switch (choice) {
			case 1:
				evenOdd();
				break;
			case 2:
				leapYear();
				break;
			case 3:
				factorail();
				break;

			case 4:
				fibonacci();
				break;

			case 5:
				System.out.println("you have exited");
				System.exit(0);
				
				break;

			default:
				System.out.println(" .... Error ! Enter valid option");
			}
		}

	}

	public static void main(String[] args) {
		diplsay();
	}

}
