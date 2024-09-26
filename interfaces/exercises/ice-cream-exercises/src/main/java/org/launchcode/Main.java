package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
//        System.out.println(flavors);
        flavors.sort(new FlavorComparator());
//        System.out.println(flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
//        System.out.println(cones);
        cones.sort(new ConeComparator());
//        System.out.println(cones);

        toppings.sort(new ToppingComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Flavor sorted by most to least allergens: ");
        System.out.println(flavors);
        System.out.println();
        System.out.println("Cones sorted by cost (least to most): ");
        System.out.println(cones);
        System.out.println();
        System.out.println("Toppings sorted alphabetically: ");
        System.out.println(toppings);
    }
}