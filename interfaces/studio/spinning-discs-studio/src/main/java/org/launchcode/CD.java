package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private static final String DISC_TYPE = "CD";

    public CD(String name, int capacity, String capacityUnit, String contents, int[] spinRate) {
        super(name, capacity, capacityUnit, contents, spinRate);
    }

    public String getDiscType() {
        return DISC_TYPE;
    }

    @Override
    public void spinDisc() {
        System.out.println("A " + this.getDiscType() + " spins at a rate of " + this.getSpinRate()[0] + " - " + this.getSpinRate()[1] + " rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("A " + this.getDiscType() + " can store up to " + this.getCapacity() + this.getCapacityUnit() + " of data.");
    }

    @Override
    public void writeToDisc(String info) {
        this.setContents(info);
    }

    @Override
    public void readFromDisc() {
        System.out.println("The contents of the " + this.getDiscType() + " is the following: \n" + this.getContents());
    }

    @Override
    public void loadDisc() {
        System.out.println("Name: " + this.getName() + "\n" + "Capacity: " + this.getCapacity() + this.getCapacityUnit() + "\n" + "Content: " + this.getContents() + "\n" + "Disc Type: " + this.getDiscType());
    }
}
