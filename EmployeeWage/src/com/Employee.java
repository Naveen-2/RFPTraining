package com;

public class Employee {
	
	private int WAGE_PER_HOUR = 20;
	private int FULL_TIME_HOUR = 8;
	private int PART_TIME_HOUR = 4;
	private int WORKING_DAYS_PER_MONTH = 20;
	private int salary = 0;
	
	
	int getWorkingDaysPerMonth(){
		return WORKING_DAYS_PER_MONTH;
	}
	
	int getEmployeeSalary() {
		return salary;
	}
	
	int employeeAttendance() {
		int isPresent = (int)Math.floor(Math.random() * 100) % 3;
		return isPresent;
	}
	
	int employeeDayWage(int isPresent) {
		int dayWage = 0;
		switch(isPresent) {	
		case 2:
			System.out.println("Present and Working full time.");
			dayWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
			salary = salary + ( WAGE_PER_HOUR * FULL_TIME_HOUR );
			break;
		case 1:
			System.out.println("Present and Working part time.");
			dayWage = WAGE_PER_HOUR * PART_TIME_HOUR;
			salary = salary + ( WAGE_PER_HOUR * PART_TIME_HOUR );
			break;
		case 0:
			System.out.println("Absent.");
			break;
		}
		return dayWage;
	}
	void printMonthWage(){
		System.out.println("Employee salary for this month is " + salary);
	}

}
