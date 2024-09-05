package org.launchcode;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String user = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, " + user + "!");
    }
}
