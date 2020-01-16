package com.techlab.test;

public class MethodOfString {
	public static void main(String[] args) {
		String str1="swabhavteclab.com";
		String str2=" vicky@developer";
		String str3="vicky ";
		String str4=" is developer";
		String str5=str3.replace('v', 'L' );
		String str6=str5.replace('i', 'u');
		
		System.out.println("            The String Method are             ");
		System.out.println("***************************************************************");
	    System.out.println("After concating the string :"+ str2.concat(str1));
		System.out.println("After concating the string : "+str3.concat(str4));
		System.out.println("After replacement of char ' v' with ' L & 'i' with ' u' " + str6);
		System.out.println("****************************************************************");
		
		
	}
	
	
	

}
