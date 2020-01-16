package com.techlab.student.test;

import com.techlab.student2.StudentData;

public class StudentTest { 
public static void main(String[] args) {
	StudentData s1 = new  StudentData(-1, "yavu", 10);
	StudentData s2 = new  StudentData(2, "jatin", 200);
	StudentData s3 = new StudentData(3,"sam" ,60);
	
	//printInfoStudent(s1);
	//printInfoStudent();
	printInfoStudent(s3);
	s1.calculateAverage(s1, s2, s3);
	s1.maximumMarks(s1, s2, s3);
	
	
	
	
	
	
	
}


public static void  printInfoStudent(StudentData s1) {
	System.out.println(    "<====== The student info  printing====>  "  );
	System.out.println("             The id is :- " + s1.getID());
	System.out.println("            The name is :-" + s1.getNmae());
	System.out.println("            The marks is :- " + s1.getMarks());
	
	
	
}
}


