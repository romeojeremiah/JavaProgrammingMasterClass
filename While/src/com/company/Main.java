package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
        int number = 56;
        int finishNumber = 100;
        int count = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count == 5){
                break;
            }
        }
        System.out.println("Found " + count + " even numbers.");

    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
