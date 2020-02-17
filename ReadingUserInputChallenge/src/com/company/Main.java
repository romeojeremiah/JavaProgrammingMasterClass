package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int runningSum = 0;
        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean isInt = scanner.hasNextInt();
            if (!isInt) {
                System.out.println("Invalid Number");
            } else {
                int number = scanner.nextInt();
                runningSum += number;
                count++;
            }
            scanner.nextLine();

        }
        scanner.close();
        System.out.println("Total is " + runningSum);
    }
}
