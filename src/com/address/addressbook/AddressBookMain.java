package com.address.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to AddressBook Program in AddressBookMain");
        NewAddressBook person = new NewAddressBook();
        person.addContact(); //calling method
        System.out.println(person.createContact);
        System.out.println("Enter choice \n 1.Edit \n 2.Delete");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                person.editContact();
                System.out.println("you have entered fallowing data");
                System.out.println(person.createContact);
                System.out.println("Thank you for using AddressBook");
                break;
            case 2:
                person.deleteContact();
                System.out.println("Address Book details:" + person.createContact);
                break;
        }
    }
}
