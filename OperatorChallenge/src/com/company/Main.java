package com.company;

public class Main {

    public static void main(String[] args) {
        double myFirstVariable = 20.00d;
        double mySecondVariable = 80.00d;
        double myTotal = (myFirstVariable + mySecondVariable) * 100d;
        System.out.println("myTotal = " + myTotal);
        double myRemainder = myTotal % 40.00d;
        System.out.println("myRemainder = " + myRemainder);
        boolean isRemainder = (myRemainder == 0) ? true : false;
        System.out.println(isRemainder);
        if(!isRemainder){
            System.out.println("Got some remainder");
        }
    }
}
