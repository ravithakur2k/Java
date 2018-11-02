package com.ByteShortInt;

public class Main {

    public static void main(String[] args) {

       /* for (double i = 2; i < 9; i++) {
            System.out.println("calculated interest for "+i+" is equal to " + String.format("%.2f",calculateInterest(10000,i)));
        }

        for (double i = 8; i >1; i--) {
            System.out.println("calculated interest for "+i+" is equal to " + String.format("%.2f",calculateInterest(10000,i)));
        }*/
      /* boolean result = isPrime(0);
        System.out.println("result is "+result);*/
        int count=0;
        for(int i = 0; i<20; i++){
            boolean result = isPrime(i);
                if(result == true){
                    System.out.println("Prime number is "+i);
                    count++;
                }
                if(count >=3)
                    break;
            }
        }


    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));

    }

    public static boolean isPrime(int n){

        if(n ==1 || n==0){
            return false;
        }
            for(int i =2;i<=n/2;i++){
            if(n % i ==0) {
                return false;
            }

        }
        return true;

    }

}
