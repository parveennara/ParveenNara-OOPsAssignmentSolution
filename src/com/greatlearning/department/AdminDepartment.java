package com.greatlearning.department;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public void displayOutput() {
		System.out.println ("Welcome to " + departmentName());
		System.out.println (getTodaysWork());
		System.out.println (getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}

}
