package org.launchcode;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean compareDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat.parse("2022-12-06");
        Date date2 = simpleDateFormat.parse("2022-12-06");
        int days = date2.compareTo(date1);

        return days > 30;
    }

    @Override
    public String toString() {
        return this.description + " is $" + this.price;
    }
}

