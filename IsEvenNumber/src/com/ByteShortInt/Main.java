package com.ByteShortInt;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int startNumber = 5;
        int endNumber = 30;
        while(startNumber <=endNumber){
            boolean var = isEvenNumber(startNumber);
            if(!var){
                startNumber++;
                continue;
            }

            System.out.println("even number is "+startNumber);
            startNumber++;
            count++;
            if(count >= 5){
                break;
            }

        }
        System.out.println("total number of even number "+count);
    }

    public static boolean isEvenNumber(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
}
