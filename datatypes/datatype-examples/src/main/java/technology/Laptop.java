package technology;

public class Laptop extends Computer {
    private String opSys;

    public Laptop(int releaseYear, String name, String brand, String opSys) {
        super(releaseYear, name, brand);
        this.opSys = opSys;
    }

    public String getOpSys() {
        return opSys;
    }

    public void setOpSys(String opSys) {
        this.opSys = opSys;
    }

    @Override
    public String toString() {
        return this.getName() + " runs on this operating system: " + this.opSys;
    }
}
