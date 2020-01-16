package com.techlab.Employee;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private double salary;

	public Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;

	}

	public double Salary(double salary) {
		double hra = 0.1 * salary;
		double ta = 0.2 * salary;
		double da = 0.3 * salary;
		double gross = hra + ta + da + salary;
		return gross;

	}

	public void Display() {
		System.out.println(id + " " + name + "  " + designation + "   " + Salary(salary));

	}
}