package technology;

public class Computer {
    private int releaseYear;
    private String name;
    private String brand;

    public Computer(int releaseYear, String name, String brand) {
        this.releaseYear = releaseYear;
        this.name = name;
        this.brand = brand;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
