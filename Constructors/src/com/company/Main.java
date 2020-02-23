package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	BankAccount romeo = new BankAccount(1234, 1000.00, "Romeo Jeremiah", "hello@myworld.com", "134-1234-1234" );
//	Scanner scanner = new Scanner(System.in);
//
//        System.out.println("The name on this account is " + romeo.getCustomerName());
//        System.out.println("The balance in this account is " + romeo.getBalance());
//
//        System.out.println("Making a withdrawal of :" );
//        double amountWithdrawn = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Withdrawing: " + amountWithdrawn);
//        System.out.println("Updated balance is " + romeo.makeWithdrawal(amountWithdrawn));

//        VipCustomer romeo = new VipCustomer("Romeo", 1000.00, "romeo@test.com");
//        System.out.println("Romeo customer details:" + romeo.getName() + " " +
//                romeo.getCreditLimit() + " " + romeo.getEmail());
//        VipCustomer tammy = new VipCustomer("Tammy", 800.00);
//        System.out.println("Tammy customer details:" + tammy.getName() + " " +
//                tammy.getCreditLimit() + " " + tammy.getEmail());
//        VipCustomer defaultCustomer = new VipCustomer();
//        System.out.println("Default customer details:" + defaultCustomer.getName() + " " +
//                defaultCustomer.getCreditLimit() + " " + defaultCustomer.getEmail());

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)=" + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
