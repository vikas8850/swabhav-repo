package com.techlab.student2;

public class StudentData {
	private int id;
	private String name;
	private int marks;

	public StudentData(int setid, String name, int marks) {
		this.id = setid;
		this.name = name;
		this.marks = marks;

	}

	public int getID() {
		
		return id;

	}

	public String getNmae() {
		return name;

	}

	public int getMarks() {
		return marks;
	}

	public void setid(int id) {
		if (id <= 0) {
			System.out.println(" Put Valide ID ");

		}

	}

	public void setname(String name) {

	}

	public void setmarks(int marks) {

	}

	public void calculateAverage(StudentData s1, StudentData s2, StudentData s3) {
		int average = this.marks + s2.marks + s3.marks / 3;
		System.out.println(" The average  of three student marks is " + average);

	}

	public void maximumMarks(StudentData s1, StudentData s2, StudentData s3) {

		if (this.marks > s2.marks && this.marks > s3.marks) {
			System.out.println("*******" + this.name + " Having Maximum Marks" + " ********");

		}

		else if (s2.marks > s3.marks) {
			System.out.println("*******" + s2.name + " Having Maximum Marks" + " ********");
		} else {
			System.out.println("*******" + s3.name + " Having Maximum Marks" + " ********");
		}
	}

}
