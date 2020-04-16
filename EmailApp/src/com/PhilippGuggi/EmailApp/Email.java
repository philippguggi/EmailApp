package com.PhilippGuggi.EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;

	// Constructor to receive the first and last name

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("E-Mail created for: " + this.firstName + " " + this.lastName);
		System.out.println();
		
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}

	// Ask for the department

	private String setDepartment() {
		System.out.print(
				"Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting"
				+ "\n4 for Data Entry\n5 for Customer Support\n0 for none\n\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		String department;
		switch (depChoice) {
		case 1:
			department = "Sales";
			break;

		case 2:
			department = "Development";
			break;

		case 3:
			department = "Accounting";
			break;

		case 4:
			department = "Data Entry";
			break;

		case 5:
			department = "Customer Support";
			break;

		default:
			department = "";
			break;
		}
		return department;

	}

	// Generate a random password

	// Set the mailbox capacity

	// Set the alternate Email

	// Change the password

}
