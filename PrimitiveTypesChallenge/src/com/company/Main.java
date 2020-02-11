package com.company;

public class Main {

    public static void main(String[] args) {
	    byte myByte = 100;
	    short myShort = 12000;
	    int myInt = 1235687;
	    long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
