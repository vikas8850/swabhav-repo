package com.techlab.model.customer;

public class Customer {
	private int id;
	private String name;
	private Cardtype cardtype;
	private boolean active;

	public Customer(int id, String name, Cardtype cardtype, boolean active) {
		this.id = id;
		this.name = name;
		this.cardtype = cardtype;
		this.active = active;

	}

	public int getID() {

		return id;

	}

	public String getNmae() {
		return name;

	}

	public Cardtype getcardtype() {
		return cardtype;

	}

	public boolean getActive() {
		return active;

	}

}
