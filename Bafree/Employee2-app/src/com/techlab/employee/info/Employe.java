package com.techlab.employee.info;



public class Employe {
	private int id;
	private String name;
	private String addres;
	private EmployeType employe;

	public Employe(int id, String name, String addres, EmployeType employe) {
		this.id = id;
		this.name = name;
		this.addres = addres;
		this.employe = employe;

	}

	public int getID() {
		return id;

	}

	public String getName() {
		return name;
	}

	public String getAddres() {
		return addres;
	}

	public EmployeType getEmploye() {
		return employe;

	}
}