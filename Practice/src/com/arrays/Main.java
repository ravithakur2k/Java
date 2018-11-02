package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInt = getIntegers(5);
        int[] sorted = sortIntegers(myInt);
	    printArray(sorted);
    }

    public static int[] getIntegers(int numbers){
       int[] array = new int[numbers];
        System.out.println("Enter the "+numbers+" number");
       for(int i = 0; i<array.length; i++){
           array[i] = scanner.nextInt();
       }

       return array;
    }

    public static void printArray(int[] printArray){
        for(int i =0; i<printArray.length;i++){

            System.out.println("array is "+printArray[i]);

        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            // element 0     160
            // element 1     50
            // element 2     40

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
