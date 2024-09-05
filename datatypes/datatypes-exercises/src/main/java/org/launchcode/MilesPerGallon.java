package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = scanner.nextDouble();
        System.out.println("How many gallons did you consume?");
        double gallons = scanner.nextDouble();
        double milesPerGallon = miles / gallons;
        System.out.println("Your miles per gallon is " + milesPerGallon);
        scanner.close();
    }
}
