package org.launchcode;

import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner scanner = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        String search = scanner.nextLine();
        boolean isFound = sentence.toLowerCase().contains(search.toLowerCase());
        System.out.println("The word " + search + " was found in the sentence: " + isFound);
        Integer index = sentence.indexOf(search);
        Integer length = search.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String removeWord = sentence.toLowerCase().replace(search.toLowerCase(), "");
        System.out.println(removeWord);
        scanner.close();

    }
}
