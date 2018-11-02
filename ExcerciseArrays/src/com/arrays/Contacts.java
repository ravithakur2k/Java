package com.arrays;

import java.util.ArrayList;

public class Contacts {

   /* private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> phoneNumber = new ArrayList<String>();*/

   private String name;
   private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contacts createNewContactRecord(String name, String phoneNumber){

            return new Contacts(name,phoneNumber);

    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
