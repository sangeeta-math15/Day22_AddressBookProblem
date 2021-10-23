package com.address.addressbook;

import java.util.Scanner;

public class NewAddressBook {
    Scanner sc=new Scanner(System.in);
    public void addContact(){
        CreateContact createContact=new CreateContact();
        System.out.println("Enter First name");
        String firstName=sc.nextLine();
        System.out.println("Enter Last Name");
        String lastName=sc.nextLine();
        System.out.println("Enter AddressCity:");
        String addressCity=sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code : ");
        Long zip = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your EMail ID: ");
        String email = sc.nextLine();
        createContact.setFirstName(firstName);
        createContact.setLastName(lastName);
        createContact.setAddressCity(addressCity);
        createContact.setState(state);
        createContact.setZip(zip.intValue());
        createContact.setPhoneNumber(phoneNumber.intValue());
        createContact.setEmail(email);
        System.out.println("The Contact Details of " + firstName + " "+lastName +"\n" + createContact);

    }
}
