package com.techlab.student.test;

import com.techlab.student.Branch;
import com.techlab.student.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(101, "joy", "mumbai", Branch.BCOM);
		PrintInfo(s1);
	}
	 
	public static void PrintInfo(Student d) {
		System.out.println(  "STUDENT ID  " +       d.getId());
		System.out.println(  "STUDENT NMAE  " +     d.getName());
		System.out.println(  "STUDENT ADDRES " +  d.getAddres());
		System.out.println(  " STUDENT BRANCH  " +   d.getBranch());
		
	}

}

