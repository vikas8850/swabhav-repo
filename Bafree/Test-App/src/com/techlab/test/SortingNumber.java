package com.techlab.test;

public class SortingNumber { 
	public static void main(String[] args) {
		int a[]= {15,-3,10,2,-1,30};
		int temp=0;
		for(int i =0;i<a.length;i++) {
			for (int j=i;j<a.length;j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
				
				
			}
			
			System.out.println(a[i]);
		}
		
		
		
	}

}
