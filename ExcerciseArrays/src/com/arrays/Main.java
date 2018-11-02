package com.arrays;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobile = new MobilePhone("9880304007");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        options();

        while (!quit) {
            System.out.println("\nEnter Action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            int choice = 0;

            switch (action) {
                case 0:
                    System.out.println("Shutting Down...");
                    quit = true;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateExistingContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    options();
                    break;

            }
        }

    }

    public static void options() {

        System.out.println("\nPlease select from the below Options:\npress");
        System.out.println("\t 0 - To shutdown");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add a new contact to the list");
        System.out.println("\t 3 - To update the existing contact");
        System.out.println("\t 4 - To remove a contact from the List");
        System.out.println("\t 5 - query if an existing contact exists");
        System.out.println("\t 6 - to print a list of available actions");
        System.out.println("Choose Your Action: ");

    }


    private static void startPhone() {
        System.out.println("Starting Phone....");
    }


    private static void addNewContact() {

        System.out.println("Enter the name :");
        String name = scanner.nextLine();
        System.out.println("Enter the phoneNumber : ");
        String number = scanner.nextLine();
        Contacts contact = Contacts.createNewContactRecord(name, number);
        if (mobile.addNewContact(contact) == true) {
            System.out.println("New Contact added : name = " + name + " phone Number = " + number);

        } else {
            System.out.println("Cannot add " + name + " already on file ");
        }
    }

    public static void updateExistingContact() {
        System.out.println("Enter the current contact name : ");
        String name = scanner.nextLine();
        Contacts existingContactsRecord = mobile.query(name);
        if (existingContactsRecord == null) {
            System.out.println("Record not found");
            return;
        }

        System.out.println("Enter the updated contact name : ");
        String newName = scanner.nextLine();
        System.out.println("Enter the updated contact number : ");
        String updatedContact = scanner.nextLine();
        Contacts contact = Contacts.createNewContactRecord(newName, updatedContact);

        if (mobile.modify(existingContactsRecord, contact)) {
            System.out.println("Contact Updated Successfully");
        } else {
            System.out.println("Error updating record");
        }


    }

    public static void removeContact() {
        System.out.println("Enter the current contact name : ");
        String name = scanner.nextLine();
        Contacts existingContactsRecord = mobile.query(name);
        if (existingContactsRecord == null) {
            System.out.println("Record not found");
            return;
        }

        if(mobile.remove(existingContactsRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }

    }

    public static void queryContact(){
        System.out.println("Enter the contact name ");
        String name = scanner.nextLine();
        Contacts contact = mobile.query(name);
        if(contact == null){

            System.out.println("Record not found");
            return;

        }

        System.out.println("Mobile name is "+contact.getName()+" and number is "+contact.getPhoneNumber());
    }
}
