package com.techlab.test;

public class FabonicceUsingArgs {
	public static void main(String[] args) {
		 int a=Integer.parseInt(args[0]);
		 int b=Integer.parseInt(args[1]);
		 int n=0;
		 System.out.print(a+" "+b);
		 for(int i=0;i<5;++i)
		 {    
		  n=a+b;    
		  System.out.print(" " + n);    
		  a=b;    
		  a=n;    
		 }    
	}

}
