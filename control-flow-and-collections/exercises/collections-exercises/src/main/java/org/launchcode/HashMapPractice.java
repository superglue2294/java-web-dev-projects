package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student: ");
            newStudent = scanner.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = scanner.nextInt();
                students.put(newID, newStudent);

                scanner.nextLine();
            }
        } while (!newStudent.isBlank());

        scanner.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}