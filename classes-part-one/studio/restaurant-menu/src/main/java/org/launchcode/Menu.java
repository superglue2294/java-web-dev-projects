package org.launchcode;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Menu {
    private List<MenuItem> menu;
    private String lastUpdated;

    public Menu() {
        this.menu = new ArrayList<>();
        setLastUpdated();
    }

    public void addItem(MenuItem item) {
        this.menu.add(item);
        setLastUpdated();
    }

    public void setLastUpdated() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        this.lastUpdated = myDateObj.format(myFormatObj);
    }

    public String getLastUpdated() {
        String list = "The menu has the following items: \n";
        for (MenuItem item : this.menu) {
            list += item.toString() + "\n";
        }
        list = list + "Menu was last updated on and at " + this.lastUpdated;

        return list;
    }
}
