package com;

public class Employee {
	
	private int isPresent;
	private int WAGE_PER_HOUR = 20;
	private int FULL_DAY_HOUR = 8;
	private int salary = 0;
	void employeeAttendance() {
		isPresent = (int)Math.floor(Math.random() * 10) % 2;
		if(isPresent == 0) { 
			System.out.println("Employee Present today");
			employeeWage();
		} else
			System.out.println("Employee Absent today");
	}
	
	void employeeWage() {
		if(isPresent == 0)
			salary = salary + (WAGE_PER_HOUR * FULL_DAY_HOUR);
		System.out.println("Employee salary is " + salary);
	}

}
