package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private int capacity;
    private String capacityUnit;
    private String contents;
    private int[] spinRate;

    public BaseDisc(String name, int capacity, String capacityUnit, String contents, int[] spinRate) {
        this.name = name;
        this.capacity = capacity;
        this.capacityUnit = capacityUnit;
        this.contents = contents;
        this.spinRate = spinRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCapacityUnit() {
        return capacityUnit;
    }

    public void setCapacityUnit(String capacityUnit) {
        this.capacityUnit = capacityUnit;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int[] getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int[] spinRate) {
        this.spinRate = spinRate;
    }
}
