package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d) {
        this.lastUpdated = d;
        this.items = new ArrayList<>();
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    @Override
    public String toString() {
        String list = "The menu has the following items: \n";
        for (MenuItem item : this.items) {
            list += item.toString() + "\n";
        }
        list = list + "Menu was last updated on and at " + this.lastUpdated;

        return list;
    }
}


