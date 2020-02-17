package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break; //break keyword is required.
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char letter = 'F';

        switch (letter){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Letter was found. It was the letter " + letter);
                break;
            default:
                System.out.println("Letter not found!");
                break;
        }

        // More code here
        //Switch can be used with String, byte, char, short, and int
     }
}
