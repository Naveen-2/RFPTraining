package com;

public class Employee {
	
	private int WAGE_PER_HOUR = 20;
	private int FULL_TIME_HOUR = 8;
	private int PART_TIME_HOUR = 4;
	private int salary = 0;
	private int isPresent = (int)Math.floor(Math.random() * 10) % 2;
	private int isPartTime = (int)Math.floor(Math.random() * 10) % 2;
	
	void employeeAttendance() {
		
		if(isPresent == 1) 
			System.out.println("Employee Present today");
		else
			System.out.println("Employee Absent today");
		
	}
	
	void employeeWage() {
		
		if(isPresent == 1) 
			salary = salary + (WAGE_PER_HOUR * ((isPartTime == 1) ? PART_TIME_HOUR : FULL_TIME_HOUR ));
		System.out.println("Employee wage is " + salary);
	
	}

}
