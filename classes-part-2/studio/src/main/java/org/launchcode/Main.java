package org.launchcode;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MenuItem item1 = new MenuItem(4.00, "Eggs", "appetizer", true);
        ArrayList<MenuItem> items = new ArrayList<>();

        Menu menu = new Menu(Date.valueOf(LocalDate.now()));
        menu.addItem(item1);
        System.out.println(menu);
        menu.removeItem(item1);
        System.out.println(menu);
    }
}
