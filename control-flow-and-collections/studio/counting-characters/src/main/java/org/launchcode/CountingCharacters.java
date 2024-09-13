package org.launchcode;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a file: ");
        String fileName = scanner.nextLine();

//        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";
        try {
//            System.out.println("Please enter something: ");
//            String phrase = scanner.nextLine();
            File myObj = new File("C:\\Users\\vutri\\LaunchCode\\java\\control-flow-and-collections\\studio\\counting-characters\\src\\main\\java\\org\\launchcode\\" + fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String phrase = myReader.nextLine();
                char[] charactersInString = phrase.toLowerCase().toCharArray();

                for (Character character : charactersInString) {
                    Pattern pattern = Pattern.compile("[a-z]");
                    Matcher matcher = pattern.matcher(Character.toString(character));
                    if (matcher.matches()) {
                        if (characters.containsKey(character)) {
                            characters.put(character, characters.get(character) + 1);
                        } else {
                            characters.put(character, 1);
                        }
                    }
                }

                for (HashMap.Entry<Character, Integer> character : characters.entrySet()) {
                    System.out.println(character.getKey() + ": " + character.getValue());
                }

                scanner.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
