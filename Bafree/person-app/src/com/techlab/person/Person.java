package com.techlab.person;

public class Person {
	int id;
	String name;
	String addres;

	public void dispaly() {
		System.out.println(id + " " + name + "  " + addres);

	}

	public Person(int id, String name, String addres) {
		this.id = id;
		this.name = name;
		this.addres = addres;

	}

}
