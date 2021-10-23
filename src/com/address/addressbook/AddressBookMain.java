package com.address.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program in AddressBookMain");
        NewAddressBook person=new NewAddressBook();
        person.addContact();
        System.out.println("Enter Y to Edit the Contact");
        Scanner sc=new Scanner(System.in);
        String op=sc.nextLine();
        if(op.equals("y") || op.equals("Y")){
            Object perName = person.editContact();
            System.out.println("You have Entered following data");
            System.out.println("The Contact Details After Editing:" +perName);
        }
    }
}
