package com.PhilippGuggi.EmailApp;

public class EmailApp {
	public static void main(String[] args) {
		Email em1 = new Email("Max", "Mustermann");
		System.out.println(em1.showInfo());
		System.out.println();
		System.out.println();
		
		Email em2 = new Email ("Muster", "Mark");
		System.out.println(em2.showInfo());
		System.out.println();
		System.out.println();
	}
}
