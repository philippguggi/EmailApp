package com.PhilippGuggi.EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("E-Mail created for: " + this.firstName + " " + this.lastName);
		System.out.println();
		
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		System.out.println();
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		System.out.println();
	}

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

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity

	// Set the alternate Email

	// Change the password

}
