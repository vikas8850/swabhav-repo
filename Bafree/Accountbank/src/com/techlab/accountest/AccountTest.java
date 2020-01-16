package com.techlab.accountest;

import com.techlab.accountinfo.Account;

public class AccountTest {
	
public static void main(String[] args) {
	Account joy[] =new Account[2];

	
	 
	 
	joy[0]=new Account(1001, "jatin", 1000);
	joy[1]=new Account(2055, "shwan", 3000);
	
PrinteInfo(joy[0]);
//PrinteInfo(joy[1]);

	
	//joy.deposit(5000);
	//joy.withdrawal(600);
	//PrinteInfo(new Account(100, "vikas", 500));
	//PrinteInfo(null);



	
	}
	
	public static  void PrinteInfo(Account a) {
		System.out.println("The Account Number is  " + a.getAccNo());
		System.out.println("The Account Holder  "  + a.getName());
		System.out.println("The Blanace is Rs." + intrest(a));
	
		
		
		
	}
	static double intrest (Account a) {
		double intrest =a.getBlance()+(a.getBlance()*0.1);
		return intrest;
	
		
	}

	
	

}
