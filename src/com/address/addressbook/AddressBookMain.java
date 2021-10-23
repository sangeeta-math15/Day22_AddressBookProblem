package com.address.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program in AddressBookMain");
        CreateContact createContact=new CreateContact();
        createContact.setFirstName("Sangeeta");
        createContact.setLastName("Math");
        createContact.setAddressCity("Banglore");
        createContact.setEmail("sngtmth@gamil.com");
        createContact.setState("Karnataka");
        createContact.setZip(123434);
        createContact.setPhoneNumber(7865345623L);
        System.out.println("Create Contact  " +createContact);
    }
}
