package com.PhilippGuggi.EmailApp;

public class EmailApp {
	public static void main(String[] args) {
		Email em1 = new Email("Max", "Mustermann");
		
		em1.setAlternateEmail("philipp.guggi@gmx.net");
		System.out.println("Your alternate E-Mail is: " + em1.getAlternateEmail());
		
		em1.changePassword("ASDFO2340");
		System.out.println("Your new password is: " + em1.getPassword());
		
		em1.setMailboxCapacity(1000);
		System.out.println("Your Mailbox Capacity is " + em1.getMailboxCapacity() + " E-Mails.");
		System.out.println();
		System.out.println();
		
		Email em2 = new Email("Mark", "Mannmuster");
	}
}
