package com.techlab.student;

public class Student {
	
	
	private int id;
	private String name;
	private String addres;
	private Branch branch;
	
	public Student(int id,String name,String addres,Branch branch) {
		this.id=id;
		this.name=name;
		this.addres=addres;
		this.branch=branch;
	}

	public int getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}

	
	public String getAddres() {
		return addres;
	}
	public Branch getBranch() {
		return branch;
	}
}
