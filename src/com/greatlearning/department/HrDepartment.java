package com.greatlearning.department;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "Team lunch";
	}
	
	public void displayOutput() {
		System.out.println("Welcome to " + departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}

}
