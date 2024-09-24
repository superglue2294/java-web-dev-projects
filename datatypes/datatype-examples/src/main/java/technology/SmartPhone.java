package technology;

public class SmartPhone extends Computer {
    private boolean touchscreen;

    public SmartPhone(int releaseYear, String name, String brand, boolean touchscreen) {
        super(releaseYear, name, brand);
        this.touchscreen = touchscreen;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    @Override
    public String toString() {
        return this.getName() + " has touchscreen capabilities: " + this.touchscreen;
    }
}
