package com;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		int attendance;
		//works till maximum working days 20.
		for(int i = 1; i <= e1.getWorkingDaysPerMonth(); i++) {
			//works till working hours cross 100.
			if(e1.getWorkedHours() <= e1.getTotalWorkingHours()) {
				attendance = e1.employeeAttendance();
				System.out.print("Day: " + i);			
				System.out.println("Day Wage: Rs. " + e1.employeeDayWage(attendance) + "\n");
			} else {
				break;
			}
		}
		e1.printMonthWage();
	}
	
}
