package com.techlab.person.test;

import com.techlab.person.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(12, "vikas", "mumbai");

		Person p2 = new Person(13, "lucky", "pune");

		Person p3 = new Person(14, "ketan", "kolkata");

		p1.dispaly();
		p2.dispaly();
		p3.dispaly();
	}
}