package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 60){
            return "Invalid value";
        } else {
            int totalSeconds = (minutes * 60) + seconds;
            int hours = (int) (totalSeconds / 3600);
            minutes = (int)(totalSeconds % 3600) / 60;
            seconds = (int)((totalSeconds % 3600) % 60 ) % 60;
            return hours+"h " + minutes + "m " + seconds + "s";
        }
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        } else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
    }
}
