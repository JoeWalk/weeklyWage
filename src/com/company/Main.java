package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    final double tax = 0.8 ;
    System.out.println("What is the employee's name?");
    String name = input.next();
    System.out.println("How many hours have they worked?");
    double hoursWorked = input.nextDouble();
    System.out.println("What is there hourly wage?");
    double hourlyWage = input.nextDouble();
double overtimePay = 0.0 ;
    if (hoursWorked > 45) {
        double overtime = hoursWorked - 45 ;
        overtimePay = overtime * 1.5 * hourlyWage ;
    }

    double weeklyPay = hoursWorked * hourlyWage + overtimePay ;
    System.out.println("before tax:" + weeklyPay);
    double actualPay = weeklyPay * tax ;
    System.out.println("after tax:" + actualPay);

    }
}
