package com.company;

public class Vehicle {
//    private String type;
//    private boolean wheels;
//    private String manufacturer;
//    private String model;
//    private int speed = 0;
//
//    //constructor
//    public Vehicle(String type, boolean wheels, String manufacturer, String model, int speed){
//        this.type = type;
//        this.wheels = wheels;
//        this.manufacturer = manufacturer;
//        this.model = model;
//        this.speed = speed;
//    }
//
//    public void increaseSpeed(int speed){
//        System.out.println("Increasing vehicle speed by " + speed);
//        this.speed += speed;
//        System.out.println("Current speed is " + this.speed);
//    }
//
//    public void decreaseSpeed(int speed){
//        System.out.println("Decreasing vehicle speed by " + speed);
//        this.speed -= speed;
//        System.out.println("Current speed is " + this.speed);
//    }
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
