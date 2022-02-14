package com;

public class Employee {
	
	private int WAGE_PER_HOUR = 20;
	private int FULL_TIME_HOUR = 8;
	private int PART_TIME_HOUR = 4;
	private int salary = 0;
	private int isPresent = (int)Math.floor(Math.random() * 10) % 2;
	private int isPartTime = (int)Math.floor(Math.random() * 10) % 2;
	
	void employeeAttendance() {
		
		switch(isPresent) {	
		case 0:
			System.out.println("Employee Absent today");
			break;
		case 1:
			System.out.println("Employee Present today");
			break;
		}
	}
	
	void employeeWage() {
		
		switch(isPresent) {	
		case 0:
			break;
		case 1:
			switch(isPartTime) {
			case 0:
				salary = WAGE_PER_HOUR * FULL_TIME_HOUR;
				break;
			case 2:
				salary = WAGE_PER_HOUR * PART_TIME_HOUR;
				break;
			}			
		}
		System.out.println("Employee wage is " + salary);
	}

}
