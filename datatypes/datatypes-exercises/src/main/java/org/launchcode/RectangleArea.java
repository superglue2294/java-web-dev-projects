package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Width of rectangle: ");
        int width = scanner.nextInt();
        int area = length * width;
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is " + area);
        scanner.close();
    }
}
