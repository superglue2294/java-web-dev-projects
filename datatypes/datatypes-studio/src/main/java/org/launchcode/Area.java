package org.launchcode;

import java.util.Scanner;

import static java.lang.Double.isNaN;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double radius = scanner.nextDouble();

        while (true) {
            if (radius < 0) {
                System.out.println("Radius cannot be a negative number.");
                System.out.println("Enter a radius: ");
                radius = scanner.nextDouble();
            }

            if (isNaN(radius)) {
                System.out.println("Please enter a positive number.");
                break;
            }

            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
            scanner.close();
            break;
        }

    }
}
