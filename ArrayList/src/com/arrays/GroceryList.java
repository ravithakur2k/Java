package com.arrays;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void groceryListItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        int size = groceryList.size();
        System.out.println("You have "+size+" items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " . " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String newItem) {

        groceryList.set(position, newItem);
        System.out.println("Grocery Item with " + position + " position has been modified with the new item " + newItem);
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }

    public String searchItem(String searchItem){

       int searchedItem =  groceryList.indexOf(searchItem);
       if(searchedItem>= 0){
          return groceryList.get(searchedItem);
       }
       return null;

    }

}
