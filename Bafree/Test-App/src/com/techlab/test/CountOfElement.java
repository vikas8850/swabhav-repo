package com.techlab.test;

public class CountOfElement {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 3, 8, 7, 5, 5 };
		int count = 0;
		 
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			for (int j = i; j < a.length; j++) {
				if(a[i]==a[j]) {
					count=count+1;
					

					
				}
				System.out.println(count);

			}
		}
	}
}