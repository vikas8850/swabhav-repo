package com.techlab.player;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public void Display() {
		System.out.println(" ID :- " + id + "  " + "Name :-" + name + " AGE:-" + age);
	}

	public void WhoIsElder(Player p2, Player p3) {
		if (this.age > p2.age && this.age > p3.age) {
			System.out.println(this.name + " Is   Elder");

		}

		else if (p2.age > p3.age) {
			System.out.println(p2.name + " is Elder");
		} else {
			System.out.println(p3.name + " is Elder");
		}

	}

}
