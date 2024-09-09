package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        int sum = sumEven(nums);
        System.out.println(sum);

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("how");
        words.add("are");
        words.add("you");
        words.add("doing");

        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> greenEggsList = new ArrayList<>(Arrays.asList(greenEggs.split(" ")));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int length = scanner.nextInt();

//        fiveLetterWords(words, length);
        fiveLetterWords(greenEggsList, length);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void fiveLetterWords(ArrayList<String> arr, int length) {
        for (String word : arr) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}

