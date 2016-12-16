package Inheritance;

/**
 * Created by artem on 15.12.2016.
 */
public class Hippo extends WildAnimal implements Ihunt {

    public Hippo(String name, int age, String habitat) {
        super(name, age, habitat);
        type="Hippo";
    }

    // реализованый метод с интерфейса
    @Override
    public String hunt() {
        return "I hunt ";
    }

    // переопределенный метод eat с абстрактного класса
    @Override
    public String eat() {
        return hunt();
    }
}
