package com.techlab.test;

public class FabonicceUsingMethod {
	public static void fabonicce(int count) {
		int n1=0,n2=1,sum;    
		 System.out.print(n1+" "+n2);
		    
		 for(int i=0;i<count;++i)
		 {    
		  sum=n1+n2;    
		  System.out.print(" " + sum);    
		  n1=n2;    
		  n2=sum;    
		 }    
	}
public static void main(String[] args) {
	
	fabonicce(10);
}
}
