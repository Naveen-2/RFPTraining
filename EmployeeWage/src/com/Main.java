package com;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		int attendance;
		for(int i = 1; i <= e1.getWorkingDaysPerMonth(); i++) {
			attendance = e1.employeeAttendance();
			System.out.println("Day: " + i);			
			System.out.println("Day Wage: " + e1.employeeDayWage(attendance) + "\n");
		}
		e1.printMonthWage();
	}
	
}
