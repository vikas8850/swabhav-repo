package com.techlab.accountinfo;

public class Account {
	private int accno;
	private String name;
	private double blance;

	public Account(int accno, String name, double blance) {
		this.accno = accno;
		this.name = name;
		this.blance = blance;

	}

	public int getAccNo() {
		return accno;

	}

	public String getName() {
		return name;

	}

	public double getBlance() {
		return this.blance;

	}

	public void deposit(double amount) {
		this.blance = this.blance + amount;

	}

	public void withdrawal(double amount) {
		if (this.blance < 500) {
			return;

		}

		this.blance = this.blance - amount;

	}

}
