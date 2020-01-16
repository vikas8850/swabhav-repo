package com.techlab.test;

import java.util.Arrays;

public class ArrraySorting {
	public static void main(String[] args) {
		int a[] = { 12, 45, 38, 22 };
		int b[] = { 3, 5, 11, 17 };
		int[] c = new int[a.length + b.length];
		int temp = a[0];
		int count = 0;

		for (int i = 0; i < a.length - 1; i++) {

			a[i] = a[i + 1];

		}

		a[a.length - 1] = temp;

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++;
		}
		for (int j = 0; j < b.length; j++) {
			c[count++] = b[j];
		}
		for (int i = 0; i < c.length; i++)
			System.out.print(c[i] + " ");

		Arrays.sort(c);

		System.out.println(Arrays.toString(c));

	}

}
