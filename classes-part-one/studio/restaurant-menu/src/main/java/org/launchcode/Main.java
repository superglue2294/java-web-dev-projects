package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem egg = new MenuItem("Egg", 2.25, "Eggs that are made to order", "appetizer", true);
        MenuItem toast = new MenuItem("Toast", 1.25, "Toast with or without butter and butter", "appetizer", false);
        MenuItem sandwich = new MenuItem("Sandwich", 5.50, "Sandwich with choice of meat and veggies", "main course", false);
        MenuItem pudding = new MenuItem("Pudding", 2.50, "Pudding of choice of chocolate or banana", "dessert", true);
        System.out.println(egg.toString());
        Menu menu = new Menu();
        System.out.println(menu.getLastUpdated());
        menu.addItem(egg);
        System.out.println(menu.getLastUpdated());
        menu.addItem(toast);
        System.out.println(menu.getLastUpdated());
        menu.addItem(sandwich);
        menu.addItem(pudding);
        System.out.println(menu.getLastUpdated());
    }
}
