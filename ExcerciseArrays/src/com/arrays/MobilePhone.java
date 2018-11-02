package com.arrays;

import java.util.ArrayList;

public class MobilePhone {

    private String myNum;

    private ArrayList<Contacts> contacts;

    public MobilePhone(String myNum) {
        this.myNum = myNum;
        this.contacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("contact is already on file.");
            return false;
        }

        contacts.add(contact);
        return true;

    }

    public boolean modify(Contacts oldContact, Contacts newContact) {

        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else {

            if(findContact(newContact.getName()) >0){

                System.out.println("Contact name "+newContact.getName()+" already exist. Update Not successful");
                return false;

            }
        }

        this.contacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;

    }



    /*private int findContact(String name){

       int index =  contacts.indexOf(name);
        if(index >= 0){
            return index;
        }
        return index;
    }*/

    private int findContact(Contacts contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i = 0; i < this.contacts.size(); i++) {
            Contacts contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }

        return -1;

    }

    public boolean remove(Contacts contact) {
        int position = findContact(contact);
        if (position >= 0) {
            this.contacts.remove(position);
            System.out.println(contact.getName() + " was deleted from the list");
            return true;
        } else {
            System.out.println(contact.getName() + "was not found");
            return false;
        }

        // contacts.remove(number);


    }

    public String query(Contacts contact) {

        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts query(String name){
        int position = findContact(name);
            if(position >= 0){
                return this.contacts.get(position);
            }
            return null;
        }


    public void printContacts(){
        System.out.println("Contacts List : ");
        for(int i = 0 ;i < this.contacts.size();i++){
            System.out.println((i+1)+" . "+this.contacts.get(i).getName()+ "-->"+ this.contacts.get(i).getPhoneNumber());
        }
    }


}
