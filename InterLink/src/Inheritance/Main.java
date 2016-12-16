package Inheritance;

/**
 * Created by artem on 15.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 5 , "Alex");
        Cat cat = new Cat("Murka", 4, "Alex" );
        Crocodile crocodile = new Crocodile("Jax", 10, "river");
        Hippo hippo = new Hippo("Bot", 9, "river");

        cat.isMeow(true);
        System.out.println("Cat " + cat.playing());
        System.out.println("Dog " + dog.playing());
        System.out.println("Crocodile " + crocodile.swim());
        System.out.println("Hippo " + hippo.swim());
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(crocodile.toString());
        System.out.println(hippo.toString());

    }
}
