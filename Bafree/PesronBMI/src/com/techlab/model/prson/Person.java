package com.techlab.model.prson;

public class Person {
	private int id;
	private String name;
	private int weight;
	private double height;
	private Gender gender;
	private int age;

	public Person(int id, String name, int weight, double height, Gender gender, int age) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.age = age;

	}

	public int getID() {

		return id;

	}

	public String getNmae() {
		return name;

	}

	public Gender getgender() {
		return gender;

	}

	public double getheight() {
		return height;
	}

	public int getweight() {
		return weight;
	}

	public int getage() {
		return age;
	}

	public double bmiCalucater() {
		double newheight = (double) ( this.height/3.28);

		double bmi = this.weight / (newheight * newheight);
		return bmi;
	}

	public String bodyMas() {
		if (this.age < 20) {
			if ((bmiCalucater() >= 7 && bmiCalucater() <= 10))
				return ("YOU ARE NORAML" + getNmae());
			else if (bmiCalucater() > 10)
				return ("YOU ARE OBESE" + getNmae());
			else
				return ("YOU ARE UNDE WEGIHT" + getNmae());

		}
		if (this.age <= 21 && this.age <= 40) {
			if ((bmiCalucater() >= 11 && bmiCalucater() <= 20))
				return ("YOU ARE NORAML" + getNmae());
			else if (bmiCalucater() > 20)
				return ("YOU ARE OBESE" + getNmae());
			else
				return ("YOU ARE UNDE WEGIHT" + getNmae());

		}
		if (this.age > 41) {
			if ((bmiCalucater() >= 21 && bmiCalucater() <= 30))
				return ("YOU ARE NORAML" + getNmae());
			else if (bmiCalucater() > 30)
				return ("YOU ARE OBESE" + getNmae());
			else
				return ("YOU ARE UNDE WEGIHT" + getNmae());

		}
		return null;

	}
}
