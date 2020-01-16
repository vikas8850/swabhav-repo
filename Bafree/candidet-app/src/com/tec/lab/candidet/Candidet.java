package com.tec.lab.candidet;

public class Candidet {
	private int id;
	private String name;
	private float ranker;

	public Candidet(int id, String name, float ranker) {
		this.id = id;
		this.name = name;
		this.ranker = ranker;

	}

	public int getID() {
		return id;

	}

	public String getName() {
		return name;
	}

	public float getRanker() {
		return ranker;

	}

	public void WhoIsBetter(  Candidet c2) {
		if (this.ranker > c2.ranker) {
			System.out.println(this.name + " Is   Better");
		}

		else {
			System.out.println(c2.name + " Is   Better");
		}

	}
}
