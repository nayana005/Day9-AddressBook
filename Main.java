package com.bridgelabz.address_book;

public class Main {

	public static void main(String[] args) {

		AddressBook addressBook = new AddressBook();
		System.out.println("Welcome to Address Book Program ");
		addressBook.addNewContacts();
		addressBook.showContacts();
	}
}