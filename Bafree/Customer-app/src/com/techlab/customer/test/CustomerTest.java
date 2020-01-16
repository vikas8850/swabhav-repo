package com.techlab.customer.test;

import com.techlab.model.customer.Cardtype;
import com.techlab.model.customer.Customer;

public class CustomerTest {
	 public static void main(String[] args) {
		 Customer vicky = new Customer(101, "jack", Cardtype.VISA,false);
		
		 Customer ketan = new Customer(102, "ketan", Cardtype.AMERRIANEXPRESS,true);
		 Customer govind = new Customer(103, "Govind", Cardtype.CREDITCARD,true);
		 //printInfo(vicky);
		 printInfo(ketan);
		// printInfo(govind);
		 
		 
	}
	 
	 
	 public static void printInfo(Customer c) {
		 
		 System.out.println(" The info of customer is ");
		 System.out.println(" The id is " +     c.getID() );
		 System.out.println(" The name is  " +  c.getNmae() );
		 System.out.println("The Card type is" + c.getcardtype() );
		 System.err.println(" The customer is "+c.getActive());
		 
	 }

}
