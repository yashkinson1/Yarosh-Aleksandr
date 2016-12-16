package Polymorphism;

/**
 * Created by artem on 15.12.2016.
 */
public class Man extends Human {

    public Man(String name, int age) {
        super(name, age);
    }

    //преопределяющий метод с абстрактного класса
    @Override
    public void run() {
        System.out.println("speed man " + speed);
    }
}
