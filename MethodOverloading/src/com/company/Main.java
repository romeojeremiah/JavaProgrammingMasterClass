package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(3,12));
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " score " + score + " points");
        return score + 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches  >=0 && inches <=12)){
            double feetToInches = feet*12;
            double totalInches = feetToInches + inches;
            double totalCM = totalInches * 2.54;
            return totalCM;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = (int) inches / 12;
            double inchesRemaining = (int) inches % 12;
            double centimeters = calcFeetAndInchesToCentimeters(feet, inchesRemaining);
            return centimeters;
        } else {
            return -1;
        }
    }
}
