package com.tech.lab.epmployeetest;

import com.tech.lab.employee.Employee;
import com.tech.lab.employee.EmployeeType;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee(-102, "", "12:3:1993", EmployeeType.PARMENT);
	PrintInfo(e1);
		
		
		
	}
	
	public static void PrintInfo(Employee e) {
		System.out.println(" The ID :"  +  e.getID());
		System.out.println("The name is:-  " +e.getName());
		System.out.println(" The DoB:-" + e.getDob());
		System.out.println("The employee type :-" + e.getEmploye());
		
		
	}
	
	

}
