package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 /5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of ( 4 % 3 )
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        boolean isAlien = false; // = assignment operator
        if(isAlien == false) // == expresses equality
            System.out.println("It is not an alien!");

    }
}
