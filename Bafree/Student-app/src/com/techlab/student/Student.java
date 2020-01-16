package com.techlab.student;

public class Student {
	private int id;
	private String name;
	private String addres;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
		else
			System.out.println("Not a valid Id");

	}

	public String getName() {
		return name;
	}

	public String getAddres() {
		return addres;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			System.out.println("Not a valid Age");

	}

	public void Display() {
		System.out.println(" ID :- " + getId()  + "  " + "Name :-" + name + " AGE:-" + this.age);
	}
}
