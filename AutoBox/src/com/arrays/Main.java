package com.arrays;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i=0;i<=10;i++){
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i =0; i<integerArrayList.size();i++){
            System.out.println("Array list value is "+integerArrayList.get(i).intValue());
        }


    }
}
