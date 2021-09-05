package com.greatlearning.department;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		int department;
		
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Please enter a Department number from the following:");
		System.out.println ("1. Admin Department");
		System.out.println ("2. Hr Department");
		System.out.println ("3. Tech Department");
		
		department = sc.nextInt();
		
		if (department == 1) {
			adminDepartment.displayOutput();
		}
		else if (department == 2) {
			hrDepartment.displayOutput();
		}
		else if (department == 3) {
			techDepartment.displayOutput();
		}
		else
			System.out.println ("Please enter a valid Department number");
		
		sc.close();

	}

}
