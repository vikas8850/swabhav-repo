package com.techlab.employee.test;

import com.techlab.employee.info.Employe;
import com.techlab.employee.info.EmployeType;

public class EmloyeeTest {
	public static void main(String[] args) {
		Employe e1=new Employe(101, "jack", "Borivali", EmployeType.PARTTIME);
		PrintInfo(e1);
		
		
	}
	public static void PrintInfo (Employe em) {
		System.out.println(em.getID());
	}

}
