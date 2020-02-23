package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long completedFactorial = factorial(3);
        int numberOfZeros = countZeros(completedFactorial);
        System.out.println("Completed Factorial: " + completedFactorial);
        System.out.println("Number of Zeros: " + numberOfZeros);
    }

    //get the factorial
    public static long factorial(long n){
        long factorial = n;
        long decrement = n-1;

        for (long i = n; i >1; i--){
            factorial *= decrement;
            decrement--;
        }
        return factorial;
    }

    public static int countZeros(long completedFactorial){
        if (completedFactorial == 0){
            return 0;
        }
        int counter = 0;
        while (completedFactorial % 10 == 0){
            counter++;
            completedFactorial /= 10;
        }
        return counter;
    }
}
