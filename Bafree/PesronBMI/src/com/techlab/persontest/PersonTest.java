package com.techlab.persontest;

import com.techlab.model.prson.Gender;
import com.techlab.model.prson.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1= new Person(101, "jack", 52 , 5.4, Gender.MALE,19);
		printInfo(p1);
			
		
	}
	
	
	public static void printInfo(Person p) {
		
		System.out.println(" THE ID :- " + p.getID());
		System.out.println( "THE NAME:-" + p.getNmae());
		System.out.println(" THE HEIGHT :-"+p.getheight() + "ft");
		System.out.println(" THE WEIGHT :-" + p.getweight() + " kg");
		System.out.println( "THE BMI:-" + p.bmiCalucater());
		System.out.println(p.bodyMas());
		
		
		
		
	}
}

