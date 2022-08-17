package com.bridgelabz.address_book;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program ");
        // creating a contact
        Contacts contacts1 = new Contacts("Nayana","Suresh","001 thimmarayappa garden",
                "nayanasuresh1005@gmail.com","Bangalore","Karnataka",560005,123456789);
        System.out.println(contacts1);
    }
}