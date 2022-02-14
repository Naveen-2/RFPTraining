package com;

public class Employee {
	void employeeAttendance() {
		int isPresent;
		isPresent = (int)Math.floor(Math.random() * 10);
		if(isPresent % 2 == 0) 
			System.out.println("Employee Present today");
		else
			System.out.println("Employee Absent today");
	}
}
