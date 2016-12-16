package Polymorphism;

/**
 * Created by artem on 15.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Man man = new Man("Alex", 25);
        Sportsman sportsman = new Sportsman("Jarex", 27, 2);
        man.Information();
        man.run();
        sportsman.Information();
        sportsman.run();
        man.setAge(40);
        man.Information();
    }
}
