package com;

public class Employee {
	
	private int WAGE_PER_HOUR = 20;
	private int FULL_TIME_HOUR = 8;
	private int PART_TIME_HOUR = 4;
	private int WORKING_DAYS_PER_MONTH = 20;
	private int TOTAL_WORKING_HOURS = 100;
	private int salary = 0;
	private int workedHours = 0;
	
	
	int getWorkingDaysPerMonth(){
		return WORKING_DAYS_PER_MONTH;
	}
	
	int getTotalWorkingHours() {
		return TOTAL_WORKING_HOURS;
	}
	
	int getEmployeeSalary() {
		return salary;
	}
	
	int getWorkedHours() {
		return workedHours;
	}
	
	int employeeAttendance() {
		int isPresent = (int)Math.floor(Math.random() * 100) % 3;
		return isPresent;
	}
	
	int employeeDayWage(int isPresent) {
		int dayWage = 0;
		switch(isPresent) {	
		case 2:
			System.out.println(" - Present and Working full time.");
			dayWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
			salary = salary + ( WAGE_PER_HOUR * FULL_TIME_HOUR );
			workedHours = workedHours + FULL_TIME_HOUR;
			break;
		case 1:
			System.out.println(" - Present and Working part time.");
			dayWage = WAGE_PER_HOUR * PART_TIME_HOUR;
			salary = salary + ( WAGE_PER_HOUR * PART_TIME_HOUR );
			workedHours = workedHours + PART_TIME_HOUR;
			break;
		case 0:
			System.out.println(" - Absent.");
			break;
		}
		System.out.println("Worked " + workedHours + " hours so far.");
		return dayWage;
	}
	
	void printMonthWage(){
		System.out.println("Employee worked " + workedHours + " hours and earned Rs. " + salary + " this month.");
	}

}
