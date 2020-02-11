package com.company;

public class BarkingDog {

    public static void main(String[] args) {
	bark(false,6);
    }

    public static boolean bark(boolean barking, int hourOfDay){
        if ((hourOfDay > 0) && (hourOfDay <= 23)){
            if (hourOfDay < 8 || hourOfDay > 22){
                barking = true;
            } else {
                barking = false;
            }

        } else {
            barking = false;
        }
        return barking;
    }
}
