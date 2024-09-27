package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("a", 700, "MB", "dkfj", new int[]{200, 500});
        DVD dvd = new DVD("b", 17, "GB", "kjd", new int[]{570, 1600});

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.storeData();
        dvd.storeData();

        cd.writeToDisc("song1");
        dvd.writeToDisc("video1");
        cd.readFromDisc();
        dvd.readFromDisc();

        cd.loadDisc();
        dvd.loadDisc();
    }
}