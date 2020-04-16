package com.PhilippGuggi.EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "company.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		this.department = setDepartment();

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "."
				+ companySuffix;
	}

	private String setDepartment() {
		System.out
				.print("New worker: " + firstName + ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting"
						+ "\n4 for Data Entry\n5 for Customer Support\n0 for none\n\nEnter department code: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Development";
		} else if (depChoice == 3) {
			return "Accounting";
		} else if (depChoice == 4) {
			return "Data Entry";
		} else if (depChoice == 5) {
			return "Customer Support";
		} else {
			return "";
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + "\nCompany E-Mail: " + email + "\nMailbox Capacity: "
				+ mailboxCapacity + "mb";
	}
}
