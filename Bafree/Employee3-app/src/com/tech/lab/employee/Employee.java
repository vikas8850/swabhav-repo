package com.tech.lab.employee;

public class Employee {

	private int id;
	private String name;
	private String dob;
	private EmployeeType employe;

	public Employee(int id, String name, String dob, EmployeeType employe) {
		setId(id);
		setName(name);
		setDob(dob);
		this.employe=employe;

	}

	public int getID() {
		return  id;

	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public EmployeeType getEmploye() {
		return employe;

	}

	public void setId(int id) {
		if (id > 0) {

		}

		else {
			System.out.println("\"Error! ID can't be negative!\"");
		}
		this.id = id;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			System.out.println(" \"Error!  You have not  enetr the name");
		} 

		this.name = name;

	}

	public void setDob(String dob) {

		if (dob.isEmpty()) {
			System.out.println("  \"Error! You have not enetr the DOB");
		}

		this.dob = dob;
	}

	

}
