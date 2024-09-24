package technology;

public class Program {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone(2024, "iPhone 16", "Apple", true);
        Laptop laptop = new Laptop(2023, "Lenovo IdeaPad Flex 5", "Lenovo", "Windows");
        System.out.println(phone);
        System.out.println(laptop);
    }
}
