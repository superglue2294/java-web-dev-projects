public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        System.out.println(garfield.isTired());
        garfield.eat();
        System.out.println(garfield.isTired());
        System.out.println(garfield.noise());
        System.out.println(garfield.catNoise());
    }
}
